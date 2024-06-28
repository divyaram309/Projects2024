package oops;

//Think of an abstract class like a blueprint for a house
// that gives you some details (like the number of rooms)
// but leaves some details (like room colors) for you to decide.
// An abstract class cannot create an object directly but
// provides a base that other classes can extend.
abstract class Vehicle {
    public void start() {  // A common method
        System.out.println("Vehicle is starting");
    }

    abstract void drive(); // A method that needs to be defined later
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    @Override
    void drive() {
        System.out.println("Bike is driving");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Correctly creating an instance of Car
        myCar.start(); // Calls the common method
        myCar.drive(); // Calls the specific method for Car

        Vehicle myBike = new Bike(); // Correctly creating an instance of Bike
        myBike.start(); // Calls the common method
        myBike.drive(); // Calls the specific method for Bike
    }
}

