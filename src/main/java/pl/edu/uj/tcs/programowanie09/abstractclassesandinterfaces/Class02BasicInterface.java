package pl.edu.uj.tcs.programowanie09.abstractclassesandinterfaces;
/**
 * An interface - like an abstract class but ONLY definitions of methods (and some fields).
 * 
 * @author marcin
 *
 */
public class Class02BasicInterface {
	static interface Interface {
		void methodNo1();
	}

	static class Real implements Interface {
		@Override
		public void methodNo1() {
			System.out.println("Implementing as promised");
		}
	}

	public static void main(String[] args) {
		Real temp = new Real();
		temp.methodNo1();
		// Interface tempInterface = new Interface(); compile-time error
		Interface tempInterface = temp;
		tempInterface.methodNo1();
	}

}
