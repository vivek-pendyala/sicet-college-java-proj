package org.example.module3_OOPS.class_and_objects;

public class Teacher {


        public String name = "xyz";

        public void printName() {

            String name = "abc";

            System.out.println(name);
            System.out.println(this.name);
        }

        public static void main(String[] args) {
            Teacher obj = new Teacher();
            obj.printName();
        }
    }

