package pl.edu.uj.tcs.programowanie03.controlflow;

public class Class02ManyHappyReturns {
	public static void testCase(boolean b) {
		if (b) {
			System.out.println("b is the best");
			return;
		}
		System.out.println("This b is not that good");
	}

	public static int nextTest(int i) {
		for (int j = 2; j < i; j++)
			if (i % j == 0)
				return j;
		return 1;
	}

	public static void main(String[] args) {
		testCase(true);
		testCase(false);
		System.out.println("A divisor of 127? " + nextTest(135));
		System.out.println("A divisor of 3? " + nextTest(3));
		return;
	}

}
