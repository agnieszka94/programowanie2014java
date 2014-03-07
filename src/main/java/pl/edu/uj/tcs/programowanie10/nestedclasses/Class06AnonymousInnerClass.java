package pl.edu.uj.tcs.programowanie10.nestedclasses;

/**
 * A class creating an anonymous inner class.
 * 
 * @author kozik
 * 
 */
public class Class06AnonymousInnerClass {

	final String objectField = "field of outer object";

	Object insideThisOne(final int i) {
		return new Object() {
			@Override
			public String toString() {
				return "HEJ HEJ " + i + " " + objectField;
			}
		};
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object o = new Class06AnonymousInnerClass().insideThisOne(145);
		System.out.println(o);
		System.out.println(o);
		System.out.println(o);
	}

}
