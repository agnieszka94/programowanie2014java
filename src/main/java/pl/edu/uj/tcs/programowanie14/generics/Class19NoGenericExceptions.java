package pl.edu.uj.tcs.programowanie14.generics;
/**
 * Not much can be said about exceptions and generics.
 * 
 * @author marcin
 *
 */
public class Class19NoGenericExceptions {

	// public static class Bug1<T> extends Exception {} compile-time error
	public static class Test1<E extends Exception> {
		E myException;

		Test1(E myException) {
			this.myException = myException;
		}

		public void throwIt() throws E {
			throw myException;
		}
	}

	@SuppressWarnings("serial")
	public static class Failure extends Exception {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new Test1<Failure>(new Failure()).throwIt();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
