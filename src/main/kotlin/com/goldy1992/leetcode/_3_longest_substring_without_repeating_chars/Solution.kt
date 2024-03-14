package com.goldy1992.leetcode._3_longest_substring_without_repeating_chars

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length < 2) {
            return s.length
        }

        var idx = 0
        var currentLargestSubSeq = 0
        val currentSet = mutableSetOf<Char>()

        while (idx < s.length) {
            if (currentSet.add(s[idx])) {
                idx++
            } else {
                if (currentSet.size > currentLargestSubSeq) {
                    currentLargestSubSeq = currentSet.size
                }
                val duplicate = s[idx]
                // reset to position AFTER previous duplicate!
                while (s[idx - 1] != duplicate) {
                    idx--
                }
                currentSet.clear()
            }

        }
        if (currentSet.size > currentLargestSubSeq) {
            currentLargestSubSeq = currentSet.size
        }
        return currentLargestSubSeq
    }
}