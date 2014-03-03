package pl.edu.uj.tcs.programowanie05.regularexpressions;

public class Class01Basic {

	public static void main(String[] args) {
		System.out.println("Alamakota".matches("Alamakota"));
		System.out.println("Alamakota".matches("123"));
		System.out.println("Alamakota".matches("Ala"));
		System.out.println("Alamakota".matches("Ala\\w+"));
		System.out.println("Alamakota".matches("Alamakota\\w+"));
		System.out.println("Alamakota".matches("Alamakota\\w*"));
	}
}
