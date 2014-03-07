package pl.edu.uj.tcs.programowanie10.nestedclasses;
/**
 * Using anonymous class to implement factory method pattern.
 * 
 * @author kozik
 *
 */

public class Class08CookieFactory {

	static interface Cookie {
		void taste();
	}

	static interface CookieFactory {
		Cookie getCookie();
	}

	static class MolassesCrinkles implements Cookie {
		public static final CookieFactory factory = new CookieFactory() {
			public Cookie getCookie() {
				return new MolassesCrinkles();
			}
		};

		@Override
		public void taste() {
			System.out.println("Ummm, tasty");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CookieFactory tempFact = MolassesCrinkles.factory;
		// from this point on all the code is the same no matter what we have in
		// the line above
		tempFact.getCookie().taste();
		tempFact.getCookie().taste();
	}

}
