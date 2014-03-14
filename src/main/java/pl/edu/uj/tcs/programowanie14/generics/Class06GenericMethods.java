package pl.edu.uj.tcs.programowanie14.generics;
/**
 * A class implementing a generic method.
 * 
 * @author marcin
 *
 */
public class Class06GenericMethods {

	public static <T> T f(T i) {
		return i;
	}

	public <T> T g(T i) {
		return i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(f(1) + f(2) + f(3));
		System.out.println(f("Ala") + f("ma") + f("kota"));
		System.out.println(f("Ala") + f("ma") + f("koty") + f(2));
		System.out.println(Class06GenericMethods.<String> f("KOT"));
		// System.out.println(Class06GenericMethods.<Integer>f("KOT"));
		// compile-time error
		System.out.println(Class06GenericMethods.<Number> f(173));
		Class06GenericMethods temp = new Class06GenericMethods();
		System.out.println(temp.g(1) + temp.g(2) + temp.g(3));
		System.out.println(temp.g("Ala") + temp.g("ma") + temp.g("kota"));
		System.out.println(temp.g("Ala") + temp.g("ma") + temp.g("koty")
				+ temp.g(2));
		System.out.println(temp.<String> g("KOT"));
		// System.out.println(Class06GenericMethods.<Integer>f("KOT"));
		// compile-time error
		System.out.println(temp.<Number> g(173));
	}

}
