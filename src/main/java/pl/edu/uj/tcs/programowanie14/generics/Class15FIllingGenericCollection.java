package pl.edu.uj.tcs.programowanie14.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
/**
 * Wildcards allow to fill collections in a natural way.
 * 
 * @author marcin
 *
 */
public class Class15FIllingGenericCollection {

	/**
	 * @param args
	 */
	public static interface Generator<T> {
		T generate();
	}

	public static class Generators {
		public static <T> Collection<T> fillInCollection(Collection<T> col,
				Generator<? extends T> gen, int amount) {
			while (amount-- > 0)
				col.add(gen.generate());
			return col;
		}
	}

	public static class IntGen implements Generator<Integer> {
		public Integer generate() {
			return 1;
		}
	}

	public static class NumberGen implements Generator<Number> {
		public Number generate() {
			return 1.0;
		}
	}

	public static void main(String[] args) {
		Generator<Integer> gen1 = new IntGen();
		System.out.println(gen1.generate());
		// Generator<Number> gen2 = new IntGen();
		Generator<? extends Number> gen2 = new IntGen();
		System.out.println(gen2.generate());
		System.out.println(Generators.fillInCollection(new HashSet<Integer>(),
				new IntGen(), 5));
		System.out.println(Generators.fillInCollection(new ArrayList<Number>(),
				new NumberGen(), 5));
		// System.out.println(Generators.fillInCollection(new
		// HashSet<Integer>(), new NumberGen(), 5));
		System.out.println(Generators.fillInCollection(new ArrayList<Number>(),
				new IntGen(), 5));
	}

}
