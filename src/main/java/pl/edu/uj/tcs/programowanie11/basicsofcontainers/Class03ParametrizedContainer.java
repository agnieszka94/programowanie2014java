package pl.edu.uj.tcs.programowanie11.basicsofcontainers;

import java.util.ArrayList;
import java.util.List;
/**
 * A simple class using a parametrized container.
 * 
 * @author kozik
 *
 */
public class Class03ParametrizedContainer {

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
	public static void main(String[] args) {
		java.util.Random rG = new java.util.Random();
		List<Box> temp = new ArrayList<Box>();
		for (int i = 0; i < 10; i++)
			temp.add(new Box().set(rG.nextInt(20)));
		// temp.add("Ala ma kota"); compile time-error
		for (int i = 0; i < 10; i++) {
			System.out.println(temp.get(i).i);
		}
	}

}
