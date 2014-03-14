package pl.edu.uj.tcs.programowanie13.reflection;
/**
 * An example of recognizing the object type before casting.
 * 
 * @author marcin
 *
 */
public class Class08InstanceOf {

	public static class Czlowiek {
	}

	public static class Kobieta extends Czlowiek {
		public void zaplecWarkocz() {
			System.out.println("Zaplatam warkocz");
		}
	}

	public static class Mezczyzna extends Czlowiek {
		public void podkrecWas() {
			System.out.println("Podkrecam was");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Czlowiek c1 = new Kobieta();
		Czlowiek c2 = new Mezczyzna();
		Czlowiek c3 = new Czlowiek();
		if (c1 instanceof Mezczyzna)
			((Mezczyzna) c1).podkrecWas();
		if (c2 instanceof Mezczyzna)
			((Mezczyzna) c2).podkrecWas();
		if (c1.getClass().isInstance(c2))
			((Kobieta) c2).zaplecWarkocz();
		if (c1.getClass().isInstance(c1))
			((Kobieta) c1).zaplecWarkocz();
		if (c1.getClass() != c2.getClass())
			System.out.println("c1.getClass() != c2.getClass()");
		if (!c1.getClass().equals(c2.getClass()))
			System.out.println("!c1.getClass().equals(c2.getClass())");
		if (c3.getClass().isAssignableFrom(c2.getClass()))
			System.out.println("c3.getClass().isAssignableFrom(c2.getClass())");
	}

}
