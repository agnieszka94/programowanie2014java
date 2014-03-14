package pl.edu.uj.tcs.programowanie14.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
/**
 * An example of implementing a generic interface and deriving from a generic class.
 * 
 * @author marcin
 *
 * @param <T>
 */
@SuppressWarnings("serial")
public class Class04RandomHashSet<T> extends HashSet<T> implements
		Class03RandomSet<T> {

	private final Random rG = new Random();

	Class04RandomHashSet() {
	}

	Class04RandomHashSet(Collection<? extends T> col) {
		super(col);
	}

	Class04RandomHashSet(int i) {
		super(i);
	}

	Class04RandomHashSet(int i, float f) {
		super(i, f);
	}

	public T getRandom() {
		int ind = rG.nextInt(this.size());
		for (T o : this)
			if (ind-- <= 0)
				return o;
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class03RandomSet<Integer> temp = new Class04RandomHashSet<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(temp.getRandom());
		System.out.println(temp.getRandom());
		System.out.println(temp.getRandom());
		System.out.println(temp.getRandom());
		System.out.println(temp.getRandom());
	}

}
