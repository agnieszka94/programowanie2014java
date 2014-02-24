package pl.edu.uj.tcs.programowanie04.strings;

import java.util.Scanner;

public class Class06ScannerBasic {

	public static void main(String[] args) {
		// Scanner sca = new Scanner(System.in);
		Scanner sca = new Scanner(
				"Ala ma kota\n 123 123\n 123123123123123123123123123123123123\n");
		System.out.println("Scanning a line: " + sca.nextLine());
		System.out.println("Scanning an int: " + sca.nextInt());
		System.out.println("Scanning a float: " + sca.nextFloat());
		System.out.println("Scanning a BigInteger: " + sca.nextBigInteger());
		System.out.println("Scanning a line: " + sca.nextLine());
		sca.close();
	}

}
