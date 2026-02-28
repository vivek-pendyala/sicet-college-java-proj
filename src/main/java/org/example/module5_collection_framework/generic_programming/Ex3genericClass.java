package org.example.module5_collection_framework.generic_programming;

public class Ex3genericClass {

    public static void main(String[] args) {
        Pair<Integer, String> obj = new Pair();
        obj.var1 = 10;
        obj.var2 = "Hello World";
        obj.display();
    }
}

class Pair<T1, T2> {
    public T1 var1;
    public T2 var2;

    public void display() {
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
    }

}
