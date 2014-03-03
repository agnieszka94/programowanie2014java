package pl.edu.uj.tcs.programowanie07.compositionandinheritance;
/**
 * A class overriding methods from the base class.
 * 
 * @author kozik
 *
 */
public class Class05OverridingMethods {

	static class Processor {
		void add(int i, int j) {
			System.out.println("Processor is adding " + i + " to " + j);
		}

		void add(float f, float g) {
			System.out.println("Processor is adding " + f + " to " + g);
		}
	}

	static class Processor64 extends Processor {
		@Override
		void add(float f, float g) {
			System.out.println("Processor64 is adding " + f + " to " + g);
		}
	}

	public static void main(String[] args) {
		Processor64 proc = new Processor64();
		proc.add(1, 1);
		proc.add(1f, 1f);
	}

}
