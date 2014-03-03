package pl.edu.uj.tcs.programowanie09.abstractclassesandinterfaces;
/**
 * A class can implement many interfaces.
 * 
 * @author marcin
 *
 */
public class Class05ManyInterfaces {
    static interface Boat {
        void swim();
    }
    static interface Car {
        void drive();
    }
    static class AmphibiousVehicle implements Boat, Car {
        @Override
        public void swim() {
           System.out.println("I am swimming.");
        }
        @Override
        public void drive() {
            System.out.println("I am driving.");
        }
    }
    public static void main(String[] args) {
        AmphibiousVehicle temp = new AmphibiousVehicle();
        temp.swim();
        temp.drive();
        Car tempCar = temp;
        Boat tempBoat = temp;
        tempBoat.swim();
        tempCar.drive();
    }

}
