package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;

import java.io.IOException;
/**
 * An example of how to define your own exception:
 * Try to extend the most appropriate exception.
 * Provide the customary constructors and don't use other options in a class.
 * 
 * @author marcin
 *
 */
@SuppressWarnings("serial")
public class Class16ExampleOfException extends IOException {
	// provide the customary constructors

	public Class16ExampleOfException() {
	}

	public Class16ExampleOfException(String s) {
		super(s);
	}

	public Class16ExampleOfException(String s, Throwable t) {
		super(s, t);
	}

	public Class16ExampleOfException(Throwable t) {
		super(t);
	}
}
// and forget that the users will check anything apart from type
