package com.goldy1992.leetcode._15_3sum

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val toReturn = mutableListOf<List<Int>>()
        if (nums.size == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                toReturn.add(listOf(nums[0], nums[1], nums[2]))
            }
            return toReturn
        }

        var pfirst = 0
        var pLast = nums.size - 1
        var pMiddle = 1
        while (pMiddle < pLast) {
            val sum = nums[pfirst] + nums[pMiddle] + nums[pLast]
            if (sum == 0) {
                toReturn.add(listOf( pfirst, pLast, pMiddle))
            }
            pMiddle++
        }
        return toReturn
    }
}