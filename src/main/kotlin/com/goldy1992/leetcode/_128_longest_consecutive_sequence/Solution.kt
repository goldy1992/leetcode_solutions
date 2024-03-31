package com.goldy1992.leetcode._128_longest_consecutive_sequence

class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.size <= 1) {
            return nums.size
        }
        val numArr = HashSet<Int>()

        for (i in nums) {
            numArr.add(i)
        }

        var currentLargest = 1
        for (n in nums) {
            // If does NOT contain the previous element, then it's the start of the sequence!
            if (!numArr.contains(n - 1)) {
                var total = 1
                var nNext = n + 1
                var found = true
                while (found) {
                    found = numArr.contains(nNext)
                    if (found) {
                        nNext++
                        total++
                    }
                }
                if (total > currentLargest) {
                    currentLargest = total
                }
            }

        }
        return currentLargest
    }
}