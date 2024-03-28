package com.goldy1992.leetcode._242_valid_anagram

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val map = IntArray(26)

        for (idx in s.indices) {
            map[s[idx].code - 'a'.code] += 1
            map[t[idx].code- 'a'.code] -= 1
        }

        for (m in map) {
            if (m != 0) {
                return false
            }
        }

        return true
    }
}