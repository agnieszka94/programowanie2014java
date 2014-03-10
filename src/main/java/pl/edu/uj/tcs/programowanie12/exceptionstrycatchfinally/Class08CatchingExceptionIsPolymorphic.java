package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;
/**
 * Catching Exceptions is polymorphic and the first-matching block is applied.
 * 
 * @author kozik
 *
 */
public class Class08CatchingExceptionIsPolymorphic {

	@SuppressWarnings("serial")
	public static class ExceptionTierOne extends Exception {
	}

	@SuppressWarnings("serial")
	public static class ExceptionTierTwo extends ExceptionTierOne {
	}

	@SuppressWarnings("serial")
	public static class ExceptionTierThree extends ExceptionTierTwo {
	}

	public static void tryMe() throws ExceptionTierOne {
		switch (new java.util.Random().nextInt(3)) {
		case 0:
			throw new ExceptionTierOne();
		case 1:
			throw new ExceptionTierTwo();
		case 2:
			throw new ExceptionTierThree();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			try {
				tryMe();
			} catch (ExceptionTierThree e) {
				System.out.println("Got 3: " + e);
			} catch (ExceptionTierTwo e) {
				System.out.println("Got 2: " + e);
			} catch (ExceptionTierOne e) {
				System.out.println("Got 1: " + e);
			}
			/*
			 * compile-time error catch(ExceptionTierOne e)
			 * {System.out.println("Got 1: " + e);} catch(ExceptionTierTwo e)
			 * {System.out.println("Got 1: " + e);} catch(ExceptionTierThree e)
			 * {System.out.println("Got 1: " + e);}
			 */
		}
		for (int i = 0; i < 10; i++) {
			try {
				tryMe();
			} catch (ExceptionTierOne e) {
				System.out.println("Got 1: " + e);
			}
		}
	}

}
