package pl.edu.uj.tcs.programowanie11.basicsofcontainers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/**
 * The class inherits from ArrayList and allows to browse a shuffled list of values. 
 * This is done by returning a light object with this interface. 
 * 
 * @author kozik
 *
 * @param <T>
 */
public class Class09ExtendedArrayList<T> extends ArrayList<T> {

	/**
	 *  Superclass implements serializable and so do we, and so we need a version ID.
	 */
	private static final long serialVersionUID = 7661559647311768304L;

	/**
	 * You SHOULD provide all the constructors your superclass does. 
	 */
	Class09ExtendedArrayList() {
	}

	Class09ExtendedArrayList(Collection<T> col) {
		super(col);
	}

	public Iterable<T> reversed() {
		return new Iterable<T>() {
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					private int currentPos = size() - 1;

					public boolean hasNext() {
						return currentPos >= 0;
					}

					public T next() {
						return get(currentPos--);
					}

					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	public Iterable<T> shuffled() {
		return new Iterable<T>() {
			private ArrayList<T> shuffledList = new ArrayList<T>();
			{
				shuffledList.addAll(Class09ExtendedArrayList.this);
				Collections.shuffle(shuffledList);
			}

			public Iterator<T> iterator() {
				return new Iterator<T>() {
					private Iterator<T> localIt = shuffledList.iterator();

					public boolean hasNext() {
						return localIt.hasNext();
					}

					public T next() {
						return localIt.next();
					}

					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class09ExtendedArrayList<String> temp = new Class09ExtendedArrayList<String>(
				Arrays.asList("Ala", "ma", "kota", "."));
		for (String i : temp)
			System.out.print(i + " ");
		System.out.println();
		for (String i : temp.reversed())
			System.out.print(i + " ");
		System.out.println();
		for (String i : temp.shuffled())
			System.out.print(i + " ");
		System.out.println();
	}

}
