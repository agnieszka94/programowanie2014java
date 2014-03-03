package pl.edu.uj.tcs.programowanie06.creatingobjects;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * A class using an initializer block to initialize a HashSet.
 * 
 * @author kozik
 *
 */
public class Class09InitializerBlock {

	int[] array = { 1, 2, 3, 5, 7, 11 };
	int a = f();
	int b = 17;

	int f() {
		return 13;
	}

	Set<Integer> s = new HashSet<Integer>();
	{
		s.add(19);
		s.add(23);
		s.add(29);
	}

	public Class09InitializerBlock() {
		System.out.println(Arrays.toString(array) + ", " + a + ", " + b + ", "
				+ s);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Class09InitializerBlock();
		new Class09InitializerBlock();
	}

}
