package org.example.leetcode.arrays.subarrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindLongestEqualSubarray {


//    Return the length of the longest possible equal subarray after deleting at most k elements from nums.

    public int longestEqualSubarray(int [] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int start = 0, maxFreq = 0, maxLen = 0;

        for (int end = 0; end < nums.length; end++) {
            freqMap.put(nums[end], freqMap.getOrDefault(nums[end], 0) + 1);
            maxFreq = Math.max(maxFreq, freqMap.get(nums[end]));

            if (end - start + 1 - maxFreq > k) {
                freqMap.put(nums[start], freqMap.get(nums[start]) - 1);
                start++;
            }

        }

        return maxFreq;
    }




    // subarray equal longest, all items equal
    public int longestEqualSubarray(List<Integer> nums) {
        int maxLen=0,start=0,end=0;

        while(end<nums.size()){
            if(nums.get(start)!=nums.get(end)){
                start++;
            }

            maxLen= Math.max(maxLen, end-start+1);
            end++;
        }

        return maxLen;
    }
}
