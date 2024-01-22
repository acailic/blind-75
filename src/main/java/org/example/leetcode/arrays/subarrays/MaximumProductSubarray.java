package org.example.leetcode.arrays.subarrays;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProduct=nums[0], minProduct=nums[0];
        int res= nums[0];

        for(int i=1;i<nums.length;i++){
            // +*+, -*-
            int tempMax = Math.max(nums[i],
                    Math.max(nums[i]*maxProduct,minProduct*nums[i]));
            minProduct = Math.min(nums[i],Math.min(nums[i]*maxProduct,minProduct*nums[i]));
            maxProduct = tempMax;
            res = Math.max(maxProduct,res);
        }

        return res;
    }


    public  static void main(String[] args) {
        int res = maxProduct(new int[]{2,3,-2,4});  
        //6
        System.out.print("RES: " +res + " .");
    }
}
