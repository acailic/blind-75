package org.example.leetcode.test;

import java.util.StringTokenizer;

public class WordCount {

//    Problem 2: Word Count Implement a function that takes a string as
//    input and returns the number of words in the string,
//    where a word is defined as a sequence of alphanumeric characters
//    separated by spaces or punctuation marks.

    final static String test1= "Problem 2: Word Count Implement a";

     public static void main(String[] args) {
        System.out.print("No of words:"+ wordCount(test1) + " in:"+ test1);
    }

    public static int wordCount(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // \\W+
        String[] words = s.split("\\W+");
        // explain me regex:
        // regex: \\W+ means one or more non-word characters
        return words.length;
    }

    public static int wordCount2(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        StringTokenizer st = new StringTokenizer(s);
        return st.countTokens();
    }
}
