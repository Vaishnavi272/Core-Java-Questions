package com.springCore3;


// Whenever an exception occurs in the program at any line then jvm will crash/terminates the program forcefully. Every exception will have a name through which we can identify about what went wrong.
//Every exception is represented by a class.

public class ExceptionHandling {

	public static void main(String[] args) {
		try{
            System.out.println("welcome");
            int a=6,b=0,c=0;
            c=a/b;
            System.out.println("result "+c);
        }
        catch(ArithmeticException ex){
            System.out.println("Something went wrong");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Something went wrong");
        }
        catch(NullPointerException ex){
            System.out.println("Something went wrong");
        }


	}

}
