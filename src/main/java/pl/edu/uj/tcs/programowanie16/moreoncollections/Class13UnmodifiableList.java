package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/**
 * An example of using unmodifiable lists.
 * 
 * @author marcin
 *
 */
public class Class13UnmodifiableList {

	public static <T> void testCollection(List<T> list, T el0, T el1, T el2) {
		System.out.println("WORKING WITH: " + list.getClass().getSimpleName());
		System.out.print("clear ");
		try {
			list.clear();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAILED " + e.getClass().getSimpleName());
		}
		System.out.print("add ");
		try {
			list.add(el1);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAILED " + e.getClass().getSimpleName());
		}
		System.out.print("addAll ");
		try {
			list.addAll(Arrays.asList(el1, el2));
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAILED " + e.getClass().getSimpleName());
		}
		System.out.print("remove ");
		try {
			list.remove(el0);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAILED " + e.getClass().getSimpleName());
		}
		System.out.print("remove ");
		try {
			list.remove(el1);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAILED " + e.getClass().getSimpleName());
		}
		System.out.print("retainAll ");
		try {
			list.retainAll(Arrays.asList(el1, el2));
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAILED " + e.getClass().getSimpleName());
		}
		System.out.print("set ");
		try {
			list.set(0, el2);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAILED " + e.getClass().getSimpleName());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4));
		List<Integer> list3 = Collections
				.unmodifiableList(new LinkedList<Integer>(Arrays.asList(1, 2,
						3, 4)));
		List<Integer> list4 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4))
				.subList(1, 3);
		testCollection(list1, 4, 5, 6);
		testCollection(list2, 4, 5, 6);
		testCollection(list3, 4, 5, 6);
		testCollection(list4, 4, 5, 6);
	}

}
