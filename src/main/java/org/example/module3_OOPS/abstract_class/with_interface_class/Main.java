package org.example.module3_OOPS.abstract_class.with_interface_class;

public class Main {

    public static void main(String[] args) {
        Remote acObj=new Ac();
        acObj.turnOn();

        Remote tvObj=new Tv();
        tvObj.turnOn();

        acObj.turnOff();
        tvObj.turnOff();
    }
}
