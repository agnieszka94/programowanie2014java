package pl.edu.uj.tcs.programowanie08.polymorphism;
/**
 * An easy example of a polymorphism applied to methods.
 * 
 * @author marcin
 *
 */

public class Class01CastingUp {
    static class Czlowiek {
        public void idzDoPrzodu() {}
        public static void chodzZeMna(Czlowiek c) {
            System.out.println("Moj gosc sie przedstawia: ");
            c.idzDoPrzodu();
            System.out.println("Wiec ide z nim.");
        }
    }
    static class Mezczyzna extends Czlowiek{
    	@Override
        public void idzDoPrzodu() {
            System.out.println("mezczyzna: ide do przodu.");
        }
    }
    static class Kobieta extends Czlowiek{
    	@Override
        public void idzDoPrzodu() {
            System.out.println("kobieta: ide do przodu.");
        }
    }
    public static void main(String[] args) {
        Czlowiek.chodzZeMna(new Mezczyzna());
        Czlowiek.chodzZeMna(new Kobieta());
    }

}
