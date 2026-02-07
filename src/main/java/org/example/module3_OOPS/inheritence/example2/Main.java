package org.example.module3_OOPS.inheritence.example2;

public class Main {
    public static void main(String[] args) {
        Bike bullet = new Bike();

        Bike tourer = new Bike();

        Car bmw = new Car();
        bmw.doorcount = 2;
        bmw.color = "black";
        bmw.rc = "sadfa23424afasd";
        bmw.engine = new Engine();
        bmw.engine.power = "5000";
    }
}

