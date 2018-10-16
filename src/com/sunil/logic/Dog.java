package com.sunil.logic;

public class Dog {
    // instance variables
    String breed;
    String size;
    int age;
    String color;

    //No-Args
    public Dog(){
        breed="DESI KUTTA";
        size ="LARGE";
        age = 50;
    }

    public Dog(String breed, String size, int age, String color){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color=color;
    }

    //method
    public String getInfo(){
        return  (" Breed is:  " +breed + "\n Size is: " + size + "\n Age is : " + age + "\n color is : " + color);
    }

}
