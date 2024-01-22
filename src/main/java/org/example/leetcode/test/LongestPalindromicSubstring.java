package org.example.leetcode.test;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindrome("babad"));
        System.out.println(lps.longestPalindrome("cbbd"));
        System.out.println(lps.longestPalindrome("a"));
        System.out.println(lps.longestPalindrome("ac"));
    }
    //
    public String longestPalindrome(String s) {
        if (s==null|| s.length()<1) return "";
        if(s.length()==1 || s.length()==2) return s;
        int start=0, end=0 ;
        for(int i=0;i<s.length();i++){
            int len1 =expandAroundCentre( s, i,i ); //even
            int len2 =expandAroundCentre( s, i, i+1); //odd
            int maxLen=Math.max(len1,len2);
            if(maxLen>end-start){
                // ako je veci nego sto je bilo
                start= i-(maxLen-1)/2;
                end = i +maxLen/2;
            }
        }
        return s.substring(start, end+1);
    }

    int expandAroundCentre(String s, int l , int r){
        int left = l, right = r;
        while(right<s.length()&& left >= 0  && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left+1;
    }

}
