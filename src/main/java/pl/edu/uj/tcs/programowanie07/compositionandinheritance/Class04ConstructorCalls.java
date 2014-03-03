package pl.edu.uj.tcs.programowanie07.compositionandinheritance;
/** Both base and derived class can have constructors.
 * 
 * @author kozik
 *
 */

public class Class04ConstructorCalls {

	static class Processor {
		Processor() {
			System.out.println("Constructing Processor");
		}
	}

	static class Processor64 extends Processor {
		Processor64() {
			System.out.println("Constructing Processor64");
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Processor64 proc = new Processor64();
	}
}
