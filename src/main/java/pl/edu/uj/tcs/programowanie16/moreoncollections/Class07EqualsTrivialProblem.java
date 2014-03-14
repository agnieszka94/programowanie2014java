package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.util.HashSet;
import java.util.Set;

/**
 * A class with an incorrect (for trivial reasons) equals method/
 * 
 * @author kozik
 * 
 */
public class Class07EqualsTrivialProblem {
	public static class C {
		public boolean equals(C o) {
			return true;
		}

		public int hashCode() {
			int hash = 7;
			return hash;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<C> tempSet = new HashSet<C>();
		tempSet.add(new C());
		tempSet.add(new C());
		tempSet.add(new C());
		tempSet.add(new C());
		System.out.println(tempSet);
	}

}
