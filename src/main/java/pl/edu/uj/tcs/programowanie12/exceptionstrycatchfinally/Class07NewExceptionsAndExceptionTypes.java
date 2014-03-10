package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;
/**
 * Declaring and throwing custom exceptions of different types.
 * 
 * @author kozik
 *
 */
public class Class07NewExceptionsAndExceptionTypes {

    @SuppressWarnings("serial")
	public static class MyThrowable extends Throwable {}
    @SuppressWarnings("serial")
    public static class MyException extends Exception {}
    @SuppressWarnings("serial")
    public static class MyRuntimeException extends RuntimeException {}
    public static void tryMe() throws MyThrowable, MyException {
        switch(new java.util.Random().nextInt(3)) {
            case 0: throw new MyThrowable();
            case 1: throw new MyException();
            case 2: throw new MyRuntimeException();
        }
    }
	/**
	 * @param args
	 */
    public static void main(String[] args) {
        for(int i = 0; i < 10 ; i++ ){
            try{
                tryMe();
            } catch(Throwable e) {System.out.println(e);}
        }
    }

}
