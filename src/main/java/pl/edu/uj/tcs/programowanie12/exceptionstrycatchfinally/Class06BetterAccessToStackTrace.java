package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;

import java.util.Arrays;
/**
 * Access to stack trace via .getStackTrace().
 * 
 * @author kozik
 *
 */
public class Class06BetterAccessToStackTrace {

    static void f() {
        g();
    }
    static void g() {
        h();
    }
    static void h() { throw new RuntimeException(); }

	/**
	 * @param args
	 */
    public static void main(String[] args) {
        try {
            f();
        } catch(Exception e) {
            StackTraceElement[] temp = e.getStackTrace();
            System.out.println(Arrays.toString(temp));
            for(StackTraceElement ele : temp) System.out.println(ele.getMethodName());
        }
    }

}
