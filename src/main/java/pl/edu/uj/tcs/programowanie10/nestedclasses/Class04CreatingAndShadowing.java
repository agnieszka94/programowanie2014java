package pl.edu.uj.tcs.programowanie10.nestedclasses;
/**
 * 
 * An inner class created from outside outer object and accessing a shadowed method.
 * 
 * @author kozik
 *
 */
public class Class04CreatingAndShadowing {

	private int accessCounter;

	public void count() {
		accessCounter++;
	}

	public class Inner {
		void count() {
			Class04CreatingAndShadowing.this.count();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class04CreatingAndShadowing temp = new Class04CreatingAndShadowing();
		temp.count();
		System.out.println("Count is: " + temp.accessCounter);
		Inner tempInOne = temp.new Inner();
		tempInOne.count();
		System.out.println("Count is: " + temp.accessCounter);
		Class04CreatingAndShadowing.Inner tempInTwo = temp.new Inner();
		tempInTwo.count();
		System.out.println("Count is: " + temp.accessCounter);
	}

}
