package org.example.leetcode.test2;

import java.util.Arrays;

//        Role - SDE 2 (Connectors)
//        Stage - Online Assessment
//        Platform - Hackerrank
//
//        Given a string as an input, & a list of queries. We are given a list of queries, in each query, we have - startIndex, endIndex, number of substitutions(nos). The problem is to identify (for each query) whether the substring defined by [startIndex,endIndex] can be converted to a palindrome by applying not more than the provide number of substitutions & rearranging the substring (if required).
//        For each query, if the substring can be converted to a palindrome , append '1' to the result string else append '0' to the result string. Finally print the result string.
//
//        Ex- s = aabdcdwq
//
//        Query[0] = [1, 3, 1]
//        s[1:3] = abd
//        we can substitue 'd' by 'a' to form 'aba' which is a palindrome , so append '1' to the result
//
//        Query[1] = [0,3, 1]
//        s[0:3] = aabd
//        we can substitute 'd' by 'b' and rearrange the substring to make it "abba", so append '1' to the result
//
//        Query[2] = [0, 7, 1]
//        s[0:7] = aabdcdwq
//        No way to make this substring palindrome in 1 substitution, so append '0' to the result
//
//        print 110
//
//        Constraints:
//        String consists of lowercase english letters only
//        n: length of string
//        1<=n <= 10^6
//        number of queries <= 100
public class SubStringPalindrome {

    public String canFormPalindrom(String s, int [][]queries){
        StringBuilder sb = new StringBuilder();
        for(int [] query: queries){
            int start =query[0];
            int end = query[1];
            int substition = query[2];

            String word = s.substring(start, end+1);
            char [] freq = new char[26];
            for (char let: word.toCharArray()) {
                freq[let-'a']++;
            }
            int oddcount = 0;
            for(int i=0;i<26;i++){
                if(freq[i]%2!=0){
                    oddcount++;
                }
            }

            if(oddcount<=1){
                sb.append('1');
            } else {
                while(oddcount>1 && substition>1){
                    for(int i=0;i<26;i++){
                        if(freq[i]%2!=0){
                            freq[i]--;
                            substition--;
                            oddcount--;
                        }
                    }
                }
                sb.append(oddcount<=1? sb.append('1'): sb.append('0'));
            }
        }

        return sb.toString();
    }


}
