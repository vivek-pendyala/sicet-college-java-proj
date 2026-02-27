package org.example.module5_collection_framework.list_interface.array_list.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList(Arrays.asList(10, 20, 10, 30, 20, 10, 40, 20));


        ArrayList<Integer> output = new ArrayList(); // output [10, 20, 30, 40]
        // you need to write logic to remove duplicates elements from input
        for(Integer ele: input) {
            if(output.contains(ele)==false) {
                output.add(ele);
            }
        }

        // 10 20 30 40
        for(Integer ele: output) {
            System.out.print(ele + " ");
        }
    }
}