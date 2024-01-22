package org.example.leetcode.dynamicprogramming;

public class HouseRobber {

    // robbing adjecent houses
    // [1 ,2 ,23 ,3 ,5]
    // On Mn
    public int rob(int[] nums) {
        int [] dp = new int[nums.length];
        dp[0]= nums[0];
        if(nums.length>1){
            dp[1]=Math.max(dp[0],nums[1]);
            for (int i=2; i<nums.length;i++){
                dp[i]= Math.max(dp[i-2]+nums[i],dp[i-1]);
            }
        }

        return dp[nums.length-1];
    }

    //optimize use one var
    public int rob2(int[] nums) {

        int prevTwo= nums[0];
        if(nums.length>1){
            int prevOne = Math.max(prevTwo,nums[1]);
            for (int i=2; i<nums.length;i++){
                int temp= prevOne;
                prevOne = Math.max(prevTwo+nums[i],prevOne);
                prevTwo= temp;
            }
            return prevOne;
        }

        return prevTwo;
    }
}
