package com.goldy1992.leetcode._58_length_of_last_word

class Solution {
    fun lengthOfLastWord(s: String): Int {
        val arr = s.split(Regex("\\s+"))
        var n = arr.size - 1
        while (n >= 0) {
            if (arr[n].length > 0) {
                return arr[n].length
            }
            n--
        }
        return 0
    }
}