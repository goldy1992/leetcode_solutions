package com.goldy1992.leetcode._11_containers_with_most_water

import kotlin.math.min

class Solution {
    fun maxArea(height: IntArray): Int {

        var startPointer = 0
        var endPointer = height.size - 1
        var currentMaxArea = 0

        while (startPointer < endPointer) {
            val area = min(height[startPointer], height[endPointer]) * (endPointer - startPointer)
            if (area > currentMaxArea) {
                currentMaxArea = area
            }

            if (height[startPointer] > height[endPointer]) {
                endPointer--
            } else if (startPointer < height.size - 1) {
                startPointer++
            } else {
                return currentMaxArea
            }
        }
        return currentMaxArea
    }
}