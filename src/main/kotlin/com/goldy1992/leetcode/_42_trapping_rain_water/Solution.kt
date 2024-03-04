package org.example.com.goldy1992.leetcode._42_trapping_rain_water

import kotlin.math.min

/**
 * TODO: improve memory and runtime performance!
 */
class Solution {

    fun trap(heights: IntArray): Int {
        var toReturn = 0
        if (heights.size <= 2) {
            return toReturn
        }
        var previousLargestHeight = 0
        var nextLargestHeight = 0

        for (n in heights.indices) {
            val currentHeight = heights[n]

             if (n > 0) {
                 var searchIdx = n-1
                 previousLargestHeight = 0
                 while (searchIdx >= 0) {
                     if (heights[searchIdx] > previousLargestHeight) {
                         previousLargestHeight = heights[searchIdx]

                     }
                     searchIdx--
                 }
             }

            if (n < heights.size-1) {
                nextLargestHeight = 0
                var searchIdx = n+1
                while (searchIdx < heights.size) {
                    if (heights[searchIdx] > nextLargestHeight) {
                        nextLargestHeight = heights[searchIdx]

                    }
                    searchIdx++
                }
            }


            if (currentHeight < min(previousLargestHeight, nextLargestHeight)) {
               toReturn += min(previousLargestHeight, nextLargestHeight) - currentHeight
            }
        }
        return toReturn
    }
}