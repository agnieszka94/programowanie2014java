package pl.edu.uj.tcs.programowanie08.polymorphism;
/**
 * Parent constructor executing child method - be careful with that.
 * 
 * @author marcin
 *
 */

public class Class05ReachDown {
    static class Base {
        Base() {
            f();
        }
        void f() {
            System.out.println("I am Base");
        }
    }
    static class Derived extends Base {
        void f() {
            System.out.println("I am Derived");
        }
    }
    public static void main(String[] args) {
        new Derived();
    }

}
