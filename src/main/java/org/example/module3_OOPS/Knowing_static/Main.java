package org.example.module3_OOPS.Knowing_static;

public class Main {
        public static void main(String[] args) {
            Animal cow = new Animal();
            cow.color = "white";
            System.out.println(cow.color);
            cow.printDetail();

            Animal.legCount = 2;
            Animal.myFunction();

            cow.legCount = 4;
            Animal dog = new Animal();
            dog.color = "black";
            System.out.println(dog.legCount);
        }
    }

