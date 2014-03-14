package pl.edu.uj.tcs.programowanie14.generics;

import java.util.ArrayList;
import java.util.Random;
/**
 * A generic class creating objects of the parameter type using a factory.
 * 
 * @author marcin
 *
 */
public class Class12FactoryIsBetterThanReflection {

	@SuppressWarnings("serial")
	public static class Sequence<T> extends ArrayList<T> {
		private final Factory<T> factory;

		Sequence(Factory<T> factory, int len) {
			this.factory = factory;
			for (int i = 0; i < len; i++)
				add(this.factory.build());
		}
	}

	public static interface Factory<T> {
		T build();
	}

	public static class IntFactory implements Factory<Integer> {
		private final Random rG = new Random();

		public Integer build() {
			return rG.nextInt();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Sequence<Integer>(new IntFactory(), 10));
	}

}
