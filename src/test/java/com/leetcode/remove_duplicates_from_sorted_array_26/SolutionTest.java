package com.leetcode.remove_duplicates_from_sorted_array_26;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = Solution.remove(nums);

        assertThat(k).isEqualTo(5);
        assertThat(nums).containsSequence((new int[]{0, 1, 2, 3, 4}));
    }
}