package pl.edu.uj.tcs.programowanie05.regularexpressions;

public class Class02IsItANumber {

	public static void main(String[] args) {
		System.out.println("12345".matches("(-|\\+)?\\d*"));
		System.out.println("-12345".matches("(-|\\+)?\\d+"));
		System.out.println("+12345".matches("(-|\\+)?\\d+"));
		System.out.println(" 12345".matches("(-|\\+)?\\d*"));
		System.out.println(" 12345".matches("(-|\\+| )?\\d*"));
	}

}
