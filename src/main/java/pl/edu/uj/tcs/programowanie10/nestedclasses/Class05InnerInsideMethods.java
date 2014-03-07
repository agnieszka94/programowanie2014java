package pl.edu.uj.tcs.programowanie10.nestedclasses;

/**
 * A class creating an inner class inside a method.
 * 
 * @author kozik
 *
 */
public class Class05InnerInsideMethods {

    String  objectField = "field of outer object";
    Object insideThisOne(final int i) {
        class StrangeInnerClass {
            @Override
            public String toString() {
                return "HEJ HEJ " + i + " " + objectField;
            }
        }
        return new StrangeInnerClass();
    }
	/**
	 * @param args
	 */
    public static void main(String[] args) {
        //InnerInsideMethods.StrangeInnerClass = new InnerInsideMethods().insideThisOne(145);
        // compile-time error
        Object o = new Class05InnerInsideMethods().insideThisOne(145);
        System.out.println(o);
        System.out.println(o);
        System.out.println(o);
    }

}
