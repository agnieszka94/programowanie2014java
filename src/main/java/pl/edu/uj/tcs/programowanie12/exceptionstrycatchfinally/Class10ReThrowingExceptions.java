package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;
/**
 * It is possible to re-throw a caught exception. 
 * This is done if, at a given place in a program, we cannot fix the problem which caused the Exception to appear.
 * 
 * 
 * @author kozik
 *
 */
public class Class10ReThrowingExceptions {

	/**
	 * @param args
	 */
	public static void f() throws Exception {
		throw new Exception();
	}

	public static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("I thought I could handle it, but I cannot.");
			throw e;
		}
	}

	public static void h() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out
					.println("I thought I could handle it, I cannot, but you better don't know where I got it.");
			e.fillInStackTrace();
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			h();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
