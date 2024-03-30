package com.goldy1992.leetcode._219_contains_duplicates_ii

class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        if (k == 0 || nums.size == 1) {
            return false
        }

        for (n in nums.indices) {
            var leftIdx = n - 1
            while (leftIdx >= n - k && leftIdx >= 0) {
                if (nums[leftIdx] == nums[n]) {
                    return true
                }
                leftIdx--
            }

            var rightIdx = n + 1
            while (rightIdx <= n + k && rightIdx < nums.size) {
                if (nums[rightIdx] == nums[n]) {
                    return true
                }
                rightIdx++
            }
        }
        return false
    }
}