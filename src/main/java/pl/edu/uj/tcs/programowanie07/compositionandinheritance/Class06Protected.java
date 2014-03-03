package pl.edu.uj.tcs.programowanie07.compositionandinheritance;

/**
 * An example of a derived class accessing a protected method of a parent.
 * 
 * @author kozik
 */
public class Class06Protected {
	static class Base {
		protected void aMethodForDescendants() {
			System.out.println("You better be one of my descendants!");
		}
	}

	static class Derived extends Base {
		Derived() {
			aMethodForDescendants();
		}
	}

	public static void main(String[] args) {
		new Derived();
	}
}
