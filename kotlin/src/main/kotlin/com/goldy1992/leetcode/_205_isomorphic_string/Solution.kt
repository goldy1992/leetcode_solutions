package com.goldy1992.leetcode._205_isomorphic_string

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val asciiArray = IntArray(255) { _ -> -1}
        val usedArray = BooleanArray(255) { _ -> false}
        for (n in s.indices) {
            if (asciiArray[s[n].code] == -1) {
                if (usedArray[t[n].code]) {
                    return false
                }
                asciiArray[s[n].code] = t[n].code
                usedArray[t[n].code] = true
            } else if (asciiArray[s[n].code] != t[n].code) {
                return false
            }
        }
        return true
    }
}