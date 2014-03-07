package pl.edu.uj.tcs.programowanie11.basicsofcontainers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/**
 * Examples of methods provided by the List interface. 
 * 
 * @author kozik
 *
 */
public class Class06ExamplesOfLists {

	static String[] testArray = { "Ala", "ma", "kota", ",", "a", "kot", "ma",
			"Ale", "." };

	static void listTest(List<String> li) {
		System.out.println("***Working with: " + li.getClass().getSimpleName());
		li.addAll(Arrays.asList(testArray));
		System.out.println("At position 5: " + li.get(5));
		System.out.println("Sublist [2,7]: " + li.subList(2, 7));
		System.out.println("\"ma\" is at pos: " + li.indexOf("ma"));
		System.out.println("\"ma\" is at pos: "
				+ li.lastIndexOf(new String("ma")));
		ListIterator<String> it = li.listIterator(li.size());
		System.out.print("Reverse the order: ");
		while (it.hasPrevious())
			System.out.print(it.previous() + ":");
		System.out.println();
		Collections.sort(li);
		System.out.println("After sorting: " + li);
		Collections.sort(li, String.CASE_INSENSITIVE_ORDER);
		System.out.println("After sorting case insensitive: " + li);
		System.out.println("*** End of working with: "
				+ li.getClass().getSimpleName());
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		listTest(new ArrayList<String>());
		listTest(new LinkedList<String>());
	}

}
