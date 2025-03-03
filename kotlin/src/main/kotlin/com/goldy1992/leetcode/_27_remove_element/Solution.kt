package com.goldy1992.leetcode.remove_element

class Solution {
    fun removeElement(nums: IntArray, value : Int): Int {
        val nonValList = mutableListOf<Int>()
        nums.forEach { num -> if (value != num) nonValList.add(num) }
        val toReturn = nonValList.size
        nums.forEachIndexed { idx, num ->
            if (idx < toReturn) {
                nums[idx] = nonValList[idx]
            } else {
                nums[idx] = -1
            }
        }
        return toReturn
    }
}