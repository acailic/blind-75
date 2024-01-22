package org.example.leetcode.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// DA TI JEBEM MATER IDIOTSKU
public class LeftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int n = arr.size();
        int index=0;
        int [] result = new int [n];
        for(int i=d;i<arr.size();i++){
            result[index]=arr.get(i);
            index++;
        }
        for (int i=0; i<d;i++){
            result[index]=arr.get(i);
            index++;
        }
        // from result to array list
        return Arrays.stream(result).boxed().collect(Collectors.toList());
    }

}
