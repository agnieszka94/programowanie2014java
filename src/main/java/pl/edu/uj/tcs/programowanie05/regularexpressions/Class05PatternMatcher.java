package pl.edu.uj.tcs.programowanie05.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class05PatternMatcher {

	public static void main(String[] args) {
		Pattern pat1 = Pattern.compile("[AOao][tl]a");
		Matcher mat1 = pat1.matcher("Ala ma kota, czy Ola ma kota?");
		while (mat1.find()) {
			System.out.println("Found \"" + mat1.group() + "\" position: "
					+ mat1.start() + "-" + mat1.end());
		}
		Pattern pat2 = Pattern.compile("(\\w+)\\W+(\\w+)");
		Matcher mat2 = pat2
				.matcher("Litwo! Ojczyzno moja! ty jestes jak zdrowie. Ile cie trzeba cenic, ten tylko sie dowie, Kto cie stracil. Dzis pieknosc twa w calej ozdobie Widze i opisuje, bo tesknie po tobie.");
		while (mat2.find()) {
			System.out.println("Found \"" + mat2.group() + "\" position: "
					+ mat2.start() + "-" + mat2.end());
		}
		mat2.reset();
		while (mat2.find()) {
			System.out.println("Found \"" + mat2.group(1) + "\" \""
					+ mat2.group(2) + "\" position: " + mat2.start() + "-"
					+ mat2.end());
		}
	}
}
