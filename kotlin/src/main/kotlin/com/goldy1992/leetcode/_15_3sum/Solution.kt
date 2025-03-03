package com.goldy1992.leetcode._15_3sum

class Solution {
    /**
     * Still inefficient compared to the majority of correct solutions
     */
    fun threeSum(nums: IntArray): List<List<Int>> {
        val toReturn = mutableSetOf<List<Int>>()
        if (nums.size == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                toReturn.add(listOf(nums[0], nums[1], nums[2]))
            }
            return toReturn.toList()
        }
        val sortedNums = nums.sorted()
        var pFixed = 0
        while (pFixed < sortedNums.size) {
            var pStart = if (pFixed == 0) 1 else 0
            var pEnd = sortedNums.size - (if (pFixed == sortedNums.size - 1) 2 else 1)

            while (pStart < pEnd) {
                val sum = sortedNums[pFixed] + sortedNums[pStart] + sortedNums[pEnd]
                if (sum == 0) {
                    toReturn.add(listOf(sortedNums[pFixed], sortedNums[pStart], sortedNums[pEnd]).sorted())
                    pStart += if (pStart + 1 == pFixed) 2 else 1
                } else if (sum > 0) {
                    pEnd -= if (pEnd - 1 == pFixed) 2 else 1
                } else {
                    pStart += if (pStart + 1 == pFixed) 2 else 1
                }

            }
            pFixed++
        }
        return toReturn.toList()
    }
}