package pl.edu.uj.tcs.programowanie11.basicsofcontainers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Examples of implementations and use of the interface Set.
 * 
 * @author kozik
 * 
 */
public class Class07ExamplesOfSets {

	static String[] testArray = { "Ala", "ma", "kota", ",", "a", "kot", "ma",
			"Ale", "." };

	static void collectionTest(Set<String> col) {
		System.out
				.println("***Working with: " + col.getClass().getSimpleName());
		for (String i : testArray)
			col.add(i);
		System.out.println("After usual add: " + col);
		col.clear();
		System.out.println("After clear: " + col);
		col.addAll(Arrays.<String> asList(testArray));
		System.out.println("After addAll: " + col);
		System.out.print("Foreach loop: ");
		for (String i : col)
			System.out.print(i + ":");
		System.out.println();
		System.out.println("Empty? " + col.isEmpty());
		Iterator<String> it = col.iterator();
		System.out.print("Iterating: ");
		while (it.hasNext())
			System.out.print(it.next() + ":");
		System.out.println();
		System.out.println("contians(\"Ala\")? " + col.contains("Ala"));
		System.out.println("contians(new String(\"Ala\"))? "
				+ col.contains(new String("Ala")));
		col.removeAll(Arrays.asList("Ala", "ma"));
		System.out.println("After remove all on \"Ala\" and \"ma\" " + col);
		col.retainAll(Arrays.asList("kot", "kota"));
		System.out.println("After retain all on \"kot\" and \"kota\" " + col);
		System.out.println("*** End of working with: "
				+ col.getClass().getSimpleName());
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		collectionTest(new HashSet<String>());
		collectionTest(new TreeSet<String>());
	}

}
