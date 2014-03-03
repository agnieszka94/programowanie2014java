package pl.edu.uj.tcs.programowanie06.creatingobjects;
/**
 * A class with a method finalize(). 
 * 
 * Implementing this method should be avoided - except when creating safety nets used for testing
 * the application. 
 * 
 * @author kozik
 *
 */
public class Class07FinalizeIsBadTaste {

	int i = new java.util.Random().nextInt();

	public void finalize() {
		System.out
				.println("I know is a really dumb idea, but here we are - the finalize method for"
						+ this);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10000000; i++)
			new Class07FinalizeIsBadTaste();
		System.out.println("Done");
	}
}
