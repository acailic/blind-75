package org.example.leetcode.arrays.subarrays;

import java.util.HashMap;

public class ContinuousSubarraySum {
    // prefix sum and hashmap
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int cumulativeSum = 0;
        for (int i = 0; i < nums.length; i++) {
            cumulativeSum += nums[i];
            int mod = cumulativeSum % k;
            if (mod < k) {
                mod += k;
            }
            if (map.containsKey(mod)) {
                if (i - map.get(mod) > 1) {
                    return true;
                }
            } else {
                map.put(mod, i);
            }

        }
        return false;
    }
}