package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode356 {
    int nums[] = {1,2,3,4,5,6,7,8,9,10};
    // set from array
    Set<Integer> uniqueVal = Arrays.stream(nums).boxed().collect(Collectors.toSet());
    // explain me boxed
    // boxed() method is used to wrap each element of the stream into an Integer class.
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> uniqueVal = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int k=uniqueVal.size();
        int n = nums.length;
        int i=0, res=0;
        Map<Integer,Integer> count = new HashMap<>();
        for (int j=0;j<n;++j){
            if(count.getOrDefault(nums[j],0)==0){
                k--;
            }
            //
            count.put(nums[j],count.getOrDefault(nums[j],0)+1);
            while(k==0){
                count.put(nums[i],count.get(nums[i])-1);
                if(count.get(nums[i])==0){
                    k++;
                }
                i++;
                System.out.println("i:"+i+" j:"+j+" k:"+k);
            }
            res+=i;
            System.out.println("res:"+res);
        }
        return res;
    }

}
