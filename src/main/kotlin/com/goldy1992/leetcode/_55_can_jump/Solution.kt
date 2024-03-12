package com.goldy1992.leetcode._55_can_jump

class Solution {

    fun canJump(nums: IntArray): Boolean {
        if (nums.size == 1) {
            return true
        }
        var currentIdx = 0
        while (currentIdx < nums.size ) {
            val maxDistance = nums[currentIdx]
            if (currentIdx + maxDistance >= nums.size - 1) {
                return true
            }
            if (maxDistance == 0) {
                return false
            }
            var newMax = 0
            var newIdx = currentIdx
            for (i in 1 .. maxDistance) {
                if (currentIdx + i < nums.size) {
                    if (nums[currentIdx + i] + i > newMax) {
                        newMax = nums[currentIdx + i] + i
                        newIdx = currentIdx + i
                    }
                }
            }
            currentIdx = newIdx
        }

        return true
    }
}