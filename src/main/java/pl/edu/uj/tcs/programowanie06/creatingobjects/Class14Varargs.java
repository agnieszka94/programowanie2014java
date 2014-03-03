package pl.edu.uj.tcs.programowanie06.creatingobjects;

import java.util.Arrays;

/**
 * A class using a method with a variable number of arguments.
 * 
 * @author kozik
 * 
 */
public class Class14Varargs {

	public static void avoidIfYouCan(String... varargs) {
		System.out.println("Got this " + Arrays.toString(varargs));
	}

	public static void main(String... args) {
		avoidIfYouCan("Ala", "ma", "kota");
		String[] s = { "Ala", "ma", "kota", "?" };
		avoidIfYouCan(s);
	}

}
