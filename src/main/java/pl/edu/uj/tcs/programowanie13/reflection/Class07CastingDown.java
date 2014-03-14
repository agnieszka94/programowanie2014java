package pl.edu.uj.tcs.programowanie13.reflection;
/**
 * Simple example of various down-casts.
 * @author marcin
 *
 */

public class Class07CastingDown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "Ala";
		System.out.println(str1);
		Object obj = str1;
		str1 = (String) obj;
		System.out.println(str1);
		str1 = String.class.cast(obj);
		System.out.println(str1);
		System.out.println("Dom".getClass().cast(obj));
	}

}
