package com.goldy1992.leetcode._1_two_sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val copy = IntArray(nums.size)
        for (i in nums.indices) {
            copy[i] = nums[i]
        }
        copy.sort()

        var startIdx = 0
        var endIdx = copy.size -1
        var currentTotal = copy[startIdx] + copy[endIdx]
        while (currentTotal != target) {
            if (currentTotal < target) {
                startIdx++
            } else {
                endIdx--
            }
            currentTotal = copy[startIdx] + copy[endIdx]
        }

        val idx1 = nums.indexOf(copy[startIdx])
        var idx2 = 0

        nums.forEachIndexed { idx, n ->
            if (idx != idx1 && n == copy[endIdx]) {
                idx2 = idx
                return@forEachIndexed
            }
        }
        return intArrayOf(idx1, idx2)
    }
}