package pl.edu.uj.tcs.programowanie07.compositionandinheritance;

/**
 * A class which (just like all of the others) cannot call its own and parent's
 * constructor at the same time
 * 
 * @author marcin
 * 
 */
public class Class08SuperThis {
	static class A {
		A() {
			System.out.println("A()");
		}

		A(int i) {
			System.out.println("A(int)");
		}
	}

	static class B extends A {
		B() {
			System.out.println("B()");
		}

		B(int i) {
			this();
			// super(i); compile-time error
			System.out.println("B(int)");
		}

		B(byte b) {
			super(b);
			// this(); compile-time error
			System.out.println("B(byte)");
		}
	}

	public static void main(String[] args) {
		new B();
		System.out.println();
		new B(7);
		System.out.println();
		new B((byte) 7);
	}
}
