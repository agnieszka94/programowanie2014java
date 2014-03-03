package pl.edu.uj.tcs.programowanie09.abstractclassesandinterfaces;
/**
 * Interfaces can inherit from each other.
 * 
 * @author marcin
 *
 */
public class Class06ManyInterfacesWithInheritance {
    static interface Boat {
        void swim();
    }
    static interface Car {
        void drive();
    }
    static interface RaceCar extends Car {
        void driveRealFast();
    }
    static interface AmphibiousVehicle extends Boat, Car {}
    static class SuperCar implements RaceCar, AmphibiousVehicle {
        @Override
        public void swim() {
            System.out.println("Swimming...");
        }
        @Override
        public void drive() {
            System.out.println("Driving...");
        }
        @Override
        public void driveRealFast() {
            System.out.println("Driving as fast as I can...");
        }
    }
    public static void main(String[] args){
        SuperCar temp = new SuperCar();
        temp.swim();
        ((Boat) temp).swim();
        ((Car) temp).drive();
        ((RaceCar) temp).driveRealFast();
        ((AmphibiousVehicle) temp).swim();
        ((AmphibiousVehicle) temp).drive();
    }
}
