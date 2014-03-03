package pl.edu.uj.tcs.programowanie06.creatingobjects;

/**
 * A class with a simple constructor taking a single int as an argument.
 * 
 * @author kozik
 *
 */
public class Class03ConstructorWithArguments {

    public Class03ConstructorWithArguments(int i) {
        System.out.println("Constructing... " + i);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) new Class03ConstructorWithArguments(i);
        // new ParametrizedConstructor(); will NOT work
    }

}
