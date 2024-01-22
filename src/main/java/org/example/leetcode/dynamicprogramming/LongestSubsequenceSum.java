package org.example.leetcode.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubsequenceSum {
    //Given an array of integers, find the longest subarray that has a sum less than or equal to a given target value.

    List<List<Integer>> resultList = new ArrayList<>();


    public int longestSubsequence(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                if (dp[i - num] != -1) {
                    dp[i] = Math.max(dp[i], dp[i - num] + 1);
                }
            }
        }
        return dp[target];
    }


    public List<Integer> longestSubsequenceList(int[] nums, int target) {
        List<Integer>[] dp = new ArrayList[target + 1];
        for (int i = 0; i <= target; i++) {
            dp[i] = new ArrayList<>();
        }

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                if (!dp[i - num].isEmpty() || i == num) {
                    List<Integer> temp = new ArrayList<>(dp[i - num]);
                    temp.add(num);
                    if (dp[i].size() < temp.size()) {
                        dp[i] = temp;
                    }
                }
            }
        }

        return dp[target].isEmpty() ? Arrays.asList(-1) : dp[target];


    }
}
