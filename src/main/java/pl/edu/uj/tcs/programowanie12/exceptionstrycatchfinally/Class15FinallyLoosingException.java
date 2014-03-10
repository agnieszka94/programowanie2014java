package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;

import java.util.Random;

/**
 * Returning from the finally block is a VERY BAD idea.
 * 
 * @author marcin
 *
 */
public class Class15FinallyLoosingException {
    @SuppressWarnings("serial")
	public static class ImportantException extends Exception { }
    public static void f() throws Exception {
        throw new ImportantException();
    }
    public static void g() throws Exception {
        try {
            f();
        }finally{
            if(new Random().nextBoolean()) return;
        }
    }
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        try {
            g();
        }catch(Exception e){
            System.out.println("Caught :" + e);
        }
        System.out.println("The End.");
    }

}
