package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
/**
 * Using phantom references to objects
 * 
 * @author marcin
 *
 */
public class Class15PhantomReference {

    public static class CashedData {
        public static int cleared = 0;
        public int[] i = new int[10000];
        @Override
        public void finalize(){
            cleared++;
        }
    }

	/**
	 * @param args
	 */
    public static void main(String[] args) {
        ReferenceQueue<CashedData> queue = new ReferenceQueue<CashedData>();
        Set<PhantomReference<CashedData>> set = new HashSet<PhantomReference<CashedData>>();
        CashedData.cleared = 0;
        while(true) {
            set.add(new PhantomReference<CashedData>(new CashedData(), queue));
            if(queue.poll() != null) break;
        }
        System.out.println("In set " + set.size());
        int inQueue = 0;
        while(queue.poll() != null) inQueue++;
        System.out.println("In queue " + inQueue);
        System.out.println("Finalized " + CashedData.cleared);
    }

}
