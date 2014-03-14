package pl.edu.uj.tcs.programowanie14.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * Examples of using a type-tag.
 * @author marcin
 *
 */
public class Class11UsingTypeTag {

	public static class ArrayCreator<T> {
		public Class<T> kind;

		@SuppressWarnings("unused")
		public void mistakes() {
			Object i = new Object();
			// if(i instanceof T) System.out.println("hej"); compile-time error
			// T var = new T(); compile-time error
			T[] array;
			// array = new T[12]; compile-time error
		}

		@SuppressWarnings("unchecked")
		public T[] create1(int i) {
			return (T[]) new Object[i];
		}

		@SuppressWarnings("unchecked")
		public T[] create2(int i) {
			return (T[]) Array.newInstance(kind, 10);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayCreator<Integer> temp1 = new ArrayCreator<Integer>();
		temp1.kind = Integer.class;
		try {
			Object[] i = temp1.create1(10);
			System.out.println(Arrays.toString(i));
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			Integer[] i = temp1.create1(10);
			System.out.println(Arrays.toString(i));
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			Integer[] i = temp1.create2(10);
			System.out.println(Arrays.toString(i));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
