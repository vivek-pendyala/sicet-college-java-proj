package org.example.module4_ExceptionHandling.user_definedExceptn;

public class Main {

    public static void main(String[] args) {
        try {
            isValidAgeToVote(16);
        } catch(Exception e) {
            System.out.println("got exception");
        }
    }

    public static void isValidAgeToVote(int age) throws MyException {
        if(age<18) {
            throw new MyException("age is invalid");
        } else {
            System.out.println("age is valid");
        }
    }
}

