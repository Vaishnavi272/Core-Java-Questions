package com.springCore4;


// Used to call same class constructor.
public class ThisKeyword3 {
	 int id;
     String name;
     float salary;
     String department;
     int leaves;
    
     ThisKeyword3(){
      leaves=20;
    }

     ThisKeyword3(int id,String name,float salary, String department){
          this();              // this() must be the qst statement in the constructor
          this.id=id;
          this.name=name;
          this.salary=salary;
          this.department=department;
     }
    
     void show(){
          System.out.println(this.id+" "+this.name+" "+this.salary+" "+this.department+" "+leaves);
     }


     public static void main(String[] args) {
    	 ThisKeyword3 emp1=new ThisKeyword3(101,"mohan",8765,"sales");
    	 ThisKeyword3 emp2=new ThisKeyword3(102,"sohan",6655,"it");
          emp1.show();
          emp2.show();   
     }

}
