package pl.edu.uj.tcs.programowanie11.basicsofcontainers;

import java.util.ArrayList;
import java.util.List;
/**
 * Using raw containers leads to runtime errors.
 * 
 * @author kozik
 *
 */

public class Class02RawContainerFail {

	static class Box {
		int i;

		Box set(int i) {
			this.i = i;
			return this;
		}
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		java.util.Random rG = new java.util.Random();
		@SuppressWarnings("rawtypes")
		List temp = new ArrayList();
		for (int i = 0; i < 10; i++)
			temp.add(new Box().set(rG.nextInt(20)));
		temp.add("Ala ma kota");
		for (int i = 0; i < 11; i++) {
			try {
				System.out.println(((Box) temp.get(i)).i);
			} catch (ClassCastException e) {
				System.out.println("It is very bad.");
			}
		}
	}

}
