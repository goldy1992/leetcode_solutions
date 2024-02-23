package org.example.com.goldy1992.leetcode._45_jump_game_ii

class Solution {

    fun jump(nums: IntArray): Int {
        if (nums.size <= 1) {
            return 0
        }

        var currentIdx = 0
        var numOfMoves = 0

        while (currentIdx < nums.size - 1) {
            val maxJumpDistance = nums[currentIdx]
            if (currentIdx + maxJumpDistance >= nums.size-1) {
                return ++numOfMoves

            }
            var newIdx = currentIdx + 1
            var maxVal = nums[currentIdx + 1]
            for (i in 2 .. maxJumpDistance) {
                if (currentIdx + i < nums.size) {
                    if (nums[currentIdx + i] + i > maxVal) {
                        maxVal = nums[currentIdx + i] + i
                        newIdx = currentIdx + i
                    }
                }
            }
            currentIdx = newIdx
            numOfMoves++
        }
        return numOfMoves
    }
}