package pl.edu.uj.tcs.programowanie06.creatingobjects;

/**
 * A simple class with a parameterless custom constructor.
 * 
 * @author kozik
 * 
 */
public class Class02ParameterLessConstructor {

	public Class02ParameterLessConstructor() {
		System.out.println("Constructing...");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			new Class02ParameterLessConstructor();
	}
}
