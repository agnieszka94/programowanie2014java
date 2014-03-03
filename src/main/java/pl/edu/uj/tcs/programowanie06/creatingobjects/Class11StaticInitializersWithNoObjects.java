package pl.edu.uj.tcs.programowanie06.creatingobjects;
/**
 * A class which is loaded while no objects of this class are created.
 * 
 * @author kozik
 *
 */
public class Class11StaticInitializersWithNoObjects {

	static {
		System.out.println("Kinda early, ain't it?");
	}

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
	public static void main(String[] args) throws Exception {
		System.out.println("inside InitialValuesStaticPart2.main(...)");
		Class.forName("pl.edu.uj.tcs.programowanie06.creatingobjects.Class11StaticInitializersWithNoObjects$RealTest");
		System.out.println("one");
		Class.forName("pl.edu.uj.tcs.programowanie06.creatingobjects.Class11StaticInitializersWithNoObjects$RealTest");
		System.out.println("two");
		Class.forName("pl.edu.uj.tcs.programowanie06.creatingobjects.Class11StaticInitializersWithNoObjects$RealTest");
		System.out.println("three");
	}

}
