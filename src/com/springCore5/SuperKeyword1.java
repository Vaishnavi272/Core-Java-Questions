package com.springCore5;


//Super keyword refers to the object of parent class.
//1. Used to differentiate parent class and child class variable when both have same name.


public class SuperKeyword1 {
     
	 String color="white";
	 }
	 class Dog extends SuperKeyword1{
	    String color="black";
	    void showColor(){
	    	System.out.println(super.color);                                // result white
	       System.out.println(super.color+" "+this.color);                   // result  white black
	    }
	
     public static void main(String[] args) {
    	 Dog s = new Dog();
    	 s.showColor();
     }
	
     }
