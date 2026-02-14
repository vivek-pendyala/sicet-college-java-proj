package org.example.module4_ExceptionHandling.Handling_runtimeErr;

public class Ex4_Throws {

    public static void main(String[] args) {
        System.out.println("creating object of Example3_Throw class");
        Ex4_Throws obj = new Ex4_Throws();
        System.out.println("start of program, calling take input method");
        // handle the exception here
        try {
            obj.takeInput();
        } catch(ArithmeticException e) {
            System.out.println("handling the excpetion outside of function which is causing runtime error");
        }

        System.out.println("end of program");
    }

    public void takeInput() throws ArithmeticException {
        // we handle exception in this method itself
//        try {
//            int a = 10/0;
//        } catch(ArithmeticException e) {
//
//        }
        int a = 10/0; // runtime error
    }
}
