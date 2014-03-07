package pl.edu.uj.tcs.programowanie11.basicsofcontainers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
/**
 * Examples of classes implementing Collection interface
 * 
 * @author kozik
 *
 */
public class Class04ExamplesOfCollections {

	static String[] testArray = { "Ala", "ma", "kota", ",", "a", "kot", "ma",
			"Ale", "." };

	static void collectionTest(Collection<String> col) {
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
		collectionTest(new ArrayList<String>());
		collectionTest(new LinkedList<String>());
		collectionTest(new HashSet<String>());
		collectionTest(new TreeSet<String>());
	}

}
