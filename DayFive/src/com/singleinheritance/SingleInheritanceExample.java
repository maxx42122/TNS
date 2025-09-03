package com.singleinheritance;

//Base class
class Animal {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Derived class (single inheritance)
class Dog extends Animal {
 void bark() {
     System.out.println("The dog barks.");
 }
}

//Main class to run the example
public class SingleInheritanceExample {
 public static void main(String[] args) {
     Dog myDog = new Dog();

     // Accessing methods from both classes
     myDog.eat();   // from Animal
     myDog.bark();  // from Dog
 }
}

