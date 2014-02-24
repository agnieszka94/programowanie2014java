package pl.edu.uj.tcs.programowanie02.variables;

public class Class04Comparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 4;
		int b = 4;
		int c = 5;
		System.out.println("a == b? " + (a == b));
		System.out.println("a != b? " + (a != b));
		System.out.println("a <= c? " + (a <= c));
		System.out.println("a >= c? " + (a >= c));
		String aStr = new String("Dom");
		String bStr = new String("Dom");
		String cStr = new String("Chalupa");
		System.out.println("aStr == bStr? " + (aStr == bStr));
		System.out.println("aStr != bStr? " + (aStr != bStr));
		System.out.println("aStr == cStr? " + (aStr == cStr));
		System.out.println("aStr != cStr? " + (aStr != cStr));
		System.out.println("aStr.equals(bStr)? " + aStr.equals(bStr));
		System.out.println("aStr.equals(cStr)? " + aStr.equals(cStr));
	}
}
