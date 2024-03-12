package com.goldy1992.leetcode.h_index

class Solution {


    /*
    fun hIndex(citations: IntArray): Int {
        //citations.sortDescending()
        val maxHIdx = citations.size
        var currentHIdx = maxHIdx
        while (currentHIdx >= 0 ) {
            var numOfPapersWithCitations = 0
            for (paperCitations in citations) {
                if (paperCitations >= currentHIdx) {
                    numOfPapersWithCitations++
                    if (numOfPapersWithCitations >= currentHIdx) {
                        return currentHIdx
                    }
                }
            }
            currentHIdx--

        }
        return 0
    }*/
    /**
     * Theoretically O((n*log(n)) + n)
     */
    fun hIndex(citations: IntArray): Int {
        // unfortunately kotlin sortDescending does NOT work in n*log(n) since it sorts ascending and then reverses the
        // array.
        citations.sortDescending()
        var currentIdx = citations.size - 1
        while (currentIdx >= 0) {
            if (citations[currentIdx] >= currentIdx + 1) {
                return currentIdx + 1
            }
            currentIdx--
        }
        return 0
    }
}