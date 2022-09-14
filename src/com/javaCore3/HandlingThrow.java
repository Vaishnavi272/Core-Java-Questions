package com.javaCore3;


//throw-> it is used to actually throw/occur an exception
class HandlingThrow{
    static void checkEligibility(int age){
        if(age>=18){
            System.out.println("eligible");
        }
        else if(age>0){
            System.out.println("not eligible");
        }
        else{
           ArithmeticException ex=new ArithmeticException("Invalid Age Value");
           throw ex;
        }
    }


    public static void main(String[] args) {
       HandlingThrow.checkEligibility(18);
    }
}
    




