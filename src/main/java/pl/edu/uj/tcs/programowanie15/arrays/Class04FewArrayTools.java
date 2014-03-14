package pl.edu.uj.tcs.programowanie15.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * An overview of the few tools provided by class Arrays.
 * 
 * @author kozik
 * 
 */
public class Class04FewArrayTools {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] temp1 = new int[10];
		System.out.println(Arrays.toString(temp1));
		Arrays.fill(temp1, 17);
		System.out.println(Arrays.toString(temp1));
		Random rG = new Random();
		for (int i = 0; i < 10; i++)
			temp1[i] = rG.nextInt(17);
		int[] temp2 = Arrays.copyOf(temp1, temp1.length);
		System.out.println(Arrays.toString(temp1));
		Arrays.sort(temp1);
		System.out.println(Arrays.toString(temp1));
		for (int i = 0; i < 17; i++)
			System.out.println("found " + i + " at pos: "
					+ Arrays.binarySearch(temp1, i));
		for (int i = 0; i < 17; i++)
			System.out.println("found " + i + " at pos: "
					+ Arrays.binarySearch(temp1, i)
					+ " and found in unsorted at pos: "
					+ Arrays.binarySearch(temp2, i));
	}

}
