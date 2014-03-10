package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;
/**
 * Throwing an exception with a little bit more informative stack trace.
 * 
 * @author kozik
 *
 */
public class Class04StackTraceWithThreeCalls {

	static void f() {
		g();
	}

	static void g() {
		h();
	}

	static void h() {
		throw new RuntimeException();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			f();
		} catch (Exception e) {
			e.printStackTrace(); // prints the tack trace to the std-err
		}
	}

}
