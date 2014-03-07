package pl.edu.uj.tcs.programowanie11.basicsofcontainers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/**
 * Examples of classes implementing Map.
 * 
 * @author kozik
 *
 */
public class Class08ExamplesOfMaps {

	public enum CatOrDog {
		CAT, DOG
	};

	static final Map<String, CatOrDog> mapa = new TreeMap<String, CatOrDog>();
	static {
		mapa.put("Burek", CatOrDog.DOG);
		mapa.put("Mruczek", CatOrDog.CAT);
		mapa.put("Brytan", CatOrDog.DOG);
		mapa.put("Saba", CatOrDog.DOG);
		mapa.put("Filemon", CatOrDog.CAT);
	}

	public static void testMap(Map<String, CatOrDog> ma) {
		System.out
				.println("*** Working with: " + ma.getClass().getSimpleName());
		System.out.println("Content: " + ma);
		ma.put("Ares", CatOrDog.DOG);
		System.out.println("Content (after put): " + ma);
		ma.put("Saba", CatOrDog.CAT);
		System.out.println("Content (after second put): " + ma);
		System.out.println("Keys: " + ma.keySet());
		System.out.println("Values: " + ma.values());
		System.out.println("Ares is a: " + ma.get(new String("Ares")));
		System.out.println("ma has: key \"Burek\" " + ma.containsKey("Burek"));
		System.out.println("ma has: value " + CatOrDog.DOG + " "
				+ ma.containsValue(CatOrDog.DOG));
		System.out.println("*** Finished working with: "
				+ ma.getClass().getSimpleName());
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testMap(mapa);
		testMap(new HashMap<String, CatOrDog>(mapa));
	}

}
