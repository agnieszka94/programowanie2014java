package pl.edu.uj.tcs.programowanie14.generics;

import java.util.Arrays;
import java.util.HashSet;
/**
 * Example of using wildcards.
 * 
 * @author marcin
 *
 */
public class Class16Wildcards {

	public static class TheBox<T> {
		T in;

		public T get() {
			return in;
		}

		public void set(T in) {
			this.in = in;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TheBox<Integer> temp1 = new TheBox<Integer>();
		temp1.set(10);
		Integer i = temp1.get();
		System.out.println(i);
		TheBox<? extends Number> temp2 = temp1;
		Number j = temp2.get();
		//Integer k = temp2.get();
		System.out.println(j);
		// temp2.set(1); compile-time error
		HashSet<? extends Number> temp3 = new HashSet<Integer>(Arrays.asList(1,
				2, 3, 4, 5));
		for (Number n : temp3)
			System.out.println(n);
		System.out.println(temp3.contains(1));
		// temp3.add(1);
		// temp3.add(new Integer(1));
		temp3.add(null);
		System.out.println(temp3);
		HashSet<? super Integer> temp4 = new HashSet<Integer>(Arrays.asList(1,
				2, 3, 4, 5));
		for (Object o : temp4)
			System.out.println(o);
		System.out.println(temp4.contains(1));
		temp4.add(1);
		temp4.add(new Integer(1));
		temp4.add(null);
		System.out.println(temp4);
	}

}
