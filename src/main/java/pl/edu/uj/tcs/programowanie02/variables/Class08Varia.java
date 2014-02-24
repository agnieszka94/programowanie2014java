package pl.edu.uj.tcs.programowanie02.variables;

public class Class08Varia {

	/**
	 * @param args
	 */
	@SuppressWarnings("all")
	public static void main(String[] args) {
		int a = 0x2f;
		System.out.println("a = " + a);
		a = 017;
		System.out.println("a = " + a);
		boolean aBool = a == (a + 1);
		System.out
				.println(aBool ? "natural numbers don't work" : "yes they do");
		System.out.println("1 == 2? "
				+ ((1 == 2) ? "seems true" : "I would bet it is false"));
		System.out.println("15 == 017? "
				+ ((15 == 017) ? "seems true" : "I would bet it is false"));
	}
}
