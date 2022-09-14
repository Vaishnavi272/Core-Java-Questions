package com.javaCore7;


//1. public: 
//class Sample{
//     public int x;
//     public void display(){
//
//     }
//}
//class Demo{
//     
//}
//Access Level: same class, other class, child class, same package, other package
//
//2. private:
//class Sample{
//     private int x;
//}
//class Demo{
//     
//}
//Access Level: only within same class.
//
//3. protected:
//class Sample{
//     protected int x;
//}
//
//Access Level: same class, other class, child class, same package, other package (but only in child classes)


public class Encapsulation {
	  private int id;
	    private String name;
	    private float salary;

	    public void setId(int id){
	     if (id>0) {
	       this.id=id;
	     }
	     else{
	          System.out.println("id must be greater than 0");
	     }
	        
	    }

	    public void setName(String name){
	     if (name!=null || name!="") {
	          this.name=name;
	     }
	     else{
	          System.out.println("name cannot be empty");
	     }
	    }

	    public void setSalary(float salary){
	     this.salary=salary;
	    }
	    
	    public int getId(){
	     return id;
	    }
	    public String getName(){
	     return name;
	    }
	    public float getSalary(){
	     return salary;
	    }

	    
      public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Encapsulation emp=new Encapsulation();
         emp.setId(101);
         emp.setName("manoj");
         emp.setSalary(1011);
         System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());

	}

}

