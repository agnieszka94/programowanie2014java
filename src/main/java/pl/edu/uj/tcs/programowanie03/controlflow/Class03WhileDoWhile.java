package pl.edu.uj.tcs.programowanie03.controlflow;

public class Class03WhileDoWhile {

	public static void main(String[] args) {
		int i = 0;
		while (++i < 3)
			System.out.println("only " + (2 - i) + " to go");
		System.out.println("BU HA HA HA");
		i = 0;

		do
			System.out.println("stil " + (2 - i) + " to go");
		while (++i < 3);
		System.out.println("BU HA HA HA");
	}

}
