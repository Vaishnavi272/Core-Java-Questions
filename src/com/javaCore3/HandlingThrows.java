package com.javaCore3;


//throws-> used to declare that a method throws an exception. it is used generally for checked exceptions.
class HandlingThrows{
    static void checkEligibility(int age) throws InterruptedException{
        if(age>=18){
            System.out.println("eligible");
        }
        else if(age>0){
            System.out.println("not eligible");
        }
        else{
            //checked
           //ArithmeticException ex=new ArithmeticException("Invalid Age Value");
           InterruptedException ex=new InterruptedException("Invalid Age Value");
            throw ex;
          
        }
    }

    public static void main(String[] args) {
      
        try {
            HandlingThrows.checkEligibility(18);
        } catch (InterruptedException ex) {
            System.out.println("something went wrong");
        }
    }
    
}

//throw-> used to throw an exception. written inside the method body. it will throw only a single exception.
//vs 
//throws-> used to declare an exception. written within method signature. we can declare multiple exceptions using throws keyword



