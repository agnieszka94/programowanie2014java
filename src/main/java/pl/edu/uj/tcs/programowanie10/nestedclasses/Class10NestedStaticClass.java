package pl.edu.uj.tcs.programowanie10.nestedclasses;
/**
 * An example of nested static class.
 * 
 * @author kozik
 *
 */
public class Class10NestedStaticClass {

	private static int k = 145;
	int j;

	static class Nested {
		int i;

		public int get() {
			// return j; compile-time error
			return k;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Nested tempOne = new Nested();
		Class10NestedStaticClass.Nested tempTwo = new Class10NestedStaticClass.Nested();
		System.out.println(tempOne.get() + " " + tempTwo.get());
	}

}
