package org.example.com.goldy1992.leetcode.merge_sorted_array

import kotlin.math.max

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val num1Copy = nums1.sliceArray(0 until m)
        var num1Count = 0
        var num2Count = 0
        var arrCount = 0
        while (num1Count + num2Count < (m+n)) {
            if (num1Count < m && num2Count < n) {
                val n1 = num1Copy[num1Count]
                val n2 = nums2[num2Count]
                if (n1 <= n2) {
                    nums1[arrCount] = n1
                    num1Count++
                } else {
                    nums1[arrCount] = nums2[num2Count]
                    num2Count++
                }
            } else if (num1Count < m) {
                nums1[arrCount] = num1Copy[num1Count]
                num1Count++
            } else {
                nums1[arrCount] = nums2[num2Count]
                num2Count++
            }
            arrCount++
        }
    }
}