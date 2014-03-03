package pl.edu.uj.tcs.programowanie06.creatingobjects;
/**
 * A class with a constructor calling another constructor.
 * 
 * @author kozik
 *
 */
public class Class06ConstructorFromConstructor {

	public Class06ConstructorFromConstructor() {
		System.out
				.println("Doing boring basic setup for this object... boring... Did I mention that it is boring?");
	}

	public Class06ConstructorFromConstructor(int i) {
		this();
		System.out.println("Now with my extra option: i = " + i
				+ " I can do something amazing");
	}

	public Class06ConstructorFromConstructor(String s) {
		this(Integer.parseInt(s));
		System.out
				.println("Did something boring, did something amazing, what to do next?");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Class06ConstructorFromConstructor();
		new Class06ConstructorFromConstructor(174);
		new Class06ConstructorFromConstructor("175");
	}

}
