package com.revature.demo;

public class solution{
    //problem 1 : find sum
    public int sum0fTwoNums(int a , int b){
        int sum= a + b;
    System.out.println("sum =" + sum);
        return sum;



    }

    //problem 2 ; even or odd num
    public String evenOdd(int a){
        if(a % 2==0 ){
            return"Even";
        }
        else{
           return "ODD";
        }

    }
    //problem 3 ; abbreviate string
    public String abr(String s) {
        if (s.length() > 10) {
            s=s.charAt(0)+Integer.toString(s.length())+s.charAt(s.length()-1);
            return s;
        } else {
            return s;
        }
    }
}