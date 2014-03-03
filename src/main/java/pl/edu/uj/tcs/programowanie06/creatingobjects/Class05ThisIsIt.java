package pl.edu.uj.tcs.programowanie06.creatingobjects;
/**
 * A class using reference "this" to access a field.
 * 
 * @author kozik
 *
 */
public class Class05ThisIsIt {

	int a;

	public Class05ThisIsIt(int a) {
		this.a = a;
	}

	public Class05ThisIsIt bump() {
		a++;
		return this;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("And the result is: "
				+ new Class05ThisIsIt(17).bump().bump().bump().a);
	}
}
