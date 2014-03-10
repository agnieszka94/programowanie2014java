package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;

/**
 * Examples of finally block executed while exiting loop or method.
 * 
 * @author marcin
 *
 */
public class Class13FinallyTest {

    public static void f() {
        for(int i = 0; i < 3; i ++) {
            try {
                continue;
            } finally {System.out.println("Finally rocks! (continue)"); }
        }
    }
    @SuppressWarnings("unused")
	public static void g() {
        for(int i = 0; i < 3; i ++) {
            try {
                break;
            } finally {System.out.println("Finally rocks! (break)"); }
        }
    }
    @SuppressWarnings("unused")
	public static void h() {
        for(int i = 0; i < 3; i ++) {
            try {
                return;
            } finally {System.out.println("Finally rocks! (return)"); }
        }
    }
	/**
	 * @param args
	 */
    public static void main(String[] args) {
        f();
        g();
        h();
    }

}
