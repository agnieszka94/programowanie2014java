package pl.edu.uj.tcs.programowanie02.variables;

public class Class02Assignment {

	private static class IntBox {
		int i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 4;
		int b = a;
		System.out.println("a = " + a + " and b = " + b);
		a++;
		System.out.println("a = " + a + " and b = " + b);
		b--;
		System.out.println("a = " + a + " and b = " + b);
		IntBox aBox = new IntBox();
		aBox.i = 4;
		IntBox bBox = aBox;
		System.out.println("aBox.i = " + aBox.i + " and bBox.i = " + bBox.i);
		aBox.i++;
		System.out.println("aBox.i = " + aBox.i + " and bBox.i = " + bBox.i);
		bBox.i--;
		System.out.println("aBox.i = " + aBox.i + " and bBox.i = " + bBox.i);
		Integer aInt = 4;
		System.out.println("aInt = " + aInt);
		aInt++;
		System.out.println("aInt = " + aInt);
		String aStr = "4";
		System.out.println("aStr = " + aStr);
		aStr += "1";
		System.out.println("aStr = " + aStr);
		aStr += 1;
		System.out.println("aStr = " + aStr);
		aStr = "4";
		System.out.println("aStr + 4 + 4 = " + aStr + 4 + 4);//addition is not associative
		System.out.println("aStr + (4 + 4) = " + aStr + (4 + 4));
		System.out.println("(aStr + 4) + 4 = " + (aStr + 4) + 4);
	}
}
