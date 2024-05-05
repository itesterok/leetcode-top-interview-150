package com.leetcode.valid_anagram_242;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        assertThat(Solution.isAnagram("anagram", "nagaram")).isTrue();
        assertThat(SolutionFollowUp.isAnagram("anagram", "nagaram")).isTrue();
    }

    @Test
    void testTwo() {
        assertThat(Solution.isAnagram("a", "ab")).isFalse();
        assertThat(SolutionFollowUp.isAnagram("a", "ab")).isFalse();
    }

    @Test
    void testThree() {
        assertThat(Solution.isAnagram("nl", "cx")).isFalse();
        assertThat(SolutionFollowUp.isAnagram("nl", "cx")).isFalse();
    }
}