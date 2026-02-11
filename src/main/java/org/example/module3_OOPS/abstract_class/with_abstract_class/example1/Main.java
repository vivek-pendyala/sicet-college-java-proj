package org.example.module3_OOPS.abstract_class.with_abstract_class.example1;

public class Main {

    public static void main(String[] args) {
        // we can not create object of abstract class
//        Person obj = new Person();
//        obj.printDetail();

        Teacher t1 = new Teacher();
        t1.printDetail();
        t1.setDetail();
    }
}
