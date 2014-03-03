package pl.edu.uj.tcs.programowanie05.regularexpressions;

public class Class04Replace {

	public static void main(String[] args) {
		System.out
				.println("A34makota A23 ma kota".replaceFirst("A\\d+", "Ala"));
		System.out.println("A34makota A23 ma kota".replaceAll("A\\d+", "Ala"));
		System.out.println("A34makota A23 ma kota"
				.replaceFirst("A\\d+?", "Ala"));
		System.out.println("A34makota A23 ma kota".replaceAll("A\\d+?", "Ala"));
		System.out.println("A34makota A23 ma kota".replaceAll("A\\d+",
				"Ala(was $0)"));
		System.out.println("<!-- comment one --> CODE <!-- comment two -->"
				.replaceAll("<!-- .* -->", "comment"));
		System.out.println("<!-- comment one --> CODE <!-- comment two -->"
				.replaceAll("<!-- .*? -->", "comment"));
	}

}
