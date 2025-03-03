package com.goldy1992.leetcode._26_remove_duplicates

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val intSet = mutableSetOf<Int>()
        nums.forEach { num -> intSet.add(num) }
        val intSetList = intSet.toList()
        for (n in nums.indices) {
            if (n < intSet.size) {
                nums[n] = intSetList[n]
            } else {
                nums[n] = -1
            }
        }
        return intSet.size
    }
}