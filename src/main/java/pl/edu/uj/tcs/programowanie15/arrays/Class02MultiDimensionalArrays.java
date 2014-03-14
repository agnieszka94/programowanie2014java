package pl.edu.uj.tcs.programowanie15.arrays;

import java.util.Arrays;
/**
 * Multidimensional arrays are just arrays of arrays
 * 
 * @author kozik
 *
 */
public class Class02MultiDimensionalArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] temp1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(temp1);
		System.out.println(Arrays.toString(temp1));
		System.out.println(Arrays.deepToString(temp1));
		int[][][] temp2 = new int[2][3][4];
		System.out.println(Arrays.deepToString(temp2));
		int[][] temp3 = new int[3][];
		System.out.println(Arrays.deepToString(temp3));
		for (int i = 0; i < 3; i++)
			temp3[i] = new int[i];
		System.out.println(Arrays.deepToString(temp3));
		@SuppressWarnings("unused")
		Double d = 2d;
		// Double[] temp4 = new double[2]; compile-time error
	}

}
