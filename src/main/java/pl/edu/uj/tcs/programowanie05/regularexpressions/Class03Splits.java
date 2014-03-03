package pl.edu.uj.tcs.programowanie05.regularexpressions;

import java.util.Arrays;

public class Class03Splits {

	public static String pA(String[] args) {
		return Arrays.toString(args);
	}

	public static void main(String[] args) {
		System.out.println(pA("Ala ma kota".split(" ")));
		System.out.println(pA(" Ala  ma  kota ".split(" ")));
		System.out.println(pA("12+123-67*189".split("(\\+|\\*|-)")));
		System.out.println(pA("12+123-67*189".split("\\d+")));
		System.out.println(pA("12+123-67*189".split("\\d*")));
	}
}
