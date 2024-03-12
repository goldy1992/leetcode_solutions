package com.goldy1992.leetcode._238_product_of_array_except_self

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val prefixArray = IntArray(nums.size) {1}
        val suffixArray = IntArray(nums.size) {1}

        for (n in 1 until nums.size) {
            prefixArray[n] = nums[n-1] * prefixArray[n-1]
            val suffixIdx = nums.size - n -1
            suffixArray[suffixIdx] = suffixArray[suffixIdx + 1] * nums[suffixIdx + 1]
        }

        return IntArray(nums.size) {
            prefixArray[it] * suffixArray[it]
        }
    }
}