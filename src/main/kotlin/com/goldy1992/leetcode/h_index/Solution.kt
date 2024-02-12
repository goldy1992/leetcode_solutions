package org.example.com.goldy1992.leetcode.h_index

class Solution {
    fun hIndex(citations: IntArray): Int {
        //citations.sortDescending()
        val maxH = citations.size
        var currentH = maxH
        val satisfiedConstraint = false
        while (!satisfiedConstraint || currentH >= 0 ) {
            var numOfPapersWithCitations = 0
            for (paperCitations in citations) {
                if (paperCitations >= currentH) {
                    numOfPapersWithCitations++
                    if (numOfPapersWithCitations >= currentH) {
                        return currentH
                    }
                }
            }
            currentH--

        }
        return 0
    }
}