package pl.edu.uj.tcs.programowanie13.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Obtaining constructors/methods/fields using reflection.
 * 
 * @author marcin
 *
 */
public class Class05DiscoveringStructure {

    public static void printStuff(Class<?> c) {
        System.out.println("Constructors:");
        for(Constructor<?> co: c.getConstructors()) {
            System.out.println(" " + co);
        }
        System.out.println("Methods:");
        for(Method me: c.getMethods()){
            System.out.println(" " + me);
        }
        System.out.println("Fields:");
        for(Field fi: c.getFields()){
            System.out.println(" " + fi);
        }
    }
    public static void printMoreStuff(Class<?> c) {
        System.out.println("Constructors:");
        for(Constructor<?> co: c.getDeclaredConstructors()) {
            System.out.println(" " + co);
        }
        System.out.println("Methods:");
        for(Method me: c.getDeclaredMethods()){
            System.out.println(" " + me);
        }
        System.out.println("Fields:");
        for(Field fi: c.getDeclaredFields()){
            System.out.println(" " + fi);
        }
    }
	/**
	 * @param args
	 */
    public static void main(String[] args) {
        try {
            printStuff(String.class);
            printMoreStuff(String.class);
        } catch(Exception e) {
            System.out.println("Something is not allowed here: " + e);
        }
    }

}
