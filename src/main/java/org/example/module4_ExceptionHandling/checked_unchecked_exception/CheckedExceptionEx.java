package org.example.module4_ExceptionHandling.checked_unchecked_exception;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionEx {
    public static void main(String[] args) {

        // this line is throwing checked exception due to that compiler will not compile the code
        // and it must need to be handled
        // program must have to handle the checked exception
        try {
            FileReader file = new FileReader("myFile.txt");
        } catch(FileNotFoundException e) {
            System.out.println("file not present");
        }
    }


}
