package multilevelinheritance;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Derived class from Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

public class MultilevelInheritanceExample {
	public static void main(String[] args) {
        Puppy myPuppy = new Puppy();

        // Accessing methods from all levels of inheritance
        myPuppy.eat();   // from Animal
        myPuppy.bark();  // from Dog
        myPuppy.weep();  // from Puppy
    }
}
