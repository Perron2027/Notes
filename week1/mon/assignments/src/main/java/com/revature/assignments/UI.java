package com.revature.assignments;

public  class   UI{
    public static void  main(String[] args){

        // initializing solution objects
        Easy q1 = new Easy();
        Medium q2 = new Medium();
        Boss q3 = new Boss();

        // q1
        q1.setA(10);
        q1.setB(10);
        System.out.println(q1);

        // q2
        q2.setC(8);
        System.out.println(q2);

        q2.setC(1);
        System.out.println(q2);

        // q3
        q3.setS("localization");
        System.out.println(q3);

        q3.setS("internationalization");
        System.out.println(q3);

        q3.setS("word");
        System.out.println(q3);
    }
}