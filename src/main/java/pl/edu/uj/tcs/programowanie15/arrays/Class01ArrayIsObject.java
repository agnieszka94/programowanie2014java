package pl.edu.uj.tcs.programowanie15.arrays;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * In Java arrays are objects and define methods etc.
 * 
 * @author kozik
 * 
 */
public class Class01ArrayIsObject {

	public static String[] gimmeArray() {
		return new String[] { "Kot", "ma", "Ale" };
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] temp1 = new String[3];
		temp1[0] = "Ala";
		temp1[1] = "ma";
		temp1[2] = "kota";
		System.out.println(temp1);
		System.out.println(Arrays.toString(temp1));
		String[] temp2 = { "Ala", "ma", "kota" };
		System.out.println(Arrays.toString(temp2));
		// System.out.println({"Ala", "ma", "kota"}); comile-time error
		System.out.println(new String[] { "Ala", "ma", "kota" });
		System.out.println(new Object[] { "Ala", "ma", "kota" });
		System.out.println(Arrays.toString(gimmeArray()));
		System.out.println(Arrays.toString(new String[10]));
		System.out.println(Arrays.toString(new int[10]));
		System.out.println(temp1.getClass());
		for (Method me : temp1.getClass().getMethods()) {
			System.out.println(me);
		}
		System.out.println(Arrays.toString(temp1.getClass().getConstructors()));
		System.out.println(Arrays.toString(temp1.getClass().getFields()));
	}

}
