package pl.edu.uj.tcs.programowanie14.generics;

import java.util.ArrayList;
import java.util.List;
/**
 * A class veryfing using reflection the class information for a generic type.
 * 
 * @author marcin
 *
 */
public class Class09ErasureCheckedByReflection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		List<String> strList = new ArrayList<String>();
		intList.add(1);
		// strList.add(1); compile-time error
		strList.add("Ala");
		// intList.add("Ala"); compile-time error
		System.out.println(intList);
		System.out.println(intList.getClass());
		System.out.println(strList);
		System.out.println(strList.getClass());
		System.out.println(intList.getClass() == strList.getClass());
	}

}
