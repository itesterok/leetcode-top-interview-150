package com.leetcode.remove_element_27;

public class Solution {

    public static int remove(int[] nums, int val) {

        int first = 0;
        int second = 1;
        int k = 0;

        while (first < nums.length && second < nums.length) {
            if (nums[first] == val && nums[second] != val) {
                swap(first, second, nums);
                first++;
                second++;
            }
            else if (nums[first] == val && nums[second] == val) {
                second++;
            }
            else {
                first++;
                second++;
            }
        }

        for (int num : nums) {
            if (num != val) {
                k++;
            }
        }
        return k;
    }

    private static void swap(int first, int second, int[] nums) {
        int tmp = nums[second];
        nums[second] = nums[first];
        nums[first] = tmp;
    }
}
