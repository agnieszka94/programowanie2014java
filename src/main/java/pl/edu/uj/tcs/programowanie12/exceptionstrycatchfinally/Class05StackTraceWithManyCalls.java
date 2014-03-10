package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;
/**
 * Stack trace for many recursive calls.
 * 
 * @author kozik
 *
 */
public class Class05StackTraceWithManyCalls {

	static void f(int i) {
		if (i == 0)
			throw new RuntimeException();
		f(--i);
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		try {
			f(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
