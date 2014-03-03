package pl.edu.uj.tcs.programowanie08.polymorphism;
/**
 * An override returns a subclass - covariant return type 
 * (new, and great, functionality as of 1.5).
 * 
 * @author marcin
 *
 */

public class Class08CovariantReturnTypes {
	static class Device {
	}

	static class Car extends Device {
	}

	// static class Car {} compile-time error
	static class Manufacture {
		public Device produce() {
			return new Device();
		}
	}

	static class CarFactory extends Manufacture {
		@Override
		public Car produce() {
			return new Car();
		}
	}

	public static void main(String[] args) {
		System.out.println("One can produce: " + new CarFactory().produce());
	}

}
