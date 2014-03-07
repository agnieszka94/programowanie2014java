package pl.edu.uj.tcs.programowanie11.basicsofcontainers;

import java.util.Arrays;
import java.util.Collection;

/**
 * Collection is Iterable.
 * 
 * @author kozik
 * 
 */
public class Class05CollectionsAreIterable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Iterable<Integer> temp = (Collection<Integer>) Arrays.<Integer> asList(
				1, 2, 3, 4);
		for (int i : temp)
			System.out.println(i);
	}

}
