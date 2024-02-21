package org.example.com.goldy1992.leetcode.majority_element

class Solution {

    fun majorityElement(nums: IntArray): Int {
        nums.sort()
        val intMap = mutableMapOf<Int, Int>()
        var largestN = 0
        var numOccurences = 0

        for (num in nums) {
            val newValue = intMap[num]?.plus(1) ?: 1
            intMap[num] = newValue
            if (newValue > numOccurences) {
                largestN = num
                numOccurences = newValue
            }
        }
        return largestN
    }
}