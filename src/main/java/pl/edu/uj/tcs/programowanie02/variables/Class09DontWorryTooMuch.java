package pl.edu.uj.tcs.programowanie02.variables;

public class Class09DontWorryTooMuch {

	public static boolean heyCheckThisOut(Integer i, Integer j) {
		return i == j;
	}

	public static void main(String[] args) {
		String aStr = "Dom";
		String bStr = "Dom";
		String cStr = new String("Dom");
		System.out.println("aStr == bStr? " + (aStr == bStr));
		System.out.println("aStr == cStr? " + (aStr == cStr));

		int a = 1;
		Integer aInt = 1;
		Integer bInt = 1;
		Integer cInt = new Integer(1);
		System.out.println("a == aInt? " + (a == aInt));
		System.out.println("aInt == bInt? " + (aInt == bInt));
		System.out.println("aInt == cInt? " + (aInt == cInt));
		System.out.println("heyCheckThisOut(a,a)? " + heyCheckThisOut(a, a));
		System.out.println("heyCheckThisOut(new Integer(a), new Integer(a))? "
				+ heyCheckThisOut(new Integer(a), new Integer(a)));
	}
}
