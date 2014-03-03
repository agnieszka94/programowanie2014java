package pl.edu.uj.tcs.programowanie06.creatingobjects;

import java.util.Arrays;

public class Class13ConstructingArrays {

    public static void main(String[] args) {
        int[] a = { 1, 2, new Integer(17) };
        @SuppressWarnings("unused")
		int[] b;
        int[] c = new int[3];
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println();
        int [][] aArr = new int[3][3];
        for(int[] temp : aArr) System.out.println(Arrays.toString(temp));
        System.out.println();
        int [][] bArr = new int[3][];
        for(int i=0; i<3; i++)
            bArr[i] = new int[3-i];
        for(int[] temp : bArr) System.out.println(Arrays.toString(temp));
        System.out.println();
        System.out.println(Arrays.toString(bArr));
        System.out.println(Arrays.deepToString(bArr));
    }

}
