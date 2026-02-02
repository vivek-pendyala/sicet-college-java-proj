package org.example.module2_fundamentals;

import java.util.Scanner;
public class AgeChecker {
    public static void main(String[] args){
        System.out.println("Enter your age");
        Scanner obj =new Scanner(System.in);
        int age=obj.nextInt();
        System.out.println("age" +age);
    }
}
