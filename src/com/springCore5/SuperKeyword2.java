package com.springCore5;


//Used to call parent class method.
public class SuperKeyword2 {

	String color="white";
    void eat(){
     System.out.println("eating.....");
    }
 }
class Dogs extends SuperKeyword2{
    void showColor(){
       System.out.println(color);
    }
    void spendTime(){
     System.out.println("Spending time.....");
      super.eat();
    }
 
     public static void main(String[] args) {
          Dogs dog=new Dogs();
          dog.spendTime();
     }


}
