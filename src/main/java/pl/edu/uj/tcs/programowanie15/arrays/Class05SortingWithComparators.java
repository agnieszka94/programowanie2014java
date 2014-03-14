package pl.edu.uj.tcs.programowanie15.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
/**
 * Sorting arrays with custom comparators.
 * 
 * @author kozik
 *
 */
public class Class05SortingWithComparators {

	public static class A implements Comparable<A> {
		private static Random rG = new Random();
		int i;

		public A() {
			this(rG.nextInt(100));
		}

		public A(int i) {
			this.i = i;
		}

		public int compareTo(A a) {
			return i - a.i;
		}

		public String toString() {
			return "" + i;
		}
	}

	public static class CompA implements Comparator<A> {
		private static Random rG = new Random();

		public int compare(A a, A b) {
			return rG.nextInt(3) - 1;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A[] temp1 = new A[10];
		for (int i = 0; i < 10; i++)
			temp1[i] = new A();
		System.out.println(Arrays.toString(temp1));
		Arrays.sort(temp1);
		System.out.println(Arrays.toString(temp1));
		Arrays.sort(temp1, new CompA());
		System.out.println(Arrays.toString(temp1));
	}

}
