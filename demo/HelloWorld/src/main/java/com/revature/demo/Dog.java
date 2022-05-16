package com.revature.demo;

public class Dog {
    private int year;
    private char size;
    private String name;
    private char gender;
  public Dog(int year, char size, String name, char gender){
      this.year=year;
      this.size=size;
      this.name=name;
      this.gender=gender;
  }

  public char getSize()
  {
      return size;
  }
  public String getName()
  {
      return name;
  }
  public int getYear()
  {
      return year;
  }
  public char getGender()
  {
      return gender;
  }

  public void setSize(char size)
  {
      this.size = size;
  }


    public void setName(String name)
    {
        this.name = name;
    }


    public void setSize(char size)
    {
        this.size = size;
    }
  public void bark()
  {
      System.out.println(name + "barks!");
  }
    @Override
    public String toString() {
        return "Dog{" +
                "year=" + year +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}

