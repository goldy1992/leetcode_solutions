package com.goldy1992.leetcode._57_insert_interval

class Solution {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {

        var start = 0
        var found = false
        while(!found && start < intervals.size) {
            if (intersects(intervals[start], newInterval)) {
                found = true
            } else {
                start++
            }
        }
        var end = start
        found = false
        while(!found && end < intervals.size) {

            if (!intersects(intervals[end], newInterval)) {
                found = true
                end --
            } else {
                end++
            }

        }

        val toReturn = Array(start + intervals.size - end) { i-> intArrayOf()
            if (i < start) {
                intervals[i]
            } else if (i == start) {
                intArrayOf(
                    minOf(newInterval[0], intervals[start][0]),
                    maxOf(newInterval[1], intervals[end][1]))
            } else {
                intervals[i + end]
            }
        }
        for (i in toReturn.indices) {
            if (i < start) {
                intervals[i]
            } else if (i == start) {
                intArrayOf(
                    minOf(newInterval[0], intervals[start][0]),
                    maxOf(newInterval[1], intervals[end][1]))
            } else {
                intervals[i + end]
            }
        }


        return toReturn
    }

    private fun intersects(range1: IntArray, range2: IntArray) : Boolean {
        return range1[0] in range2[0] .. range2[1] ||
                range1[1] in range2[0] .. range2[1]
    }
}