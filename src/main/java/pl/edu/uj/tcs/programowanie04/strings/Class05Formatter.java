package pl.edu.uj.tcs.programowanie04.strings;

import java.util.Formatter;

public class Class05Formatter {

	public static void main(String[] args) {
		Formatter temp = new Formatter(System.out);
		temp.format("[%d] [%f]\n", 1, 1.0);
		temp.format("[%2$10.2f] [%2$-10f]\n", 1, 1.0);
		temp.format("[%1$3.4s] [%1$-12.4s]\n", "AlaMaKota");
		temp.format("[%b] [%b]\n", false, 0);// warning for C users
		temp.format("[%2$12.3e] [%2$e]\n", 1, 1.0);
		temp.close();
	}
}
