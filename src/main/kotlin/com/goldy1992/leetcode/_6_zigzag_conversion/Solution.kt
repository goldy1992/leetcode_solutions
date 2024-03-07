package org.example.com.goldy1992.leetcode._6_zigzag_conversion

class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) {
            return s
        }
        val rows = Array(numRows) { ""}
        var currentRow = 0
        var isAscending = true
        for (element in s) {
            rows[currentRow] = rows[currentRow] + element
            if (currentRow == numRows -1) {
                isAscending = false
            } else if (currentRow == 0) {
                isAscending = true
            }

            if (isAscending) {
                currentRow++
            } else {
                currentRow--
            }
        }
        var toReturn = ""
        for (row in rows) {
            toReturn += row
        }
        return toReturn
    }
}