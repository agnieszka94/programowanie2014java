package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;
/**
 * Printing stack trace for an exception.
 * 
 * @author kozik
 *
 */
public class Class03BasicStackTrace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
