package com.springCore;


//in a class we can have more than one method with same name but argument is different  like no. of argument    data type of argument  or  both
// it is also known as compile time polymorphism /static / early binding
public class MethodOverloading {

	public void m1(float f) {
		System.out.println("float argument");
	}
	public void m1(int i) {
		System.out.println("int argument");
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
	   	m.m1(10.0f);          //ambiguty problem  compiler get confused which method is
	   	m.m1(20);
	}
}
