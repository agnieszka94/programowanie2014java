package pl.edu.uj.tcs.programowanie16.moreoncollections;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
/**
 * An example of using unmodifiable collections.
 * 
 * @author marcin
 *
 */
public class Class12UnmodifiableCollection {

    public static class IntBox {
        int i;
        IntBox(int i) { this.i = i; }
        public String toString() { return "" + i; }
    }
    public static <T> void testCollection(Collection<T> col, T el0, T el1, T el2) {
        System.out.println("WORKING WITH: " + col.getClass().getSimpleName());
        System.out.print("clear ");
        try{
            col.clear();
            System.out.println("OK");
        } catch(Exception e) { System.out.println("FAILED"); }
        System.out.print("add ");
        try{
            col.add(el1);
            System.out.println("OK");
        } catch(Exception e) { System.out.println("FAILED"); }
        System.out.print("addAll ");
        try{
            col.addAll(Arrays.asList(el1,el2));
            System.out.println("OK");
        } catch(Exception e) { System.out.println("FAILED"); }
        System.out.print("remove ");
        try{
            col.remove(el0);
            System.out.println("OK");
        } catch(Exception e) { System.out.println("FAILED"); }
        System.out.print("remove ");
        try{
            col.remove(el1);
            System.out.println("OK");
        } catch(Exception e) { System.out.println("FAILED"); }
        System.out.print("retainAll ");
        try{
            col.retainAll(Arrays.asList(el1,el2));
            System.out.println("OK");
        } catch(Exception e) { System.out.println("FAILED"); }
    }
	/**
	 * @param args
	 */

    public static void main(String[] args) {
        testCollection(new HashSet<Integer>(Arrays.asList(1,2)), 5,3,4);
        testCollection(Collections.unmodifiableCollection(
                new HashSet<Integer>(Arrays.asList(1,2))), 5,3,4);
        Collection<IntBox> temp2 = new HashSet<IntBox>(Arrays.asList(new IntBox(1),new IntBox(2)));
        Collection<IntBox> temp3 = Collections.unmodifiableCollection(temp2);
        System.out.println(temp2);
        for(IntBox b : temp3 ) b.i++;
        System.out.println(temp2);
        testCollection(temp2, new IntBox(3), new IntBox(4), new IntBox(5));
        testCollection(temp3, new IntBox(3), new IntBox(4), new IntBox(5));
    }


}
