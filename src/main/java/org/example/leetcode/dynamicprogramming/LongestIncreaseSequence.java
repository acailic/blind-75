package org.example.leetcode.dynamicprogramming;

public class LongestIncreaseSequence {

    public int lengthOfLIS(int[] nums) {
        int [] dp =new int [nums.length];
        int n= nums.length;
        int maxLength=0;
        // 0,1,0,3,2,
        int max = 1;
        for(int i=0; i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }


    //nlog(n)
    public int lengthOfLIS2(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int num : nums) {
            int i = 0, j = size;
            while (i != j) {
                int mid = (i + j) / 2;
                if (tails[mid] < num)
                    i = mid + 1;
                else
                    j = mid;
            }
            tails[i] = num;
            if (i == size) ++size;
        }
        return size;
    }
}
