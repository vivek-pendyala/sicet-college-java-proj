package org.example.module3_OOPS.ClassAndConstructor;

public class Test {
    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.colour = "black";
        dog.speed = 15;
        dog.workType();
        dog.sound( "bark");
        Animal cow = new Animal("white",2);
    }
}
