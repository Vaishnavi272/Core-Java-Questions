package com.springCore7;
// hiding internal details showing only internal details

// abstract method-> a method without implementation is call abstract method and a class which contain atleast one abstract method then we need to declare that class as abstract class
abstract class Abstraction {
	abstract void run();
}
class Honda extends Abstraction{
	void run()
	{
		System.out.println("running saftly");
	}


	public static void main(String[] args) {
		Abstraction obj = new Honda();
		obj.run();

	}
}

