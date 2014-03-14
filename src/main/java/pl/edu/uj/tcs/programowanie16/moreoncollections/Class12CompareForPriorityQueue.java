package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 * A nested class implements compareTo inconsistent with equals - this should be avoided.
 * 
 * @author marcin
 *
 */

public class Class12CompareForPriorityQueue {

    public static class BadExampleDoNotDoIt implements Comparable<BadExampleDoNotDoIt> {
        int i;
        public BadExampleDoNotDoIt(int i) { this.i = i; }
        public int compareTo(BadExampleDoNotDoIt b){
            return b.i < i ? -1 : (b.i > i ? 1 : 0);
        }
        public String toString() { return "" + i; }
    }
	/**
	 * @param args
	 */
    public static void main(String[] args) {
        PriorityQueue<BadExampleDoNotDoIt> temp1 = new PriorityQueue<BadExampleDoNotDoIt>();
        temp1.add(new BadExampleDoNotDoIt(1));
        temp1.offer(new BadExampleDoNotDoIt(1));
        temp1.add(new BadExampleDoNotDoIt(10));
        temp1.offer(new BadExampleDoNotDoIt(2));
        System.out.println(temp1);
        System.out.println(temp1.peek());
        while(true) {
            BadExampleDoNotDoIt b = temp1.poll();
            if(b==null) break;
            System.out.println(b);
        }
        SortedSet<BadExampleDoNotDoIt> temp2 = new TreeSet<BadExampleDoNotDoIt>();
        temp2.add(new BadExampleDoNotDoIt(1));
        temp2.add(new BadExampleDoNotDoIt(1));
        temp2.add(new BadExampleDoNotDoIt(10));
        temp2.add(new BadExampleDoNotDoIt(2));
        System.out.println(temp2);
        System.out.println(temp2.first());
        for(BadExampleDoNotDoIt b : temp2) System.out.println(b);
    }

}
