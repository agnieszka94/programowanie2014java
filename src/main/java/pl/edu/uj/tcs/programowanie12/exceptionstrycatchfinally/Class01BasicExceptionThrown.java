package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;
/**
 * A class throwing and catching a simple exception.
 * 
 * @author kozik
 *
 */

public class Class01BasicExceptionThrown {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			// throw new Exception(); //will not compile (Java is so smart)
			if (true)
				throw new Exception();
			System.out.println("Does it work?");
		} catch (Exception e) {
			System.out.println("Got you!");
		}
	}

}
