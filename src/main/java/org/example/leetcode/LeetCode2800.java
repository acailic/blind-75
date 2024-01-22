package org.example.leetcode;
//Given three strings a, b, and c, your task is to find a string that has the minimum length and contains all three strings as substrings.
//        If there are multiple such strings, return the lexicographically smallest one.
//
//        Return a string denoting the answer to the problem.
//
//        Notes
//
//        A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.
//        A substring is a contiguous sequence of characters within a string.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode2800 {

    public String minimumString(String a, String b, String c) {

        return null;
    }


    // order in stream
    int [] candidates = {1,2,3,4,5,6,7,8,9,10};
    int target = 5;
    List<Integer> uniq= Arrays.stream(candidates).filter(val->target>val).boxed().sorted().collect(Collectors.toList());
    // order in stream

    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<Integer> uniq= Arrays.stream(candidates).boxed().sorted().collect(Collectors.toList());
            backtrack(uniq,new LinkedList<>(),0,target);

            return res;

        }

        public void backtrack(List<Integer> cand, LinkedList<Integer> cur, int pos, int target) {
            if(target==0){
                res.add( cur );
                return;
            }
            if(target<0){
                return;
            }
            int prev=0;
            for(int i=pos;i<cand.size();i++){
                if (cand.get(i)==prev){continue;}
                cur.addFirst(cand.get(i));
                backtrack(cand, cur,i+1, target-cand.get(i));
                cur.removeLast();
                prev=cand.get(i);
            }
        }
    }
}
