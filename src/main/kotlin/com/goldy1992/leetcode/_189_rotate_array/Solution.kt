package org.example.com.goldy1992.leetcode._189_rotate_array

class Solution {
    fun rotate(nums: IntArray, k: Int) {

        if (k % nums.size == 0 || nums.size <= 1) {
            return
        }
        val kMod = k % nums.size
        var temp : Int = nums[0]
        var startIdx = 0
        var currentN = 0
        var totalSwaps = 0
        while (totalSwaps < nums.size) {
            val numberToSwap = temp
            val newIdx = (currentN + kMod) % nums.size
            temp = nums[newIdx]
            nums[newIdx] = numberToSwap
            totalSwaps++
            if (newIdx == startIdx) {
                startIdx++
                currentN = startIdx
                temp = nums[currentN]
            } else {
                currentN = newIdx
            }
        }
    }
}