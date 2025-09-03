package FinalKeyword;

class Vehicle {
    // final method cannot be overridden
    final void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    // This would cause a compile-time error:
    // void start() {
    //     System.out.println("Car is starting...");
    // }
    
    void drive() {
        System.out.println("Car is driving...");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Inherited final method
        myCar.drive();  // Subclass method
    }
}

