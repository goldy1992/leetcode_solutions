package com.goldy1992.leetcode._228_summary_ranges

class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) {
            return emptyList()
        }

        if (nums.size == 1) {
            return listOf("${nums[0]}")
        }

        val toReturn = mutableListOf<String>()
        var rangeStartIndex = 0

        for (idx in 1 until nums.size) {

            if (nums[idx] - nums[idx - 1] != 1) {
               // not in range
                toReturn.add(
                    if (idx - 1 - rangeStartIndex == 0)
                        "${nums[rangeStartIndex]}"
                    else
                        "${nums[rangeStartIndex]}->${nums[idx - 1]}"
                )
                rangeStartIndex = idx

            }
        }
        toReturn.add(
            if (nums.size -1  == rangeStartIndex)
                "${nums[rangeStartIndex]}"
            else
                "${nums[rangeStartIndex]}->${nums[nums.size - 1]}"
        )
        return toReturn
    }
}