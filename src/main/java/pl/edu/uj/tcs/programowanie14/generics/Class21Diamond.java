package pl.edu.uj.tcs.programowanie14.generics;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
/**
 * For java 1.7 we can use <> to make compiler infer the type parameter.
 * @author marcin
 *
 */
public class Class21Diamond {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Set<LinkedList<HashMap<String, Integer>>> one = new HashSet<LinkedList<HashMap<String, Integer>>>();
		Set<LinkedList<HashMap<String, Integer>>> two = new HashSet<>();
	}

}
