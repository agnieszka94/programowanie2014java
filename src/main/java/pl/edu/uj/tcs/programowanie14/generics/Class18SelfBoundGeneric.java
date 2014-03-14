package pl.edu.uj.tcs.programowanie14.generics;

/** 
 * An example of a tricky parameter bound.
 * 
 * @author marcin
 *
 */
public class Class18SelfBoundGeneric {

    public static interface StrongEquals<T extends StrongEquals<T>> {
        boolean equals(T o);
    }
    public static class IntBox implements StrongEquals<IntBox> {
        int i;
        public boolean equals(IntBox b){
            return b.i==i;
        }
    }
    public static class B implements StrongEquals<IntBox> {
        public boolean equals(IntBox b) { return false; }
    }

	/**
	 * @param args
	 */
    public static void main(String[] args) {
        IntBox b1 = new IntBox();
        b1.i = 10;
        IntBox b2 = new IntBox();
        b2.i = 11;
        System.out.println(b1.equals(b2));

    }

}
