package org.example.leetcode.arrays.subarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/// beauty is ht xth smallest integer in subarray
/// k -size of array,
public class SubArrayBeaty {
    // TODO:
    public static void main(String[] args) {

        int[] nums = {1, -1, -3, -2, 3};
        int k = 3, x = 2;
        int [] resArr = getSubarrayBeauty(nums, 3, 2);
        System.out.println(Arrays.toString(resArr));
    }

    public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        // split nums into lists by k elements and sort them
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i += k) {
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < Math.min(i + k, n); j++) {
                list.add(nums[j]);
            }
            lists.add(list);
        }
        for (List<Integer> list : lists) {
            list.sort((a, b) -> Math.abs(a - x) - Math.abs(b - x));
        }

        return  null;
    }
}
