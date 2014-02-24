package pl.edu.uj.tcs.programowanie04.strings;

public class Class01StringsAreImmutable {

	   public static void main(String[] args) {
	        String temp1 = new String("hej");
	        System.out.println(temp1);
	        String temp2 = temp1.toUpperCase();
	        System.out.println(temp2);
	        System.out.println(temp1);
	    }
}
