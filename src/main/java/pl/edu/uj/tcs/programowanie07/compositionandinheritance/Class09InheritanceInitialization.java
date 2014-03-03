package pl.edu.uj.tcs.programowanie07.compositionandinheritance;
/**
 * An order of initializing base and derived classes.
 * 
 * @author marcin
 *
 */
public class Class09InheritanceInitialization {
	static class SimplePrint {
		static int i = 0;

		SimplePrint(String s) {
			System.out.println(++i + ": " + s);
		}
	}

	static class BaseClass {
		static SimplePrint st = new SimplePrint("static for BaseClass");
		SimplePrint nonSt = new SimplePrint("non-static for BaseClass");

		BaseClass() {
			new SimplePrint("constructor of BaseClass");
		}
	}

	static class DerivedClass extends BaseClass {
		static SimplePrint stDer = new SimplePrint("static for DerivedClass");
		SimplePrint nonStDer = new SimplePrint("non-static for DerivedClass");

		DerivedClass() {
			new SimplePrint("constructor of DerivedClass");
		}
	}

	public static void main(String[] args) {
		new DerivedClass();
	}

}
