package pl.edu.uj.tcs.programowanie10.nestedclasses;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
/**
 * A class storing integers using inner class to iterate the collection.
 * 
 * @author kozik
 *
 */
public class Class03LinkWithOuterPile implements Iterable<Integer> {

	private class pileBrowser implements Iterator<Integer> { // private (sic!)
		private int i = 0;

		@Override
		public Integer next() {
			if (i >= pile.length) throw new NoSuchElementException();
			return pile[i++];
		}

		@Override
		public boolean hasNext() {
			return i < pile.length;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	private final Random rG = new Random();
	private int[] pile = new int[0];

	@Override
	public Iterator<Integer> iterator() {
		return new pileBrowser();
	}

	public Integer next() {
		int[] oldPile = pile;
		pile = new int[pile.length + 1];
		System.arraycopy(oldPile, 0, pile, 0, oldPile.length);
		pile[oldPile.length] = rG.nextInt(17);
		return pile[oldPile.length];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random tempRand = new Random();
		Class03LinkWithOuterPile tempPile = new Class03LinkWithOuterPile();
		for (int i = 0; i < 5; i++)
			System.out.println("Putting on the pile: " + tempPile.next());
		for (int i : tempPile)
			System.out.println("Browsing the pile: " + i);
		Iterator<Integer> itOne = tempPile.iterator(), itTwo = tempPile
				.iterator();
		for (int i = 0; i < 10; i++) {
			if ((tempRand.nextBoolean() && itOne.hasNext() || !itTwo.hasNext())) {
				System.out.println("Iterator one: " + itOne.next());
				continue;
			}
			System.out.println("Iterator two: " + itTwo.next());
		}
	}

}
