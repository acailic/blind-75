package org.example.leetcode.other;

import java.util.Arrays;

public class ArrayCanBeSorted {

//    You are given a 0-indexed array of positive integers nums.
//
//    In one operation, you can swap any two adjacent elements if they have the same number of set bits. You are allowed to do this operation any number of times (including zero).
//
//    Return true if you can sort the array, else return false.
//
//    A subarray is a contiguous subsequence of the array.

    public static void main(String[] args) {
        ArrayCanBeSorted arrayCanBeSorted = new ArrayCanBeSorted();
        //[3,16,8,4,2]
        int [] nums2 = {3,16,8,4,2};
        int[] nums = {7, 10, 11, 12, 14, 15, 17, 27, 28, 30, 31};
        System.out.println(arrayCanBeSorted.canSortArray(nums2));
    }
    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        int[] bits = new int[n];
        for (int i = 0; i < n; i++) {
            bits[i] = Integer.bitCount(nums[i]);
        }
        int[] sortedBits = bits.clone();
        Arrays.sort(sortedBits);
        for (int i = 0; i < n; i++) {
            if (bits[i] != sortedBits[i]) {
                boolean found = false;
                for (int j = i + 1; j < n; j++) {
                    if (bits[j] == sortedBits[i]) {
                        found = true;
                        swap(bits, i, j);
                        break;
                    }
                }
                if (!found) {
                    return false;
                }
            }
        }
        return true;

    }

    public void swap(int[] bits, int i, int j) {
        int temp = bits[i];
        bits[i] = bits[j];
        bits[j] = temp;
    }
}
