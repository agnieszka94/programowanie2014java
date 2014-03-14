package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
/**
 * Using weak references to objects.
 * 
 * @author marcin
 *
 */
public class Class14WeakReferences {

	public static class CashedData {
		public static boolean cleared = false;
		public int[] i = new int[10000];

		@Override
		public void finalize() {
			cleared = true;
		}
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		ReferenceQueue<CashedData> queue = new ReferenceQueue<CashedData>();
		Set<WeakReference<CashedData>> set = new HashSet<WeakReference<CashedData>>();
		//CashedData.cleared = false;
		while (!CashedData.cleared) {
			set.add(new WeakReference<CashedData>(new CashedData(), queue));
		}
		int nulledRef = 0;
		for (WeakReference<CashedData> i : set)
			if (i.get() == null)
				nulledRef++;
		System.out.println("Was " + set.size() + " cleared: " + nulledRef);
		int inQueue = 0;
		while (queue.poll() != null)
			inQueue++;
		System.out.println("In queue " + inQueue);
	}

}
