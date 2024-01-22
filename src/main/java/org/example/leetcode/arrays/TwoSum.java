package org.example.leetcode.arrays;

import java.util.HashMap;

public class TwoSum {

    public static void main (String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        int[] res = twoSum(nums, target);
//        System.out.println(res[0] + " " + res[1]);
        int target1 = 12;
        int[] nums1 = {2,6,6,15};
        int[] res1 = twoSum(nums1, target1);
        System.out.println(res1[0] + " " + res1[1]);
    }

        // other way to create a hashmap and check is there
        public static  int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){

                int complement = target-nums[i];
                if(map.containsKey(complement)){
                    res[0]=map.get(complement);
                    res[1]= i;
                    return res;
                }
                map.put(nums[i],i);

            }
            return res;
        }

        public int[] twoSum1(int[] nums, int target) {
            int[] res = new int[2];
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        res[0]=i;
                        res[1]=j;
                        return res;
                    }
                }
            }
            return res;
        }

}
