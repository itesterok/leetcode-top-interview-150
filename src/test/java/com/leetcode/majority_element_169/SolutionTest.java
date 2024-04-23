package com.leetcode.majority_element_169;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        int element = Solution.majorityElement(nums);
        assertThat(element).isEqualTo(2);
    }

}