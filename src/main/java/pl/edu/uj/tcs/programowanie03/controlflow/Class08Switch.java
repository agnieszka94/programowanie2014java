package pl.edu.uj.tcs.programowanie03.controlflow;

public class Class08Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = new java.util.Random().nextInt(20);
		switch (i) {
		case 0:
		case 1:
			System.out.println("" + i + " is a cheap shot");
			break;
		case 2:
		case 3:
		case 5:
		case 7:
		case 11:
			System.out.println("" + i + " is prime");
			break;
		default:
			System.out.println("" + i + " is an empirical composite number");
		}
	}
}
