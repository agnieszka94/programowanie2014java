package pl.edu.uj.tcs.programowanie14.generics;

import java.util.HashMap;
import java.util.Map;
/**
 * More examples of wildcards.
 * 
 * @author marcin
 *
 */
public class Class17MoreOnWildcards {

	public static class TheBox<T> {
		T in;

		public T get() {
			return in;
		}

		public void set(T in) {
			this.in = in;
		}
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Map<Object,Integer> temp1 = new HashMap<String,Integer>();
		@SuppressWarnings("unused")
		Map<?, Integer> temp1 = new HashMap<String, Integer>();
		TheBox<Integer> i = new TheBox<Integer>();
		i.set(10);
		@SuppressWarnings("rawtypes")
		TheBox j = i;
		TheBox<?> k = i;
		System.out.println(j.get());
		System.out.println(k.get());
		j.set(new Integer(20)); // warning: unsafe operations
		// k.set(new Integer(20)); compile-time error
		System.out.println(j.get());
		System.out.println(k.get());
	}

}
