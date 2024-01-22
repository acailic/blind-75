package org.example.leetcode.arrays;

public class ProductOfArrayExceptSelf {


    // int - 32 bit ?
    public int[] productExceptSelf(int[] nums) {
        // 1 2 6 24   24  24  24  24
        int n = nums.length;
        int[] result = new int [n];
        result[0]=1;
        for(int left=1;left<n;left++){
            result[left] = result[left-1] * nums[left-1];
        }
        int currentRight=1;
        for(int right=n-1;right>=0;right--){
            result[right]*=currentRight;
            currentRight*=nums[right];
        }
        return result;
    }
}
