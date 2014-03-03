package pl.edu.uj.tcs.programowanie07.compositionandinheritance;

public class Class10Final {
	static class IntBox {
		int i;

		final public int getValue() {
			return i;
		}
	}

	static class IntBox2 extends IntBox {
		/*
		 * compile-time error public int getValue() { return i+1; }
		 */
	}

	public static final int MY_FAVORITE_INT = 137;
	public static final int POSSIBLY_MY_FAVORITE_INT = new java.util.Random()
			.nextInt();
	public final int mySecondFavoriteInt = 147;
	final int yetAnotherFavorite;
	final IntBox myFavoriteBox = new IntBox();

	Class10Final(int yetAnotherFavorite) {
		this.yetAnotherFavorite = yetAnotherFavorite;
	}

	void bumpMyBox() {
		myFavoriteBox.i++;
		// /myFavoriteBox = new IntBox(); compile-time error
	}

	public static void main(String[] args) {
		Class10Final temp = new Class10Final(17);
		temp.bumpMyBox();
		temp.bumpMyBox();
		System.out.println(temp.myFavoriteBox.i + " is in the box.");
	}

}
