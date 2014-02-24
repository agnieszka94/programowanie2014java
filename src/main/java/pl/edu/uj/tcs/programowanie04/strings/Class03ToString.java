package pl.edu.uj.tcs.programowanie04.strings;

public class Class03ToString {

	@Override
	public String toString() {
		// return "The usual description would be: " + this; is not good
		return "The usual description would be: " + super.toString();
	}

	public static void main(String[] args) {
		System.out.println(new Class03ToString());
	}

}
