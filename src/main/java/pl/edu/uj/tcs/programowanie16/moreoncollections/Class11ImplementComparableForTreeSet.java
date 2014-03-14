package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/**
 * Using a TreeSet requires a Comparator or a Comparable<T> interface.
 * These should be implemented correctly. 
 * 
 * @author marcin
 *
 */
public class Class11ImplementComparableForTreeSet {

	public static class A implements Comparable<A> {
		public float f;
		
		public A(float f) {
			this.f = f;
		}

		public int compareTo(A a) {
			return Float.compare(f, a.f);
		}

		public String toString() {
			return "" + f;
		}
	}

	public static class CompA implements Comparator<A> {
		public int compare(A a, A b) {
			return -1;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<A> temp1 = new TreeSet<A>();
		temp1.add(new A(1));
		temp1.add(new A(2));
		temp1.add(new A(1));
		temp1.add(new A(2));
		temp1.add(new A(Float.NaN));
		System.out.println(temp1);
		System.out.println(temp1.contains(new A(1)));
		temp1 = new TreeSet<A>(new CompA());
		temp1.add(new A(1));
		temp1.add(new A(2));
		temp1.add(new A(1));
		temp1.add(new A(2));
		temp1.add(new A(Float.NaN));
		System.out.println(temp1);
		System.out.println(temp1.contains(new A(1)));
	}

}
