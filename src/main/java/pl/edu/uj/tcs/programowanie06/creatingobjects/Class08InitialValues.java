package pl.edu.uj.tcs.programowanie06.creatingobjects;
/**
 * A class setting fields in initializers.
 * 
 * @author kozik
 *
 */
public class Class08InitialValues {

	static class Test {
	}

	int a = 17;
	int b;
	String aStr = "My favorite string";
	String bStr;
	Test t = new Test();

	Class08InitialValues() {
		System.out.println("a is " + a + " and b is " + b + " while aStr is \""
				+ aStr + "\" bStr is " + bStr + " and t is " + t);
	}

	public static void main(String[] args) {
		new Class08InitialValues();
	}
}
