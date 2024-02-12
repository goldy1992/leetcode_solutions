package org.example.com.goldy1992.leetcode.majority_element

class Solution {

    fun majorityElement(nums: IntArray): Int {
        val intMap = mutableMapOf<Int, Int>()
        var largestN = 0
        var numOccurrences = 0
        val compareMap : (num : Int) -> Unit = { n ->
            if (intMap[n]!! > numOccurrences) {
                largestN = n
                numOccurrences = intMap[n]!!
            }
        }

        for (num in nums) {
            if (!intMap.containsKey(num)) {
                intMap[num] = 1
                compareMap(num)
            } else {
                intMap[num] = intMap[num]!! + 1
                compareMap(num)
            }
        }
        return largestN
    }
}