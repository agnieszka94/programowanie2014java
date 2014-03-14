package pl.edu.uj.tcs.programowanie14.generics;
/**
 * An example of a generic class with a generic method.
 * 
 * @author marcin
 *
 * @param <T>
 */
public class Class07GenericMethodsInGenericTypes<T> {

	public <S> String f(T t, S s) {
		return "class of t = " + t.getClass().getSimpleName()
				+ " is kinda constant, class of s = "
				+ s.getClass().getSimpleName() + " changes";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class07GenericMethodsInGenericTypes<Number> temp = new Class07GenericMethodsInGenericTypes<Number>();
		System.out.println(temp.f(1, "String"));
		System.out.println(temp.f(1.0, new Object()));
		// System.out.println(temp.f("String", new Object())); 
		// compile-time error
	}

}
