package pl.edu.uj.tcs.programowanie14.generics;
/**
 * Anonymous class implementing a generic interface.
 * 
 * @author marcin
 *
 */
public class Class05AnonymousGenerics {

	public static interface F<T> {
		T produce();
	}

	public static class A {
		public static F<A> factory = new F<A>() {
			public A produce() {
				return new A();
			}
		};
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(A.factory.produce());
	}

}
