package pl.edu.uj.tcs.programowanie04.strings;
import java.util.Random;

public class Class02StringVsStringBuilder {

	public static void main(String[] args) {
		Random rG = new java.util.Random();
		StringBuilder temp1 = new StringBuilder();
		StringBuilder temp2 = new StringBuilder();
		for (int i = 0; i < 20; i++) {
			char c = (char) ('a' + rG.nextInt(26));
			temp1.append(c);
			temp2.append(c).insert(0, c);
		}
		System.out.println(temp1);
		System.out.println(temp2);
	}
}
