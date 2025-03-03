package com.goldy1992.leetcode._57_insert_interval

class Solution {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        if (intervals.isEmpty()) {
            return arrayOf(newInterval)
        }

        val toReturn = ArrayList<IntArray>(intervals.size + 1)
        var count = 0
        var intersectStart = -1
        var merged = false
        var intersecting = false
        while(count < intervals.size) {
            if (merged) {
                toReturn.add(intervals[count])
            } else {
                if (intersects(intervals[count], newInterval)) {
                    intersecting = true
                    if (intersectStart == -1) {
                        intersectStart = count
                    }
                }
                else if(intersecting) {
                    intersecting = false
                    toReturn.add(
                        intArrayOf(
                            minOf(newInterval[0], intervals[intersectStart][0]),
                            maxOf(newInterval[1], intervals[count - 1][1])
                        )
                    )
                    merged = true
                    toReturn.add(intervals[count])
                } else {
                    if (newInterval[1] < intervals[count][0]) {
                        toReturn.add(newInterval)
                        merged = true
                    }
                    toReturn.add(intervals[count])
                }

            }
            count++
        }

        if (!merged) {
            if (intersecting) {
                toReturn.add(
                    intArrayOf(
                        minOf(newInterval[0], intervals[intersectStart][0]),
                        maxOf(newInterval[1], intervals[intervals.size - 1][1])
                    )
                )
            } else {
                toReturn.add(newInterval)
            }
        }

        return toReturn.toTypedArray()
    }

    private fun intersects(range1: IntArray, range2: IntArray) : Boolean {
        return range1[0] in range2[0] .. range2[1] ||
                range1[1] in range2[0] .. range2[1] ||
                range2[0] in range1[0] .. range1[1] ||
                range2[1] in range1[0] .. range1[1]
    }
}