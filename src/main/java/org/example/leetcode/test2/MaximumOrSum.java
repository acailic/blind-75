package org.example.leetcode.test2;

public class MaximumOrSum {

    //Given an array of integers nums,
    // find the maximum possible bitwise OR of a subsequence of nums and return the maximum possible score of such a subsequence.
    //

    // Time O(32n) = O(n)
    // Space O(1)
    public long maxOrSum(int[] nums) {
        long res = 0;
        for (int bit = 30; bit >= 0; bit--) {
            res <<= 1;
            long max = res | 1;
            for (int num : nums) {
                if ((num & max) == max) {
                    res = max;
                    break;
                }
            }
        }

        return res;
    }
}
