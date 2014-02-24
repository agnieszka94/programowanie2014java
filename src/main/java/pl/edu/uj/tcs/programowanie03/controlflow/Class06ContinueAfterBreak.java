package pl.edu.uj.tcs.programowanie03.controlflow;

public class Class06ContinueAfterBreak {

	public static void main(String[] args) {
		final int i = 17634300;
		java.util.Random rG = new java.util.Random();
		while (true) {
			int j = rG.nextInt(i);
			if (0 == j) {
				System.out.println("This is enough!");
				break;
			}
			if (i % j != 0) {
				continue;
			}
			System.out.println("" + j + " divides " + i);
		}
		System.out.println("And we are done");
	}
}
