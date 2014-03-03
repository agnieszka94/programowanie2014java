package pl.edu.uj.tcs.programowanie06.creatingobjects;
/**
 * A class with an overloaded construct and an overloaded method.
 * 
 * @author kozik
 *
 */
public class Class04Overloading {

	public Class04Overloading() {
		System.out.println("Constructing...");
	}

	public Class04Overloading(int i) {
		System.out.println("Constructing..." + i);
	}

	public void overLoaded() {
		System.out.println("No arguments given");
	}

	public void overLoaded(int i) {
		System.out.println("Got this: " + i);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			new Class04Overloading();
		for (int i = 0; i < 5; i++)
			new Class04Overloading(i);
		new Class04Overloading(173).overLoaded();
		new Class04Overloading().overLoaded(173);
	}

}
