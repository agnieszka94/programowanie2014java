package pl.edu.uj.tcs.programowanie13.reflection;

import java.util.ArrayList;
import java.util.List;
/**
 * Simplest example - type of an object is known at runtime.
 * 
 * @author marcin
 *
 */
public class Class02ObjectTypeKnownAtRuntime {

	public static class Zwierz {
	}

	public static class Kot extends Zwierz {
		public String toString() {
			return "Kot";
		}
	}

	public static class Pies extends Zwierz {
		public String toString() {
			return "Pies";
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Zwierz> lista = new ArrayList<Zwierz>();
		lista.add(new Kot());
		lista.add(new Pies());
		lista.add(new Pies());
		lista.add(new Kot());
		System.out.println(lista);
	}

}
