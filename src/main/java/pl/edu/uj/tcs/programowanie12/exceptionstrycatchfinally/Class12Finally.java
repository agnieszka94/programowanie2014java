package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;
/**
 * 
 * The finally block of the try-catch is executed always.
 * @author marcin
 *
 */

public class Class12Finally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("Throw an exception?");
			throw new Exception();
		} catch (Exception e) {
		} finally {
			System.out.println("Finally... no1");
		}
		try {
			System.out.println("or not throw an exception?");
		} catch (Exception e) {
		} finally {
			System.out.println("Finally... no2");
		}
	}

}
