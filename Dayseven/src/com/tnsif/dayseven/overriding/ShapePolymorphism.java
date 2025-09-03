package com.tnsif.dayseven.overriding;



//Parent class
class Shape {
void draw() {
   System.out.println("Drawing a shape");
}
}

//Child class Circle
class Circle extends Shape {
@Override
void draw() {
   System.out.println("Drawing a Circle");
}
}

//Child class Square
class Square extends Shape {
@Override
void draw() {
   System.out.println("Drawing a Square");
}
}

public class ShapePolymorphism {
public static void main(String[] args) {
   Shape s;  // reference of parent class

   s = new Circle();  
   s.draw();   // Output: Drawing a Circle

   s = new Square();  
   s.draw();   // Output: Drawing a Square
}
}


