package com.javaCore4;


//It is used to call same class method.
public class ThisKeyword2 {

	 void perform(){
         this.display();
         System.out.println("Performing operation....");
    }

    void display(){
         System.out.println("Display method called....");
    }


    public static void main(String[] args) {
              ThisKeyword2 obj=new ThisKeyword2();
              obj.perform();
    }

	
}
