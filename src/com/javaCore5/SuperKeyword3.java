package com.javaCore5;
//Used to call parent class constructor:
//Note: in the very first line of child class constructor, the parent class constructor will be called automatically.


 public class SuperKeyword3{
    String name;
    int age;
    String phone;
    SuperKeyword3(String name, int age, String phone){
         this.name=name;
         this.age=age;
         this.phone=phone;
    }
}
class Student extends SuperKeyword3{
    int roll;
    float marks;
    String department;
    Student(int roll,float marks,String department,String name,int age,String phone){
         super(name,age,phone);
         this.roll=roll;
         this.marks=marks;
         this.department=department;
    }
    void show(){
         System.out.println(roll+" "+name+" "+department+" "+age+" "+phone+" "+marks+" "+department);
    }

    public static void main(String[] args) {
         Student s1=new Student(101,98.4f,"CS","mohan",19,"919191");
         s1.show();
    }
}

