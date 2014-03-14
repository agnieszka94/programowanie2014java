package pl.edu.uj.tcs.programowanie14.generics;
/**
 * Basic example of a bound on a parameter type.
 * 
 * @author marcin
 *
 */
public class Class14ErasureBounds {

	/**
	 * @param args
	 */
	public static interface Bound {
		int b();
	}

	public static class Bounded<T extends Bound> {
		int cos(T i) {
			return i.b();
		}
	}

	public static class A implements Bound {
		public int b() {
			return 1;
		}
	}

	public static class B {
		public int b() {
			return 1;
		}
	}

	public static void main(String[] args) {
		Bounded<A> temp = new Bounded<A>();
		A a = new A();
		@SuppressWarnings("unused")
		Bound bound = a;
		System.out.println(temp.cos(a));
		// System.out.println(temp.b(bound)); compile-time error
		// Bounded<B> temp = new Bounded<B>(); compile-time error
	}

}
