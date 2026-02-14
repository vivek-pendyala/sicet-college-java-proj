package org.example.module4_ExceptionHandling.Handling_runtimeErr;

public class Ex1_TryCatch {

        public static void main(String[] args) {
            System.out.println("start statement");

            // handled the exception using try-catch block
            try {
                int a = 10/0; // we got arithmetic exception
            } catch(ArithmeticException e) {
                System.out.println("handled arithmetic exception");
            }

            System.out.println("end statement");
        }
    }

