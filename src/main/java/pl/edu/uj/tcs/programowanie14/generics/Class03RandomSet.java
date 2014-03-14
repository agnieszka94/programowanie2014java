package pl.edu.uj.tcs.programowanie14.generics;

import java.util.Set;
/**
 * An interface to be used in Class04RandomHashSet
 * 
 * @author marcin
 *
 * @param <T>
 */
public interface Class03RandomSet<T>  extends Set<T> {
    T getRandom();
}
