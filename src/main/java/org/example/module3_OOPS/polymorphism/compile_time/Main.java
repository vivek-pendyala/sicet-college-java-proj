package org.example.module3_OOPS.polymorphism.compile_time;

public class Main {

    public static void main(String[] args) {
        Fruit obj = new Fruit();

        // calling getFruit method with no argument
        obj.getFruit();

        // calling getFruit method with 1 argument
        obj.getFruit("banana");

        // calling getFruit method with 2 argument
        obj.getFruit("banana", 5);
    }
}

