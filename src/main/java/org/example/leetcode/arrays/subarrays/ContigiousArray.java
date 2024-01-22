package org.example.leetcode.arrays.subarrays;

import java.util.HashMap;

public class ContigiousArray {

    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        hm.put(0,-1);
        int sum=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) sum--;
            else sum++;
            if(hm.containsKey(sum)){
                max=Math.max(max,i-hm.get(sum));
            }else
                hm.put(sum,i);
        }
        return max;
    }
}
