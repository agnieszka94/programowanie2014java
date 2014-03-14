package pl.edu.uj.tcs.programowanie13.reflection;
/**
 * Example of using reflection to browse the inheritance tree.
 * 
 * @author marcin
 *
 */
public class Class04DiscoveringInheritance {

	public static interface I1 {
	}

	public static interface I2 {
	}

	public static interface I11 extends I1 {
	}

	public static interface I111 extends I11 {
	}

	public static class C1 implements I2 {
	}

	public static class C2 extends C1 implements I111 {
	}

	public static C2 genAnonymous() {
		return new C2() {
		};
	}

	public static void printInfo(String s, Class<?> c) {
		System.out.println((c.isInterface() ? "i: " : "c: ") + s
				+ c.getCanonicalName());
		if (c.getSuperclass() != null)
			printInfo(s + "  ", c.getSuperclass());
		for (Class<?> d : c.getInterfaces())
			printInfo(s + "  ", d);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printInfo("", C2.class);
		System.out.println();
		printInfo("", genAnonymous().getClass());
		System.out.println();
		printInfo("", double.class);
		System.out.println();
		printInfo("", Double.class);
		System.out.println();
		printInfo("", Class.class);
	}

}
