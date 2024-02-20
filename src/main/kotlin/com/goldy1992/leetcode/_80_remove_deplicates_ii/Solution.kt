package org.example.com.goldy1992.leetcode._80_remove_deplicates_ii

class Solution {
    fun removeDuplicates(nums: IntArray): Int {

        if (nums.size == 1) {
            return 1
        }
        var toReturn = 0
        var currentInt = nums[0]
        var numOfCurrentIntOccurrences = 0
        var currentWriteIdx = 0
        var currentReadIdx = 0
        while (currentWriteIdx < nums.size) {
            if (currentReadIdx < nums.size) {
                if (nums[currentReadIdx] == currentInt) {
                    if (numOfCurrentIntOccurrences < 2) {
                        numOfCurrentIntOccurrences++
                        nums[currentWriteIdx] = currentInt
                        toReturn++
                        currentWriteIdx++
                    }
                } else {
                    currentInt = nums[currentReadIdx]
                    nums[currentWriteIdx] = currentInt
                    currentWriteIdx++
                    numOfCurrentIntOccurrences = 1
                    toReturn++
                }
                currentReadIdx++
            } else {
                nums[currentWriteIdx] = -1
                currentWriteIdx++
            }
        }

        return toReturn
    }
}