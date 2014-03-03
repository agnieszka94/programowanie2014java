package pl.edu.uj.tcs.programowanie09.abstractclassesandinterfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;
/**
 * A example of using an interface to use Scanner with a custom source.
 * 
 * @author marcin
 *
 */

public class Class04UsingScannerViaInterface {
	static class AlaMaKota implements Readable {
		private final String alaMaKota = "Alamakota";
		private final Random rG = new Random();

		@Override
		public int read(CharBuffer cB) {
			if (rG.nextInt(20) < 3)
				return -1;
			int pos = 0, no = 0;
			while (pos < alaMaKota.length()) {
				cB.append(alaMaKota.charAt(pos));
				pos += rG.nextInt(2);
				no++;
			}
			if (rG.nextBoolean()) {
				cB.append(" ");
				no++;
			}
			return no;
		}
	}

	public static void main(String[] args) {
		Scanner par = new Scanner(new AlaMaKota());
		while (par.hasNext())
			System.out.println(par.next());
		par.close();

	}

}
