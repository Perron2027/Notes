package com.revature.demo;




public class Main{
    public int sum(int a, int b)
    {
        return a+b;
    }

    public String EvenOrOdd(int a)
    {
        if (a%2 == 1)
        {
            return "YES!";
        }
        else
            return "NO!";
    }
    public String FinalBoss(String c)
    {

        if (c.length() >10)
        {
            return c.charAt(0)  + c + c.charAt(c.length()-1);
        }
        else
            return c;
    }

    public static void Main(String[] args){

        int a;
        char i = 'a';
        short c =0;
        long l =100;
        float f = 0.0f;
        double d = 0.0;
        boolean b = false;
        byte m =1;




        System.out.println("Hello World");
    }
}