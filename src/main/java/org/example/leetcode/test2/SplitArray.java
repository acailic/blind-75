package org.example.leetcode.test2;


import static java.util.Arrays.binarySearch;

//Q
// The array nums contains n non-negative integers. Determine the number of ways to split nums into three non-empty subarrays A1, A2, and A3 with the sum of elements of the subarrays as S1, S2, and S3 respectively, such that S1, S2, and S3 satisfy S2 ≤ S1 + S3.
//
//Return the value modulo (10⁹ + 7).
public class SplitArray {

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

        int res = 0;
        int mod = 1000000007;
        int j = 0, k = 0;
        for (int i = 0; i < n - 2; i++) {
            while (j <= i || (j < n - 1 && prefixSum[j] < 2 * prefixSum[i])) {
                j++;
            }
            while (k < j || (k < n - 1 && 2 * prefixSum[k] <= prefixSum[i] + prefixSum[n - 1])) {
                k++;
            }
            res = (res + k - j) % mod;
        }

        return res;
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
