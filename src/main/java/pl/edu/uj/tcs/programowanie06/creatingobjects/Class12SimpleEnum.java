package pl.edu.uj.tcs.programowanie06.creatingobjects;
/**
 * A class containing an enum which is, to be honest, just like a class itself.
 * 
 * @author kozik
 *
 */

public class Class12SimpleEnum {

	enum Colors {
		RED, GREEN, BLUE;
		public String code() {
			switch (this) {
			case RED:
				return "ff0000";
			case GREEN:
				return "00ff00";
			default:
			}
			return "0000ff";
		}
	}

	/**
	 * @param args
	 */
	public static void main(String... args) {
		Colors a = Colors.BLUE;
		System.out.println(a + " is color number " + a.ordinal()
				+ " with code " + a.code());
		for (Colors b : Colors.values())
			System.out.println(b);
	}

}
