package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.util.Arrays;
/**
 * An example of correctly implemented hashCode
 * 
 * @author marcin
 *
 */
public class Class09ProperHashCode {
	public static class A {
		private static long counter = 0;
		@SuppressWarnings("unused")
		private long id = counter++;
		private byte b = (byte) 174;
		private long l = 174;
		private float f = 1.1f;
		private int[] a = new int[10];
		private String str = "ala";

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof A))
				return false;
			A temp = (A) o;
			return (b == temp.b)
					&& (l == temp.l)
					&& (Float.floatToIntBits(f) == Float.floatToIntBits(temp.f))
					&& Arrays.equals(a, temp.a) && str.equals(temp.str);
		}

		@Override
		public int hashCode() {
			int result = 17;
			result = result * 31 + (int) b;
			result = result * 31 + (int) (l ^ (l >>> 32));
			result = result * 31 + Float.floatToIntBits(f);
			result = result * 31 + (a == null ? 0 : Arrays.hashCode(a));
			result = result * 31 + (str == null ? 0 : str.hashCode());
			return result;
		}

	}

}
