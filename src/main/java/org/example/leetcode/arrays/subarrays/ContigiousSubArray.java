package org.example.leetcode.arrays.subarrays;

public class ContigiousSubArray {
    // Kadane's Algorithm
    public static int maxSubArray(int [] nums ){
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        for( int i =0;i<nums.length;i++){
            maxEndingHere = Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);

        }
        return maxSoFar;
    }

    public  static void main(String[] args) {
        int res = maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.print("RES: " +res + " .");
    }
}
