package pl.edu.uj.tcs.programowanie15.arrays;

import java.util.Arrays;
/**
 * Using generics with arrays should be always avoided.
 * 
 * @author kozik
 *
 * @param <T>
 */

public class Class06ArraysAndGenerics<T> {

	T[] myArray;

	@SuppressWarnings("unchecked")
	public Class06ArraysAndGenerics<T> doIt(Class<? extends T> type) {
		// myArray = new T[10]; compile-time error
		Object[] temp = new Object[10];
		myArray = (T[]) temp;
		System.out.println(Arrays.toString(myArray));
		// myArray[0] = "Ala"; compile-time error
		temp[0] = "Ala";
		System.out.println(Arrays.toString(myArray));
		return this;
	}

	@SuppressWarnings("unchecked")
	public Class06ArraysAndGenerics<T> doItBetter(Class<? extends T> type) {
		// myArray = new T[10]; compile-time error
		Object[] temp = (Object[]) java.lang.reflect.Array
				.newInstance(type, 10);
		myArray = (T[]) temp;
		System.out.println(Arrays.toString(myArray));
		// myArray[0] = "Ala"; compile-time error
		try {
			temp[0] = "Ala";
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(myArray));
		return this;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("STRING");
		new Class06ArraysAndGenerics<String>().doIt(String.class);
		System.out.println("INTEGER");
		Class06ArraysAndGenerics<Integer> temp1 = new Class06ArraysAndGenerics<Integer>()
				.doIt(Integer.class);
		try {
			for (@SuppressWarnings("unused")
			int i : temp1.myArray)
				i++;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("STRING");
		new Class06ArraysAndGenerics<String>().doItBetter(String.class);
		System.out.println("INTEGER");
		new Class06ArraysAndGenerics<Integer>().doItBetter(Integer.class);
	}

}
