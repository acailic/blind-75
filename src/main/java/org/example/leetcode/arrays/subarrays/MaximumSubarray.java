package org.example.leetcode.arrays.subarrays;

public class MaximumSubarray {
   // like contigious subarray
    // Kadane's Algorithm
    public void maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println("Max sum: " + maxSum);
    }
    // explain kadanes algorithm
// https://www.youtube.com/watch?v=86CQq3pKSUw
    /*
    Kadenes algorithm is used to find the maximum sum of a contiguous subarray
    within an array of numbers. It is a very efficient algorithm with a time
    complexity of O(n). It is also known as the largest sum contiguous subarray
    problem. The algorithm is as follows:
    Initialize:
    max_so_far = 0
    max_ending_here = 0
    Loop for each element of the array
    (a) max_ending_here = max_ending_here + a[i]
    (b) if(max_ending_here < 0)
    max_ending_here = 0
    (c) if(max_so_far < max_ending_here)
    max_so_far = max_ending_here
    return max_so_far

     */
}
