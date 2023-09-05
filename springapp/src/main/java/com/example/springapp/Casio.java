package com.example.springapp;
public class Casio implements Calculator{
   
    int num1,num2;
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int add() {
        int sum;
       sum=num1+num2;
       //System.out.println(num1+num2);      
        return sum;
        // TODO Auto-generated method stub    
    }
    public int sub() {
        // TODO Auto-gene      
         int diff;
        diff=num2-num1;
        // System.out.println(num2-num1);      
          return diff;
                  }

}
