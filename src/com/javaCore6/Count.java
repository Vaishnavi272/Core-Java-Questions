package com.javaCore6;


//Instantiate an object using constructor and finally print the count in method in constructor increase the count
public class Count {

	static int count=0;
	
	Count(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		Count obj = new Count();

	}

}
