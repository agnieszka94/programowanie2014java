package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;
/**
 * Examples of redefining equals and its impact on storing objects.
 * 
 * @author kozik
 *
 */
public class Class03RedefiningEquals {

	public static class A {
		private static int i = 0;
		int id = i++;

		public String toString() {
			return "" + id;
		}

		public boolean equals(Object o) {
			if (!(o instanceof A) || ((A) o).id != id)
				return false;
			return true;
		}
	}

	/**
	 * Class implementing CRAZY equals method - one should never do that.
	 * 
	 * @author kozik
	 * 
	 */
	public static class B {
		public static Random rG = new Random();
		private static int i = 10;
		int id = i++;

		public String toString() {
			return "" + id;
		}

		public boolean equals(Object o) {
			return rG.nextInt(100) < 8;
		}
	}

	public static <T> void test(Collection<T> col, Class<T> kind) {
		T temp = null;
		for (int i = 0; i < 10; i++)
			try {
				temp = kind.newInstance();
				col.add(temp);
			} catch (Exception e) {
				System.out.println("FAIL");
			}
		System.out.println("" + col + "  " + col.contains(temp));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test(new LinkedList<A>(), A.class);
		test(new LinkedList<B>(), B.class);
		test(new LinkedList<B>(), B.class);
		test(new LinkedList<B>(), B.class);
		test(new LinkedList<B>(), B.class);
		test(new LinkedList<B>(), B.class);
		test(new LinkedList<B>(), B.class);
	}

}
