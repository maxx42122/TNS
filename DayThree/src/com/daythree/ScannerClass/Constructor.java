package com.daythree.ScannerClass;

public class Constructor {
	// default constructor
		public Constructor()
		{
			System.out.println("Default Constructor for student");
		}
		
		//parametrized constructor
		
		public Constructor(int id, String name)
		{
			System.out.println("Parametrized Constructor");
			System.out.println(id+" "+name);
		}
		public static void main(String[] args) {

			Constructor obj1 = new Constructor(); 
			Constructor obj2 = new Constructor(101, "Smita");
			
			
		}

}
