package pl.edu.uj.tcs.programowanie10.nestedclasses;
/**
 * Inheriting from inner class outside the outer class is hideously ugly.
 * 
 * @author kozik
 *
 */
public class Class09InheritingFromInnerClasses {

	final long id = new java.util.Random().nextLong();

	public class Inner {
		String myDescription = "I am the inner class of " + id;
	}

	public class Derived extends Inner {
	}

	// public static class DerivedStatic extends Inner {}
	// compile-time error
	public static class DerivedStatic extends Inner {
		DerivedStatic(Class09InheritingFromInnerClasses outer) {
			outer.super();
			// myDescription = "I am the derived class of inner of " + id;
			// compile-time error
			myDescription = "Derived " + outer.id;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class09InheritingFromInnerClasses tempOne = new Class09InheritingFromInnerClasses();
		Inner tempInnerOne = tempOne.new Inner();
		System.out.println(tempInnerOne.myDescription);
		DerivedStatic tempInnerTwo = new DerivedStatic(tempOne);
		System.out.println(tempInnerTwo.myDescription);
		Inner tempInnerThree = tempInnerTwo;
		System.out.println(tempInnerThree.myDescription);
	}

}
