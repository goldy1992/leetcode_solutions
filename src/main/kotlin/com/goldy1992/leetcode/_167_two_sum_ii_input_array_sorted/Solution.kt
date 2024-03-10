package com.goldy1992.leetcode._167_two_sum_ii_input_array_sorted

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var largerIdx = numbers.size - 1
        var smallerIdx = 0
        var found = false
        while (!found) {
            val currentTotal = numbers[smallerIdx] + numbers[largerIdx]
            if (currentTotal == target) {
                found = true
            } else if (currentTotal > target) {
                largerIdx--
            } else {
                smallerIdx++
            }
        }
        return intArrayOf(
            if (smallerIdx < largerIdx) smallerIdx + 1 else largerIdx + 1,
            if (smallerIdx > largerIdx) smallerIdx + 1 else largerIdx + 1
        )
    }
}