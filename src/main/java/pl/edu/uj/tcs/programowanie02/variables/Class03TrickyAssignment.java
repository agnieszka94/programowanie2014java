package pl.edu.uj.tcs.programowanie02.variables;

public class Class03TrickyAssignment {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer aInt = 4;
		Integer bInt = aInt;
		System.out.println("aInt = " + aInt + " and bInt = " + bInt);
		aInt++;
		System.out.println("aInt = " + aInt + " and bInt = " + bInt);
		bInt--;
		System.out.println("aInt = " + aInt + " and bInt = " + bInt);
		String aStr = "4";
		String bStr = aStr;
		System.out.println("aStr = " + aStr + " and bStr = " + bStr);
		aStr += "1";
		System.out.println("aStr = " + aStr + " and bStr = " + bStr);
	}
}
