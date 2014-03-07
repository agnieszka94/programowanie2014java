package pl.edu.uj.tcs.programowanie11.basicsofcontainers;

import java.util.ArrayList;
import java.util.List;
/**
 * Example of using raw types - this is BAD practice. 
 * 
 * @author kozik
 *
 */
public class Class01RawContainerDoNotRepeat {
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		java.util.Random rG = new java.util.Random();
		List temp = new ArrayList();
		for (int i = 0; i < 10; i++)
			temp.add(new Box().set(rG.nextInt(20)));
		for (int i = 0; i < 10; i++) {
			System.out.println(((Box) temp.get(i)).i);
		}
	}
}
