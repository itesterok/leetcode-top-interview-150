package com.leetcode.majority_element_169;

import java.util.HashMap;

/**
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * <p>
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 */
public class Solution {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> occurences = new HashMap<>();

        for (int num : nums) {
            occurences.merge(num, 1, Integer::sum);
        }

        int[] max = new int[2];
        occurences.forEach((key, value) ->
        {
            if (value > max[1]) {
                max[1] = value;
                max[0] = key;
            }
        });


        return max[0];
    }
}
