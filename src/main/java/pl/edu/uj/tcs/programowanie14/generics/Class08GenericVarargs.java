package pl.edu.uj.tcs.programowanie14.generics;
/**
 * Varargs with a generic type - avoid if possible.
 * 
 * @author marcin
 *
 */
public class Class08GenericVarargs {

	public static <T> void f(@SuppressWarnings("unchecked") T... args) {
		for (T i : args)
			System.out.print(i.getClass().getSimpleName() + " ");
		System.out.println();
	}

	public static <T> T g(@SuppressWarnings("unchecked") T... args) {
		for (T i : args)
			System.out.print(i.getClass().getSimpleName() + " ");
		System.out.println("returning: "
				+ args[args.length - 1].getClass().getSimpleName());
		return args[args.length - 1];
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		f(1, 2, 3, 4);
		f(1, 1.0, 2.0f);
		f("String", 1);
		int i = g(1, 2, 3, 4);
		System.out.println(i);
		// i = g(1,1.0,2.0f); compile-time error
		// Float j = g(1,1.0,2.0f); compile-time error
		Number j = g(1, 1.0, 2.0f);
		System.out.println(j);
		Object o = g("String", new Object());
		System.out.println(o);
	}

}
