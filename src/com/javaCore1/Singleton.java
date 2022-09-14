package com.javaCore1;

public class Singleton {
	
	// this design pattern provide one of the best way to create an object.
	//this pattern involves a single class which is responsible  to create an object  while making sure that only single object get created.
    
	
	// here i am creating object of singleton class
	
	private static Singleton instance = new Singleton();
	
	//here i am creating one constructor 
	private Singleton() {
	}
	
	// get the object
	public static Singleton getInstance() {
		return instance;
	}
	
	public void show() {
		System.out.println("hello this is vaishnavi");
	}
	public static void main(String[] args) {
		// get the object 
		
		Singleton object = Singleton.getInstance();
		object.show();

	}

}
