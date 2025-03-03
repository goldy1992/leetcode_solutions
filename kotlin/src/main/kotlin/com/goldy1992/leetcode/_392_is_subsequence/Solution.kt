package com.goldy1992.leetcode._392_is_subsequence

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) {
            return true
        }
        if (t.isEmpty()) {
            return false
        }
        var sIdx = 0
        var tIdx = 0

        while (tIdx < t.length && ((t.length - tIdx) >= (s.length - sIdx))) {
            if (s[sIdx] == t[tIdx]) {
                sIdx++
            }
            if (sIdx >= s.length) {
                return true
            }
            tIdx++
        }
        return false
    }
}