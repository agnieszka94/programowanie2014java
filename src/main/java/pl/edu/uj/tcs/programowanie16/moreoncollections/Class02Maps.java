package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
/**
 * Examples of using classes implementing Map.
 * 
 * @author kozik
 *
 */
public class Class02Maps {

	public static class A {
		int i;

		public A(int i) {
			this.i = i;
		}

		public String toString() {
			return "" + i;
		}
	}
	/**
	 * A class implementing Comparable but not implementing a compatible equals. 
	 * Such classes violate the contract on Set when used with TreeSet.
	 * 
	 * @author kozik
	 *
	 */

	public static class BadExampleDoNotDoIt implements
			Comparable<BadExampleDoNotDoIt> {
		int i;

		public BadExampleDoNotDoIt(int i) {
			this.i = i;
		}

		public int compareTo(BadExampleDoNotDoIt b) {
			return b.i < i ? -1 : (b.i > i ? 1 : 0);
		}

		public String toString() {
			return "" + i;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<A, A> temp1 = new HashMap<A, A>();
		temp1.put(new A(1), new A(2));
		temp1.put(new A(1), new A(2));
		temp1.put(new A(1), new A(3));
		temp1.put(new A(10), new A(20));
		temp1.put(new A(10), new A(30));
		System.out.println(temp1.getClass().getSimpleName() + " " + temp1);
		temp1 = new IdentityHashMap<A, A>();
		temp1.put(new A(1), new A(2));
		temp1.put(new A(1), new A(2));
		temp1.put(new A(1), new A(3));
		temp1.put(new A(10), new A(20));
		temp1.put(new A(10), new A(30));
		System.out.println(temp1.getClass().getSimpleName() + " " + temp1);
		temp1 = new LinkedHashMap<A, A>();
		temp1.put(new A(1), new A(2));
		temp1.put(new A(1), new A(2));
		temp1.put(new A(1), new A(3));
		temp1.put(new A(10), new A(20));
		temp1.put(new A(10), new A(30));
		System.out.println(temp1.getClass().getSimpleName() + " " + temp1);
		temp1 = new TreeMap<A, A>();
		try {
			temp1.put(new A(1), new A(2));
		} catch (Exception e) {
			System.out.println("problem " + e);
		}
		System.out.println(temp1.getClass().getSimpleName() + " " + temp1);
		try {
			temp1.put(new A(1), new A(2));
		} catch (Exception e) {
			System.out.println("problem " + e);
		}
		System.out.println(temp1.getClass().getSimpleName() + " " + temp1);
		Map<BadExampleDoNotDoIt, A> temp2 = new TreeMap<BadExampleDoNotDoIt, A>();
		temp2.put(new BadExampleDoNotDoIt(1), new A(2));
		temp2.put(new BadExampleDoNotDoIt(1), new A(2));
		temp2.put(new BadExampleDoNotDoIt(1), new A(3));
		temp2.put(new BadExampleDoNotDoIt(10), new A(20));
		temp2.put(new BadExampleDoNotDoIt(10), new A(30));
		System.out.println(temp2.getClass().getSimpleName() + " " + temp2);
	}

}
