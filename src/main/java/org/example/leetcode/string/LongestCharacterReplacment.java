package org.example.leetcode.string;

import java.util.HashMap;

public class LongestCharacterReplacment {
    /// do lowercase on string
    ///int[] keys = s.toLowerCase().chars().toArray();
    public int charachterReplacment(String s, int k){
        /// do lowercase on string2
        //int[] keys = s.toLowerCase().chars().toArray();
        int start=0, maxLength=0, maxCount=0;
        HashMap<Character, Integer> let = new HashMap<>();
        for (int end=0;end<s.length();end++){
            char endChar= s.charAt(end);
            let.put(endChar, let.getOrDefault(endChar,0));
            maxCount = Math.max(maxCount,let.get(endChar));
            // if k is bigger, start ++
            if(end-start+1-maxCount>k){
                char startChar= s.charAt(start);
                let.put(startChar, let.get(startChar)-1);
                start++;
            }
            maxLength = Math.max(maxLength,end-start+1);
        }

        return maxLength;
    }
}
