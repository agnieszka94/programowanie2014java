package pl.edu.uj.tcs.programowanie13.reflection;
/**
 * Examples of obtaining the Class<?> object for a given class.
 * 
 * @author marcin
 *
 */
public class Class03GettingClassObject {

	/**
	 * @param args
	 */
    public static void main(String[] args) {
        try {
            System.out.println(Class.forName("Class03GettingClassObject"));
        } catch (ClassNotFoundException ex) {
            System.out.println("Yep, exceptions possible here.");
        }
        try {
            System.out.println(Class.forName("part13reflection.Class03GettingClassObject"));
        } catch (ClassNotFoundException ex) {
            System.out.println("Yep, exceptions possible here.");
        }
        System.out.println(new Class03GettingClassObject().getClass());
        System.out.println(Class03GettingClassObject.class);
    }

}
