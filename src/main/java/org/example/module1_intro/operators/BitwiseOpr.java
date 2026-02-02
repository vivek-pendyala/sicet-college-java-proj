package org.example.module1_intro.operators;

public class BitwiseOpr {
    public static void main(String[] args){
        int a= 7;
        int b= 9;
        int result;

        result =a&b;
        System.out.println(result);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
    }
}
