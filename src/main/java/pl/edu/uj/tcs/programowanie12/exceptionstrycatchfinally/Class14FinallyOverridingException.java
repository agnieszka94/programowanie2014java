package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;

import java.util.Random;

/**
 * An unimportant exception thrown in finally block overrides an important exception.
 * 
 * @author marcin
 *
 */

public class Class14FinallyOverridingException {

    @SuppressWarnings("serial")
	public static class ImportantException extends Exception { }
    
    @SuppressWarnings("serial")
	public static class NotImportantException extends Exception { }
    
    public static void f() throws Exception {
        throw new ImportantException();
    }
    
    public static void g() throws Exception {
        try {
            f();
        }finally{
            if(new Random().nextBoolean()) throw new NotImportantException();
        }
    }
	/**
	 * @param args
	 */
    public static void main(String[] args) {
        try {
            g();
        }catch(Exception e){
            System.out.println("Caught :" + e);
        }

    }

}
