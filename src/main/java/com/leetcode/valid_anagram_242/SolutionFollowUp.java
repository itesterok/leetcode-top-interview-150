package com.leetcode.valid_anagram_242;

public class SolutionFollowUp {

    public static boolean isAnagram(String s, String t) {
        int[] sFrequency = new int[26];
        int[] tFrequency = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            int offset = c - 'a';
            sFrequency[offset] = ++sFrequency[offset];
        }

        for (char c : t.toCharArray()) {
            int offset = c - 'a';
            tFrequency[offset] = ++tFrequency[offset];
        }

        for (int i = 0; i < sFrequency.length; i++) {
            if (sFrequency[i] != tFrequency[i]) {
                return false;
            }
        }

        return true;
    }
}
