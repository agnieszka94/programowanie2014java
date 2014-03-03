package pl.edu.uj.tcs.programowanie07.compositionandinheritance;
/**
 * A class with a basic example of inheritance.
 * 
 * @author kozik
 *
 */

public class Class02BasicInheritance {

	static class Processor {
		void add(int i, int j) {
			System.out.println("Processor is adding " + i + " to " + j);
		}
	}

	static class Processor64 extends Processor {
		void mult(int i, int j) {
			System.out.println("Processor64 is multiplying " + i + " and " + j);
		}
	}

	public static void main(String[] args) {
		Processor64 proc = new Processor64();
		proc.mult(1, 2);
		proc.add(1, 2);
	}

}
