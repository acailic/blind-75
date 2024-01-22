package org.example.leetcode.test2;

import java.util.Arrays;

import static java.util.Collections.rotate;

public class ArraysLeftRotation {


    public  static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int [] res = leftRotate(array,4);
        System.out.println(Arrays.toString(res));
    }



//    public static int[] leftRotate(int[] array, int rotations) {
//            int n= array.length;
//            int [] result = new int [array.length];
//            for(int index=0;index<array.length;index++){
//                result[index]= array[(index+rotations+n)%n];
//            }
//            return result;
//    }


    public static int[] leftRotate(int[] array, int rotations) {
        rotate(array, rotations);
        return array;
    }

    private static void rotate(int[] array, int rotations) {
        rotations = rotations%array.length;
        rotate(array, 0, array.length-1);
        rotate(array, 0, rotations);
        rotate(array, rotations, array.length - 1);
    }


    private static void rotate(int [] array, int start, int end){
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

}
