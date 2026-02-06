package org.example.module3_OOPS.ClassAndConstructor;

public class Animal {
    public String colour;
    public Integer speed;

    Animal(){
        System.out.println("constructor with 0 arguments");
    }

    Animal(String value1, int value2){
        System.out.println("constructor with 2 arguments called");
        colour = value1;
        speed = value2;
    }

    public String workType(){
        return "1";

    }
    public void sound(String sd){
        System.out.println(sd);
    }}
