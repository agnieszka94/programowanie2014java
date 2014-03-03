package pl.edu.uj.tcs.programowanie08.polymorphism;
/**
 * Casting down is a bad practice (but possible to do).
 * 
 * @author marcin
 *
 */
public class Class03CastingDown {
	static class Czlowiek {
		public void idzDoPrzodu() {
			System.out.println("Ja, czlowiek, ide do przodu.");
		}
	}

	static class Mezczyzna extends Czlowiek {
		public void idzDoPrzodu() {
			System.out.println("Ja, mezczyzna, ide do przodu.");
		}

		public void podkrecWas() {
			System.out.println("Ja, mezczyzna, podkrecam was.");
		}
	}

	static class Kobieta extends Czlowiek {
		public void idzDoPrzodu() {
			System.out.println("Ja, kobieta, ide do przodu.");
		}

		public void zaplecWarkocz() {
			System.out.println("Ja, kobieta, zaplatam warkocz.");
		}
	}

	public static void main(String[] args) {
		Czlowiek[] tab = new Czlowiek[10];
		java.util.Random rand = new java.util.Random();
		for (int i = 0; i < 10; i++)
			tab[i] = rand.nextBoolean() ? new Kobieta() : new Mezczyzna();
		for (Czlowiek c : tab) {
			c.idzDoPrzodu();
			// exceptions to direct the flow of execution - terrible idea
			try {
				((Mezczyzna) c).podkrecWas();
			} catch (java.lang.ClassCastException e) {
				System.out.println("To nie mężczyzna.");
			}
			try {
				((Kobieta) c).zaplecWarkocz();
			} catch (java.lang.ClassCastException e) {
				System.out.println("To nie kobieta.");
			}
			System.out.println();
		}
	}

}
