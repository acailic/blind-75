package org.example.leetcode.string;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        if(s.length()<2) return false;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='{'|| c=='('||c=='['){
                stack.push(c);
            }else {
                char last = stack.pop();
                if(c=='}' && last!='{') return false;
                if(c=='(' && last!=')') return false;
                if(c=='[' && last!=']') return false;
            }
        }
        return true;


    }
}
