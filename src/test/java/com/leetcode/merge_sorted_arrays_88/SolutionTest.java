package com.leetcode.merge_sorted_arrays_88;

import org.junit.jupiter.api.Test;

import static com.leetcode.merge_sorted_arrays_88.Solution.merge;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void testOne() {
        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] num2 = new int[]{2, 5, 6};

        merge(num1, 3, num2, 3);

        assertThat(num1).isEqualTo(new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    void testTwo() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};

        merge(nums1, 1, nums2, 0);

        assertThat(nums1).isEqualTo(new int[]{1});
    }

    @Test
    void testThree() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};

        merge(nums1, 0, nums2, 1);

        assertThat(nums1).isEqualTo(new int[]{1});
    }
}
