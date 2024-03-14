package com.goldy1992.leetcode._3_longest_substring_without_repeating_chars

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        if (s.length == 1) {
            return 1
        }

        var idx = 0
        var currentLargestSubSeq = 0
        var currentSet = mutableSetOf<Char>()

        while (idx < s.length) {
            if (currentSet.add(s[idx])) {
                idx++
            } else {
                if (currentSet.size > currentLargestSubSeq) {
                    currentLargestSubSeq = currentSet.size
                }
                val duplicate = s[idx]
                idx--
                // find duplicate
                while(s[idx] != duplicate && idx >= 0) {
                    idx--
                }
                idx++
                currentSet.clear()
                // reset windowRight to that position
            }

        }
        return currentLargestSubSeq
    }
}