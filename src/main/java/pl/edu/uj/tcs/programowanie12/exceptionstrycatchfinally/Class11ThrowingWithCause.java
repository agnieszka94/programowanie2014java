package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;
/**
 * One exception can cause a next one - this a way to implement it.
 * 
 * @author kozik
 *
 */
public class Class11ThrowingWithCause {

    public static void f() throws Exception {
        throw new Exception();
    }
    public static void g() throws Exception {
        try {
            f();
        } catch(Exception e) {
            System.out.println("I thought I could handle it, but I cannot, dig in for info if interested.");
            throw new Exception(e);
        }
    }
	/**
	 * @param args
	 */
    public static void main(String[] args) {
        try {
            g();
        } catch(Exception e) { e.printStackTrace(); }
    }

}
