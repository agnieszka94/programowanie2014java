package pl.edu.uj.tcs.programowanie09.abstractclassesandinterfaces;
/**
 * A naive implementation of a factory method pattern.
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
		@Override
		public void taste() {
			System.out.println("Ummm, tasty");
		}
	}

	static class LocalBakery implements CookieFactory {
		@Override
		public Cookie getCookie() {
			return new MolassesCrinkles();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CookieFactory tempFact = new LocalBakery();
		// from this point on all the code is the same no matter what we have in
		// the line above
		tempFact.getCookie().taste();
		tempFact.getCookie().taste();
	}

}
