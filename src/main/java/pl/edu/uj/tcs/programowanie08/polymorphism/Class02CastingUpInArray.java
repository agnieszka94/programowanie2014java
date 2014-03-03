package pl.edu.uj.tcs.programowanie08.polymorphism;
/**
 * Objects of different type can be stored in the same array.
 * 
 * @author marcin
 *
 */

public class Class02CastingUpInArray {
    static class Czlowiek {
        public void idzDoPrzodu() {
            System.out.println("czlowiek: ide do przodu.");
        }
    }
    static class Mezczyzna extends Czlowiek{
        public void idzDoPrzodu() {
            System.out.println("mezczyzna: ide do przodu.");
        }
    }
    static class Kobieta extends Czlowiek{
        public void idzDoPrzodu() {
            System.out.println("kobieta: ide do przodu.");
        }
    }
    public static void main(String[] args) {
        Czlowiek[] tab = new Czlowiek[10];
        java.util.Random rand = new java.util.Random();
        for(int i = 0; i<10 ; i++)
            tab[i] = rand.nextBoolean() ? new Kobieta() : new Mezczyzna();
        for(Czlowiek c : tab) c.idzDoPrzodu();
    }

}
