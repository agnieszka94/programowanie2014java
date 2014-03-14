package pl.edu.uj.tcs.programowanie13.reflection;
/**
 * An example of obtaining and calling methods using reflection.
 * 
 * @author marcin
 *
 */
public class Class10MethodsViaReflection {

	public static void staticMethod() {
		System.out.println("staticMethod()");
	}

	public static void staticMethod(int i) {
		System.out.println("staticMethod(" + i + ")");
	}

	public void method() {
		System.out.println("method()");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class10MethodsViaReflection temp = new Class10MethodsViaReflection();
		try {
			temp.getClass().getMethod("staticMethod").invoke(null);
			temp.getClass().getMethod("staticMethod", int.class)
					.invoke(null, 7);
			Class10MethodsViaReflection.class.getMethod("method").invoke(temp);
			Class10MethodsViaReflection.class.getMethod("method").invoke(null);
		} catch (Exception e) {
			System.out.println("Failed: " + e);
		}
	}

}
