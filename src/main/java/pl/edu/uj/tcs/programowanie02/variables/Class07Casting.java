package pl.edu.uj.tcs.programowanie02.variables;

public class Class07Casting {

	public static void main(String[] args) {
		double d = 1.234d;
		int i = 2;
		System.out.println("d = " + d + ", i =" + i);
		d = i;
		System.out.println("d = " + d + ", i =" + i);
		d = 1.234d;
		// int i = d; compile-time error
		i = (int) d;
		System.out.println("d = " + d + ", i =" + i);
		System.out.println("(int) d = " + (int) d);
		System.out.println("(float) d = " + (float) d);
		System.out.println("d = " + d);
	}
}
