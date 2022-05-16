package com.revature.AlecDemo;

public class Dog {
    private String name;
    private char gender;
    private int age;

    //<editor-fold desc="Get/Set">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //</editor-fold>

    Dog(){
    }
    Dog(String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void Bark(){
        System.out.println("Bark!");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
