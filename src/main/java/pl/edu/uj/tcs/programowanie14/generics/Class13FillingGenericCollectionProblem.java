package pl.edu.uj.tcs.programowanie14.generics;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
/**
 * Correct typeing for methods filling collection requires a new syntax.
 * 
 * @author marcin
 *
 */
public class Class13FillingGenericCollectionProblem {

	public static interface Generator<T> {
		T generate();
	}

	public static class Generators {
		public static <T> Collection<T> fillInCollection(Collection<T> col,
				Generator<T> gen, int amount) {
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Generators.fillInCollection(new HashSet<Integer>(),
				new IntGen(), 5));
		System.out.println(Generators.fillInCollection(new ArrayList<Number>(),
				new NumberGen(), 5));
		// System.out.println(Generators.fillInCollection(new HashSet<Integer>(), new
		// NumberGen(), 5)); compile-time error
		// System.out.println(Generators.fillInCollection(new ArrayList<Number>(), new
		// IntGen(), 5)); compile-time error
	}

}
