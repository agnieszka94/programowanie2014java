package pl.edu.uj.tcs.programowanie09.abstractclassesandinterfaces;
/**
 * An abstract class - collects common code for derived classes and
 * provides a root for polymorphism.
 * 
 * @author marcin
 *
 */
public class Class01BasicAbstractClass {
	static abstract class AbstractClass {
		public abstract void methodNo1();

		@Override
		public String toString() {
			return "I am the Test";
		}
	}

	static class RealClass extends AbstractClass {
		@Override
		public void methodNo1() {
			System.out.println("I am the method number 1");
		}
	}

	public static void main(String[] args) {
		RealClass temp = new RealClass();
		temp.methodNo1();
		// AbstractClass abstractTemp = new AbstractClass(); compile-time error
		AbstractClass abstractTemp = temp;
		abstractTemp.methodNo1();
		System.out.println(abstractTemp);
	}

}
