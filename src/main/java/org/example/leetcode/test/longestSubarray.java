package org.example.leetcode.test;

public class longestSubarray {

// Problem 1: Longest Subarray with Sum Less Than or Equal to Target Given an array of integers, find the longest subarray that has a sum less than or equal to a given target value.
////
    //  find the longest subarray that has a sum less than or equal to a given target value
    // subarray is contiguous elements , subsequence is not contiguous elements
    // subarray example: [1,2,3,4,5] subarray is [1,2,3] or [2,3,4] or [3,4,5] or [1,2,3,4,5]
    // subsequence example: [1,2,3,4,5] subsequence is [1,3,5] or [2,4,5] or [1,2,3,4,5]
    public int longestSubarray(int[] nums, int target) {
       int maxLen=0, start=0, end=0, sum=0;
       while(end<nums.length){
           sum+=nums[end];
           while(sum<=target){
               sum-=nums[start];
               start++;
           }
           maxLen = Math.max(maxLen,end-start+1 );
           end++;
       }
       return maxLen;
    }


}
