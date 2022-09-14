package com.javaCore;


// when a child class redefine a parent class method is known as method overriding
// method signature must be same in parent and child class return type, method name, and argument must be same
// runtime polymorphism /late binding
// it is used to achieve inheritance
class Car{
		 void run() {
			 System.out.println("car is reunning 45km/h");
		 }
}

// inheritance
class Suv extends Car{
		void run() {
			System.out.println("car is running rough");
		}
	 }
	 
public class MethodOverriding {

	public static void main(String[] args) {
		
        Car obj = new Car();   
        Car obj1 = new Suv();            // dynamic method dispatch   object of child class can be assigned into parent class ref
        obj.run();
        obj1.run();
	}

}
