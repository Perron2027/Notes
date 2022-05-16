package com.revature.AlecDemo;

public class Main{

    public static void main (String[] args) {
        System.out.println("This is my program!");

        Dog myDoggy = new Dog();
        myDoggy.setName("Spike");
        myDoggy.setGender('M');
        myDoggy.setAge(10);

        myDoggy.Bark();
        System.out.print(myDoggy);
    }
}