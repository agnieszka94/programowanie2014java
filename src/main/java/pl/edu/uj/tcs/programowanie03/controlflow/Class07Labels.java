package pl.edu.uj.tcs.programowanie03.controlflow;

public class Class07Labels {

	public static void main(String[] args) {
		final int i = 17634300;
		java.util.Random rG = new java.util.Random();
		outer: while (true) {
			int j = rG.nextInt(i);
			if (0 == j) {
				System.out.println("This is enough!");
				break;
			}
			if (i % j != 0) {
				continue;
			}
			for (int k = 2; k < j; k++) {
				if (j % k == 0) {
					continue outer;
				}
			}
			System.out.println("" + j + " divides " + i);
		}
		System.out.println("And we are done");
	}
}
