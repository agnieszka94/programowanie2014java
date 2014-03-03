package pl.edu.uj.tcs.programowanie09.abstractclassesandinterfaces;
/**
 * Interfaces can have fields, but they are automatically public, final and static.
 * 
 * @author kozik
 *
 */
public class Class07FieldsInInterfaces {

	static interface Interface {
		// compile time constant
		int DA_FIELD = 3;
		// runtime constant
		int DA_NEXT_FIELD = new java.util.Random().nextInt();
	}

	public static void main(String[] args) {
		System.out.println("DA_FIELD: " + Interface.DA_FIELD);
		System.out.println("DA_NEXT_FIELD: " + Interface.DA_NEXT_FIELD);
	}

}
