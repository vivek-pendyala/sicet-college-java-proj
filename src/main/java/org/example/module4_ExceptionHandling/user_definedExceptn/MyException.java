package org.example.module4_ExceptionHandling.user_definedExceptn;

public class MyException extends Exception{
    MyException(String msg) {
        super(msg); // with super function parent class constructor called:  public Exception(String message) { super(message); }
    }

}
