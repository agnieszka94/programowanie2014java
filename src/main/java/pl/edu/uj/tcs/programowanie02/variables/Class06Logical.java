package pl.edu.uj.tcs.programowanie02.variables;

public class Class06Logical {

	public static boolean negate(boolean b) {
		System.out.println("negating...");
		return !b;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		System.out.println("!a? " + !a);
		System.out.println("a && b? " + (a && b));
		System.out.println("a || b? " + (a || b));
		System.out.println("negate(a) || a || negate(a)? "
				+ (negate(a) || a || negate(a)));
	}
}
