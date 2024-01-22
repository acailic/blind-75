package org.example.leetcode.arrays;

public class MinInRottatedArray {


    // O(log n) time complexity - cause of binary search
    // O(1) space complexity
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(nums[mid]>nums[r]){
                l=mid+1;
            } else {
                r=mid;
            }
        }
        return nums[l];
    }
}
