package pl.edu.uj.tcs.programowanie08.polymorphism;
/**
 * Find seven differences when compared to ReachDown class.
 * 
 * @author marcin
 *
 */

public class Class06OrNotReachDown {
	static class Base {
		Base() {
			f();
		}

		private void f() {
			System.out.println("I am Base");
		}
	}

	static class Derived extends Base {
		void f() {
			System.out.println("I am Derived");
		}
	}

	public static void main(String[] args) {
		new Derived();
	}

}
