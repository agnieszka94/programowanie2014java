package pl.edu.uj.tcs.programowanie10.nestedclasses;
/**
 * 
 * A simple class containing an inner class.
 * 
 * @author kozik
 *
 */

public class Class01BasicInnerClass {

	class InnerClass {
		int i;
	}

	final InnerClass myFavorite;

	Class01BasicInnerClass() {
		myFavorite = new InnerClass();
		myFavorite.i = new java.util.Random().nextInt();
	}

	@Override
	public String toString() {
		return "My favorite inner is: " + myFavorite.i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Class01BasicInnerClass());
		System.out.println(new Class01BasicInnerClass());
		System.out.println(new Class01BasicInnerClass());
	}

}
