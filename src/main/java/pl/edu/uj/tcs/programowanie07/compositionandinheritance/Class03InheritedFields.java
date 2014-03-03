package pl.edu.uj.tcs.programowanie07.compositionandinheritance;
/**
 * A derived class inherits fields from the base class.
 * 
 * @author kozik
 *
 */
public class Class03InheritedFields {

	static class Base {
		int i;
	}

	static class Derived extends Base {
	}

	public static void main(String[] args) {
		Derived temp = new Derived();
		temp.i = 174;
		System.out.println("The number is: " + temp.i);
	}

}
