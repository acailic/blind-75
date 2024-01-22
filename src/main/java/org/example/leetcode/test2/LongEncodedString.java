package org.example.leetcode.test2;

import java.util.Arrays;

public class LongEncodedString {

    //encode numb to string
    // 123(2) -> 1233 -> ABCC
    // 123(2)26# -> 123326# -> ABCCZ

    public static void main(String[] args) {
        LongEncodedString les = new LongEncodedString();
       // System.out.println(les.freqAlphabets("10#11#12(3)"));
        System.out.println(Arrays.toString(les.res(les.freqAlphabets("123"))));
        System.out.println(Arrays.toString(les.res(les.freqAlphabets("10#11#12(3)"))));
        System.out.println(Arrays.toString(les.res(les.freqAlphabets("123(2)26#"))));
       // System.out.println(les.freqAlphabets("10#11#12(3)"));
    }

    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                sb.append((char) ('a' + Integer.parseInt(s.substring(i, i + 2)) - 1));
                i += 2;
            }
            /// if 2(3)- BBB
            else if (i + 2 < s.length() && s.charAt(i + 1) == '(') {
                int j = i + 1;
                while (s.charAt(j) != ')') {
                    j++;
                }
                int num = Integer.parseInt(s.substring(i+1, j + 1)
                        .replace("(", "").replace(")", ""));
                for (int k = 0; k < num; k++) {
                    sb.append((char) ('a' + s.charAt(i) - '1'));
                }
                i = j;
            }
            else {
                sb.append((char) ('a' + s.charAt(i) - '1'));
            }
        }
        return sb.toString();
    }

    // convert string alph to counter
    public static int[] res (String letter){
        int [] res= new int [26];
        for (char lett: letter.toCharArray()){
            res[lett-'a']++;
        }
        return res;
    }


}
