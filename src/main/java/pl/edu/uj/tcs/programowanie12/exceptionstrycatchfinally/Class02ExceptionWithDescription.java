package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;
/**
 * An example of throwing and catching an exception with description (does not happen very often).
 * @author kozik
 *
 */
public class Class02ExceptionWithDescription {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Got : " + e);
		}
		try {
			throw new Exception("Cheers");
		} catch (Exception e) {
			System.out.println("Got : " + e);
		}
	}
}
