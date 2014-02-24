package pl.edu.uj.tcs.programowanie03.controlflow;

public class Class01IfElse {

	public static void main(String[] args) {
		int a = 4;
		if (a != 0)
			System.out.println("Truly 4 != 0");
		if (a == 0)
			System.out.println("That would be a pickle!");
		else
			System.out.println("Nah, it is ok after all");
		if (a == 0)
			System.out.println("We've checked it two times already");
		else if (a == 1)
			System.out.println("New questions, new problems");
		else
			System.out.println("And we get there in the end");
	}
}
