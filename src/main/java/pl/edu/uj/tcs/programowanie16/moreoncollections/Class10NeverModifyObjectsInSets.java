package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.util.HashSet;
import java.util.Set;
/**
 * Never modify objects stored in sets.
 * 
 * @author marcin
 *
 */
public class Class10NeverModifyObjectsInSets {

	public static class A {
		int i;
		@Override
		public boolean equals(Object o) {
			if (!(o instanceof A))
				return false;
			return ((A) o).i == i;
		}

		public int hashCode() {
			return i;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A temp = new A();
		Set<A> tempSet = new HashSet<A>();
		tempSet.add(temp);
		System.out.println("tempSet has: " + tempSet.size() + " el. and temp? "
				+ tempSet.contains(temp));
		temp.i++;
		System.out.println("tempSet has: " + tempSet.size() + " el. and temp? "
				+ tempSet.contains(temp));
		tempSet.add(temp);
		System.out.println("tempSet has: " + tempSet.size() + " el. and temp? "
				+ tempSet.contains(temp));
		System.out.println(tempSet);
		System.out.println(tempSet.toArray(new A[0])[0] == tempSet
				.toArray(new A[0])[1]);
	}

}
