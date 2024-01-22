package org.example.leetcode.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestStringWithoutRepeting {


    public int lengthOfLongestSubstring(String s) {
        // sliding window, two pointers, map
        Map<Character, Integer> lettMap = new HashMap<>();
        int start=0,  res=0;
        for (int end=0;end<s.length();end++){
            char endChar = s.charAt(end);
            if(lettMap.containsKey(endChar)){
                start = Math.max(start, lettMap.get(endChar)+1);
            }
            lettMap.put(endChar,end);
            res = Math.max(res,end-start+1);
        }

        return res;
    }


    public int lengthOfLongestSubstring2(String s) {
        // sliding window, two pointers, set
        Set<Character> letSet = new HashSet<>();
        int start=0, end=0, res=0;
        while (end<s.length()){
            char endCh = s.charAt(end);
            if(!letSet.contains(endCh)){
                letSet.add(endCh);
                end++;
                res= Math.max(res,letSet.size());
            } else {
                letSet.remove(s.charAt(start));
                // why it removes start ? start is removed because we are moving start to the right
                //
                start++;
            }
        }

        return res;
    }
}
