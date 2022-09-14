package com.javaCore2;

// string objects are immutable we can't change the object itself but we can change the reference to the object

// 1. by creating a literal     2.  by new keyword

//the string made final not allow to others to extend it and destroy its immutability
public final class ImmutableString {
	
	final String myName;                             //the class is final so we cannot create the subclass
	public ImmutableString(String myName) {
		this.myName = myName;
	}
	public String getMyName() {
		return myName;
	}
	
	public static void main(String[] args) {
//		String s1 ="vaishnavi";                 // by creating literal    (constant value)
//		String s2= "vaishnavi";                  
//		String s3 = "vaishnavi";
//		String s = new String("vaishnavi");      //by new keyword
//		
//		System.out.println(s1==s2);
//		System.out.println(s2==s3);
//		System.out.println(s==s1);
	
		
		ImmutableString e = new ImmutableString("vaishnavi");
		String s = e.getMyName();
		System.out.println(s);
		
	}

}
