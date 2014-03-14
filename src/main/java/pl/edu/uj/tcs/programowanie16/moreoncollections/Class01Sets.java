package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
/**
 * Examples of classes implementing Set.
 * 
 * @author kozik
 *
 */
public class Class01Sets {

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
		Set<A> temp1 = new HashSet<A>();
		temp1.add(new A(100000000));
		temp1.add(new A(1));
		temp1.add(new A(10000));
		temp1.add(new A(1));
		temp1.add(new A(1));
		System.out.println(temp1.getClass().getSimpleName() + " " + temp1);
		temp1 = new LinkedHashSet<A>();
		temp1.add(new A(100000000));
		temp1.add(new A(1));
		temp1.add(new A(10000));
		temp1.add(new A(1));
		temp1.add(new A(1));
		System.out.println(temp1.getClass().getSimpleName() + " " + temp1);
		temp1 = new TreeSet<A>();
		try {
			temp1.add(new A(100000000));
		} catch (Exception e) {
			System.out.println("problem " + e);
		}
		System.out.println(temp1.getClass().getSimpleName() + " " + temp1);
		try {
			temp1.add(new A(1));
		} catch (Exception e) {
			System.out.println("problem " + e);
		}
		System.out.println(temp1.getClass().getSimpleName() + " " + temp1);
		Set<BadExampleDoNotDoIt> temp2 = new TreeSet<BadExampleDoNotDoIt>();
		temp2.add(new BadExampleDoNotDoIt(100000000));
		temp2.add(new BadExampleDoNotDoIt(1));
		temp2.add(new BadExampleDoNotDoIt(10000));
		temp2.add(new BadExampleDoNotDoIt(1));
		temp2.add(new BadExampleDoNotDoIt(1));
		System.out.println(temp2.getClass().getSimpleName() + " " + temp2);
		temp2 = new HashSet<BadExampleDoNotDoIt>();
		temp2.add(new BadExampleDoNotDoIt(100000000));
		temp2.add(new BadExampleDoNotDoIt(1));
		temp2.add(new BadExampleDoNotDoIt(10000));
		temp2.add(new BadExampleDoNotDoIt(1));
		temp2.add(new BadExampleDoNotDoIt(1));
		System.out.println(temp2.getClass().getSimpleName() + " " + temp2);
		System.out.println(new BadExampleDoNotDoIt(1)
				.equals(new BadExampleDoNotDoIt(1)));
	}

}
