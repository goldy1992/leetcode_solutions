package com.goldy1992.leetcode._135_candy

class Solution {
    fun candy(ratings: IntArray): Int {
        val childCandiesArray = IntArray(ratings.size) { 1 }
        do{
            var numChanges = 0
            for (n in ratings.indices) {

                if (n != 0) {
                    if (ratings[n] > ratings[n - 1] && childCandiesArray[n] <= childCandiesArray[n-1]) {
                        childCandiesArray[n] = childCandiesArray[n-1] + 1
                        numChanges++
                    }
                }
                if (n != ratings.size - 1) {
                    if (ratings[n] > ratings[n + 1] && childCandiesArray[n] <= childCandiesArray[n+1]) {
                        childCandiesArray[n] = childCandiesArray[n + 1] + 1
                        numChanges++
                    }
                }
            }
        } while (numChanges > 0)
        return childCandiesArray.sum()
    }
}