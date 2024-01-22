package org.example.leetcode.test2;

public class ConversionOfString {
    // transfrom string to integer values
    // converted string a -> 1, b -> 2... i->9# and j->10#...z->26#
    // so input is like 12(3) -> 1222  ->
    // a-1
    // b-3
    // examples:
    // 12(3) -> 1222
    // 126#-> az-> a->1 z->1

    public static void main(String[] args) {
        ConversionOfString conversionOfString = new ConversionOfString();
        String s = "12(3)"; // ABBB
        //String s = "12(3)23#"; // ABB
        String res = conversionOfString.freqAlphabets(s);
        System.out.println(res);
    }


    // 12(3) -> ABBB
    // 126# -> az
    // 13(3) -> ACCC
    // make method to convert string to integer

    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                sb.append((char) ('a' + Integer.parseInt(s.substring(i, i + 2)) - 1));
                i += 2;
            } else if (i + 2 < s.length() && s.charAt(i + 2) == '('){
                int count = Integer.parseInt(s.substring(i + 3, i + 4));
                for (int j = 0; j < count; j++) {
                    sb.append((char) ('a' + Integer.parseInt(s.substring(i, i + 1)) - 1));
                }
                i += 3;

            } else {
                sb.append((char) ('a' + Integer.parseInt(s.substring(i, i + 1)) - 1));
            }
        }
        return sb.toString();
    }
}
