package pl.edu.uj.tcs.programowanie04.strings;

import java.util.Scanner;

public class Class07ScannerCustomDelimiter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sca1 = new Scanner("Ala.ma.kota.a.kot.ma.Ale.");
		sca1.useDelimiter(".");
		while (sca1.hasNext())
			System.out.print("<" + sca1.next() + ">");
		System.out.println();
		sca1.close();

		Scanner sca2 = new Scanner("Ala.ma.kota.a.kot.ma.Ale");
		sca2.useDelimiter("\\.");
		while (sca2.hasNext())
			System.out.print("<" + sca2.next() + ">");
		System.out.println();
		sca2.close();
	}

}
