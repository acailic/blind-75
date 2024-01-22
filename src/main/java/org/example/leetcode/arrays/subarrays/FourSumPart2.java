package org.example.leetcode.arrays.subarrays;

import java.util.HashMap;
import java.util.Map;

public class FourSumPart2 {

    /*Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:

            0 <= i, j, k, l < n
    nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0*/

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> counter = new HashMap<Integer,Integer>();
        // nisam stavio ove iznad parametre pa je bilo kao objekat na getOrDefault
        int count= 0;


        for(int num1: nums1) {
            for(int num2:nums2){
                counter.put(num1+num2, counter.getOrDefault(num1+num2 , 0)+1);
            }
        }

        for(int num3: nums3) {
            for(int num4:nums4){
                count += counter.getOrDefault(-(num3+num4), 0);
            }
        }
        return count;

    }

}
