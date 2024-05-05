package com.leetcode.valid_anagram_242;

public class Solution {

    public static boolean isAnagram(String s, String t) {

        int length = s.length();
        if (length != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for (char c : tArr) {
            for (int i = 0; i < sArr.length; i++) {
                if (sArr[i] == c) {
                    sArr[i] = 'Я';
                    break;
                }
                if (i == length - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
