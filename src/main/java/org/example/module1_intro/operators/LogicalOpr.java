package org.example.module1_intro.operators;

public class LogicalOpr {
    public static void main(String[] args){
        boolean a= true;
        boolean b =false;

        //and
        System.out.println(a&&b);
        System.out.println(a&&a);
        System.out.println(b&&b);
        System.out.println(b&&a);
        //OR
        System.out.println(a||a);
        System.out.println(a||b);

        //NOT
        System.out.println(!a);
    }
}
