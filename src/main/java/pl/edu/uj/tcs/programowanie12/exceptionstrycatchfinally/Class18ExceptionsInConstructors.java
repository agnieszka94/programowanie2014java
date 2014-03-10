package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;
/**
 * Exceptions should be thrown in constructors when an object cannot be properly initialized.
 * 
 * @author marcin
 *
 */
public class Class18ExceptionsInConstructors {

	public Class18ExceptionsInConstructors() throws Exception {
		throw new Exception();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class18ExceptionsInConstructors temp = null;
		// Class18ExceptionsInConstructors temp; compile-time error
		try {
			temp = new Class18ExceptionsInConstructors();
		} catch (Exception e) { /* please do not attempt this at home !!! */
		}
		System.out.println(temp);
	}

}
