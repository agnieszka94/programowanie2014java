package pl.edu.uj.tcs.programowanie15.arrays;

import java.util.Arrays;
import java.util.List;

public class Class03EqualsForArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr1 = { "Ala", "ma", "kota" };
		String[] arr2 = { new String("Ala"), new String("ma"),
				new String("kota") };
		String[] arr3 = new String[] { "Ala", "ma", "kota" };
		String[] arr4 = { "Ala", "ma", "kota" };
		System.out.println("1 == 2: " + (arr1 == arr2));
		System.out.println("1.equals(2): " + arr1.equals(arr2));
		System.out.println("Arrays.equals(1,2): " + Arrays.equals(arr1, arr2));
		System.out.println("1 == 3: " + (arr1 == arr3));
		System.out.println("1.equals(3): " + arr1.equals(arr3));
		System.out.println("Arrays.equals(1,3): " + Arrays.equals(arr1, arr3));
		System.out.println("1 == 4: " + (arr1 == arr4));
		System.out.println("1.equals(4): " + arr1.equals(arr4));
		System.out.println("Arrays.equals(1,4): " + Arrays.equals(arr1, arr4));
		System.out.println("hash1: " + arr1.hashCode());
		System.out.println("hash2: " + arr2.hashCode());
		System.out.println("hash3: " + arr3.hashCode());
		System.out.println("hash4: " + arr4.hashCode());
		for (int i = 0; i < arr1.length; i++)
			System.out.println(" " + (arr1[i] == arr4[i]));
		List<String> list1 = Arrays.asList(arr1);
		List<String> list2 = Arrays.asList(arr2);
		System.out.println(list1 == list2);
		System.out.println(list1.get(1) == list2.get(1));
		System.out.println(list1.equals(list2));
		System.out.println(list1.hashCode());
		System.out.println(list2.hashCode());
	}

}
