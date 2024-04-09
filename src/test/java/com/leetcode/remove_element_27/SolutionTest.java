package com.leetcode.remove_element_27;

import org.junit.jupiter.api.Test;

import static com.leetcode.remove_element_27.Solution.remove;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void testOne() {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;

        int result = remove(nums, val);

        assertThat(result).isEqualTo(2);
        assertThat(nums).containsExactly(2, 2, 3, 3);
    }

    @Test
    void testTwo() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int result = remove(nums, val);

        assertThat(result).isEqualTo(5);
        assertThat(nums).containsExactlyInAnyOrder(0, 1, 4, 0, 3, 2, 2, 2);
    }
}