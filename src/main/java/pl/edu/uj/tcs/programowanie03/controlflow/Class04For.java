package pl.edu.uj.tcs.programowanie03.controlflow;

public class Class04For {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.print("da");
		System.out.println("ism");
		for (int j = 0, k = 0; j < 10; j++, k--)
			System.out.println("A complicated way to compute " + (k + j));
	}

}
