package org.example.leetcode.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
        public int combinationSum4(int[] nums, int target) {
            int[] dp = new int[target + 1];
            dp[0] = 1;
            for (int i = 1; i <= target; i++) {
                for (int num : nums) {
                    if (i >= num) {
                        dp[i] += dp[i - num];
                    }
                }
            }
            return dp[target];
        }
        //1 2 3 ->5
        // 1 2 5
}
