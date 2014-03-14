package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.util.HashSet;
import java.util.Set;
/**
 * An equals method should ALWAYS be accompanied by a compatible hashCode.
 * 
 * @author marcin
 *
 */
public class Class08MissingHashCode {

	public static class A {
		int i;

		public boolean equals(Object o) {
			if (!(o instanceof A))
				return false;
			return ((A) o).i == i;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<A> tempSet = new HashSet<A>();
		tempSet.add(new A());
		tempSet.add(new A());
		tempSet.add(new A());
		tempSet.add(new A());
		tempSet.add(new A());
		System.out.println(tempSet.size());
		System.out.println(new A().equals(new A()));
		System.out.println(tempSet.contains(new A()));
	}

}
