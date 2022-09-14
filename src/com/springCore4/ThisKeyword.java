package com.springCore4;


//this keyword: refers to the object of same class.
//Compiler always refers instance variables of same class on this keyword. that means compiler will itself place a this keyword.



//1. It is used to differentiate instance and local variable when both have same name.
public class ThisKeyword {

	int id;
    String name;
    float salary;
    String department;

    ThisKeyword(int id,String name,float salary, String department){
         this.id=id;
         this.name=name;
         this.salary=salary;
         this.department=department;
    }
   
    void show(){
         System.out.println(this.id+" "+this.name+" "+this.salary+" "+this.department);
    }


    public static void main(String[] args) {
    	ThisKeyword emp1=new ThisKeyword(101,"mohan",8765,"sales");
    	ThisKeyword emp2=new ThisKeyword(102,"sohan",6655,"it");
         emp1.show();
         emp2.show();   
    }


 }
