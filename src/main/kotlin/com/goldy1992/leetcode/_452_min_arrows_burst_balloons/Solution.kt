package com.goldy1992.leetcode._452_min_arrows_burst_balloons

class Solution {
    fun findMinArrowShots(points: Array<IntArray>): Int {
        if (points.size <= 1) {
            return points.size
        }

        points.sortBy { it[1] }
        var arrows = 1 // assume can be done with one arrow

        var currentEnd = points[0][1]
        for (idx in 1 until points.size) {

            if (points[idx][0] > currentEnd) {
                currentEnd = points[idx][1]
                arrows++
            }
        }

        return arrows
    }
}
