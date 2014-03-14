package pl.edu.uj.tcs.programowanie14.generics;

/**
 * Examples of how generic types inherit from each other.
 * 
 * @author marcin
 *
 */
public class Class02InheritanceAndInterfaces {

	public static interface A<T> {
		T t(T i);
	}

	public static interface B<T> extends A<T> {
	}

	// public static interface B<S> extends A<T> {} what would it mean?
	// public static interface C extends A<T> {} and that?
	public static interface C extends A<String> {
	}

	public static abstract class U<T> implements A<T> {
	}

	public static class W<T> implements C {
		@Override
		public String t(String i) {
			return "";
		}
	}

	public static class X<T> implements B<T> {
		@Override
		public T t(T i) {
			return null;
		}
	}

	public static class Y<T> implements B<T>, A<T> {
		@Override
		public T t(T i) {
			return null;
		}
	}

	public static class Z<T> {
		public void t(T t) {
		}

		public void t(int i) {
		}

		public void t(String s) {
		}

		public T u(T t) {
			return null;
		}

		public int u(int i) {
			return 0;
		}

		public String u(String s) {
			return " ";
		}
		// public Object u(Object u) { return null; } //compile-time error
	}
	/*
	 * compile-time error 
	 * public static class H<T> implements A<T>, C 
	 * { 
	 *       public T t(T i) { return null; } 
	 *       public String t(String i) { return " "; } 
	 * }
	 */

}
