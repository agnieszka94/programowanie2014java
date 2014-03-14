package pl.edu.uj.tcs.programowanie13.reflection;
/**
 * An example of obtaining and calling constructors using reflection.
 * 
 * @author marcin
 *
 */
public class Class09ConstructorsViaReflection {

	public Class09ConstructorsViaReflection() {
		System.out.println("constructing()");
	}

	public Class09ConstructorsViaReflection(int i, String s) {
		System.out.println("constructing(" + i + "," + s + ")");
	}

	public String toString() {
		return "it is really me";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class<?> cl = Class09ConstructorsViaReflection.class;
		try {
			System.out.println(cl.getConstructor().newInstance());
			System.out.println(cl.getConstructor(int.class, String.class)
					.newInstance(7, "Ala"));
			System.out.println(cl.getConstructor(int.class, String.class)
					.newInstance());
		} catch (Exception e) {
			System.out.println("Failed; " + e);
		}
	}

}
