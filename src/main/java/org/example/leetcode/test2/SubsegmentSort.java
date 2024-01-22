package org.example.leetcode.test2;

import static java.util.Arrays.binarySearch;

//An array of n integers, arr[n] can be partitioned into any number of contiguous subsegments. Every element must present in exactly 1 partition.
//
//        After partitioning, and without changing the order of partitions, sort each partition in non-descending order. Concatenate the sorted partitions and compare the resulting array to the original array, sorted non-descending. If the two match, the set of partitions is valid.
//
//        Find the maximum number of contiguous subsegments in which the array arr can be partitioned such that the set of partitions is val
//https://takeitoutamber.medium.com/hackerank-coding-interview-1-subsegment-sort-ee464b43dfe0
public class SubsegmentSort {

        public static void main(String[] args) {
            int[] nums = new int[]{1,2,2,2,5,0};
            System.out.println(waysToSplit(nums));
        }


    public static int waysToSplit(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        int totalSum = prefixSum[n - 1];
        if (totalSum % 3 != 0) {
            return 0;
        }

        int targetSum = totalSum / 3;
        int currentSum = 0;
        int countFirstPart = 0;
        int result = 0;

        for (int i = 0; i < n - 1; i++) {
            currentSum += nums[i];
            if (currentSum == targetSum * 2) {
                result += countFirstPart;
            }
            if (currentSum == targetSum) {
                countFirstPart++;
            }
        }

        return result;
    }
        public static int waysToSplit1(int[] nums) {
            int n = nums.length;
            int[] prefixSum = new int[n];
            prefixSum[0] = nums[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i-1] + nums[i];
            }

            int res = 0;
            for (int i = 0; i < n - 2; i++) {
                int left = prefixSum[i];
                int j = binarySearch(prefixSum, i + 1, n - 2, left * 2);
                if (j == -1) {
                    continue;
                }
                int right = prefixSum[n - 1] - prefixSum[j];
                int k = binarySearch(prefixSum, j + 1, n - 2, (left + right) / 2);
                if (k == -1) {
                    continue;
                }
                res = (res + k - j) % 1000000007;
            }
            return res;
        }
}
