package pl.edu.uj.tcs.programowanie16.moreoncollections;

/**
 * Example of a class implementing an incorrect equals method.
 * 
 * @author kozik
 *
 */
public class Class05IncorrectEqualsExtendingStrings {

	public static class CaseInsensitiveString {

		private final String s;

		public CaseInsensitiveString(String s) {
			if (s == null) {
				throw new NullPointerException();
			}
			this.s = s;
		}

		@Override
		public boolean equals(Object o) {
			if (o instanceof CaseInsensitiveString) {
				return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
			}
			if (o instanceof String) {
				return s.equalsIgnoreCase((String) o);
			}
			return false;
		}
	}

}
