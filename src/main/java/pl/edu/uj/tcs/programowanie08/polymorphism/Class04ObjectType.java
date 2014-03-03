package pl.edu.uj.tcs.programowanie08.polymorphism;
/**
 * A object can always identify its own class.
 * 
 * @author marcin
 *
 */

public class Class04ObjectType {
	static class Base {
		private final String realName;

		Base() {
			realName = this.getClass().getName();
		}

		@Override
		public String toString() {
			return "realName: " + realName;
		}
	}

	static class Derived extends Base {
	}

	public static void main(String[] args) {
		System.out.println(new Base());
		System.out.println(new Derived());
	}

}
