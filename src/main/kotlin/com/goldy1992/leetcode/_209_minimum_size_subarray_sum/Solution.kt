package com.goldy1992.leetcode._209_minimum_size_subarray_sum

class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var currentSum = nums[0]
        var windowLeft = 0
        var windowRight = 1
        var subArrayLength = nums.size + 1

        while (windowRight <= nums.size) {
            if (currentSum >= target) {
                val windowSize = windowRight - windowLeft
                if (windowSize < subArrayLength) {
                    subArrayLength = windowSize
                }
                if (windowLeft + 1 < windowRight) {
                    currentSum -= nums[windowLeft]
                    windowLeft++
                } else {
                    if (windowRight + 1 <= nums.size - 1) {
                        currentSum += nums[windowRight]
                    }
                    windowRight++
                }
            } else {
                if (windowRight + 1 <= nums.size) {
                    currentSum += nums[windowRight]
                }
                windowRight++
            }



        }
        return if (subArrayLength > nums.size) 0 else subArrayLength
    }
}