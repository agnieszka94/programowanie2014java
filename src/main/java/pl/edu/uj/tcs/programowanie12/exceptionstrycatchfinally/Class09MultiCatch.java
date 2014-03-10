package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;
/**
 * Multicatch allows to catch many exception in a single block (since Java 1.7).
 * 
 * @author kozik
 *
 */
public class Class09MultiCatch {

	@SuppressWarnings("serial")
	static class ExceptionOne extends Exception {
	}

	@SuppressWarnings("serial")
	static class ExceptionTwo extends Exception {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			if (new java.util.Random().nextBoolean())
				throw new ExceptionOne();
			else
				throw new ExceptionTwo();
		} catch (ExceptionOne | ExceptionTwo e) {
			System.out.println("Got: " + e);
		}

	}

}
