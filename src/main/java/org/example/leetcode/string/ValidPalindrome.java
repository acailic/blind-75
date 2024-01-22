package org.example.leetcode.string;

public class ValidPalindrome {

    public boolean isPalindrom(String s) {
        int i=0, j=s.length();
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if(Character.isLetterOrDigit(s.charAt(i))
                && Character.isLetterOrDigit(s.charAt(j)) &&
                    s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;

        }

        return true;
    }
}
