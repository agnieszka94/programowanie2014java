package pl.edu.uj.tcs.programowanie14.generics;

import java.util.HashSet;
import java.util.Set;

/**
 * An example of a basic use of generic collection.
 * 
 * @author marcin
 * 
 */
public class Class01BasicExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Number> set = new HashSet<Number>();
		set.add(1);
		set.add(1.0f);
		set.add(1.0d);
		// set.add("ala"); compile-time error
		set.add(new Integer(173));
		System.out.println(set);
	}

}
