package pl.edu.uj.tcs.programowanie08.polymorphism;

/**
 * A class reaching down in a constructor to an uninitialized derived class.
 * 
 * @author marcin
 * 
 */
public class Class07ReachDownToUninitializedObject {
	static class Base {
		public final String letsStoreTheArgs;

		Base(String myName) {
			letsStoreTheArgs = myName + " " + somethingToAdd();
		}

		String somethingToAdd() {
			return "";
		}
	}

	static class Derived extends Base {
		private final String extraArgs;

		Derived(String myName, String extraArgs) {
			super(myName);
			this.extraArgs = extraArgs;
		}

		@Override
		String somethingToAdd() {
			return extraArgs;
		}
	}

	public static void main(String[] args) {
		Derived temp = new Derived("PROBLEM", "NO");
		System.out.println(temp.letsStoreTheArgs);
	}

}
