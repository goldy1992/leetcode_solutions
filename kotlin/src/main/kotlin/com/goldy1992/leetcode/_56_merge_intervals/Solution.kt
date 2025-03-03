package com.goldy1992.leetcode._56_merge_intervals

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.size <= 1) {
            return intervals
        }
        var toReturn : MutableList<IntArray?> = intervals.toMutableList()
        var madeChange = true
        while (madeChange) {
            madeChange = false
            for (i in toReturn.indices) {
                if (toReturn[i] != null) {
                    val start = toReturn[i]!![0]
                    val end = toReturn[i]!![1]
                    var toReturnIdx = 0

                    while ( toReturnIdx < toReturn.size) {
                        if (toReturn[toReturnIdx] != null && toReturnIdx != i) {
                            if (start <= toReturn[toReturnIdx]!![0] && end >= toReturn[toReturnIdx]!![1]) {
                                toReturn[toReturnIdx] = null
                            } else {
                                if (toReturn[toReturnIdx]!![0] < start && toReturn[toReturnIdx]!![0] in start..end) {
                                    toReturn[i]!![0] = min(start, toReturn[toReturnIdx]!![0])
                                    madeChange = true
                                }

                                if (toReturn[toReturnIdx]!![0] in start..end && toReturn[toReturnIdx]!![1] > end) {
                                    toReturn[i]!![1] = max(end, toReturn[toReturnIdx]!![1])
                                    madeChange = true
                                }
                            }
                        }
                        toReturnIdx++
                    }
                }
            }
            if (madeChange) {
                toReturn = toReturn.filterNotNull().toMutableList()
            }
        }

        return toReturn.filterNotNull().toTypedArray()
    }
}