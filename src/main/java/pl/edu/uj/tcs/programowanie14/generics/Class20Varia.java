package pl.edu.uj.tcs.programowanie14.generics;

import java.util.HashSet;
import java.util.Set;
/**
 * Varius examples of generics, arrays etc.
 * 
 * @author marcin
 *
 */
public class Class20Varia {

	public static <T> T gimmeOne(Class<? extends T> cla) {
		try {
			return cla.newInstance();
		} catch (Exception e) {
			System.out.println("Not allowed : " + e);
		}
		return null;
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// arrays are covariant
		Integer[] ar1 = new Integer[1];
		Object[] ar2 = ar1;
		try {
			ar2[0] = "String";
		} catch (Exception e) {
			System.out.println("This will not work: " + e);
		}
		// generics are NOT
		// Set<Object> map = new HashSet<String>(); compile-time error
		Set<?> set1 = new HashSet<String>();
		set1 = new HashSet<Integer>();
		// Set<Number> set2 = new HashSet<Integer>();
		Set<? extends Number> set2 = new HashSet<Integer>();
		set2 = new HashSet<Double>();
		// set2 = new HashSet<String>(); compile-time error
		@SuppressWarnings("rawtypes")
		Class clas1 = Integer.class;
		clas1 = String.class;
		Class<?> clas2 = Integer.class;
		clas2 = String.class;
		Class<? extends Number> clas3 = Integer.class;
		// clas3 = String.class; compile-time error
		System.out.println("<" + gimmeOne(Integer.class) + ">");
		System.out.println("<" + gimmeOne(String.class) + ">");
		String str1 = gimmeOne(String.class);
		System.out.println("<" + str1 + ">");
		Number i3 = gimmeOne(clas3);
		i3 = Class20Varia.<Number> gimmeOne(clas3);
		// i3 = MoreOnClass.gimmeOne<Number>(clas3); compile-time error
		System.out.println("<" + i3 + ">");
		// Number i2 = gimmeOne(clas2); compile-time error
		// Number i1 = gimmeOne(clas1); compile-time error
	}

}
