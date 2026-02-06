package org.example.module3_OOPS.encapsulation.data_hiding;

public class Person {
    public int age;

    // protected access modifier
    protected String name;

    // default access modifier
    float height;

    // private access modifier
    private String city;

    public void printAge() {
        // variable with public access modifier can be used in same class
        System.out.println(age);

        // we can access variable with protected modifier in same class
        System.out.println(name);

        System.out.println(height);

        System.out.println(city);
    }
}
