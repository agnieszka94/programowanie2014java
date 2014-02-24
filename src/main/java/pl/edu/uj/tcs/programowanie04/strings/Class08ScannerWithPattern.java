package pl.edu.uj.tcs.programowanie04.strings;

import java.util.Scanner;

public class Class08ScannerWithPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pat = "\\+.*";
		Scanner sca = new Scanner("+ala-ma-kota+\n-kot+ma+ale-\n");
		while (sca.hasNext(pat))
			System.out.println(sca.next(pat));
		sca.close();
	}
}
