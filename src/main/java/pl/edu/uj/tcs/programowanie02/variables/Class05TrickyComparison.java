package pl.edu.uj.tcs.programowanie02.variables;

public class Class05TrickyComparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer aInt = new Integer(4);
		Integer bInt = new Integer(4);
		Integer cInt = new Integer(5);
		System.out.println("aInt == bInt? " + (aInt == bInt));
		System.out.println("aInt != bInt? " + (aInt != bInt));
		System.out.println("aInt <= cInt? " + (aInt <= cInt));
		System.out.println("aInt >= cInt? " + (aInt >= cInt));
		System.out.println("aInt.equals(bInt)? " + aInt.equals(bInt));
	}
}
