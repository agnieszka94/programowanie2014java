package pl.edu.uj.tcs.programowanie06.creatingobjects;

/**
 * A class using a static initializer block.
 * 
 * @author kozik
 * 
 */

public class Class10StaticInitializers {

	static class Test {
		Test() {
			System.out.println("Creating objext Test " + this);
		}
	}

	static class RealTest {
		static Test a = new Test();
		static Test b;
		static {
			b = new Test();
		}

		RealTest() {
			System.out.println("Creating object RealTest " + this);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new RealTest();
		new RealTest();
		new RealTest();
	}

}
