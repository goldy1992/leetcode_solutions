package com.goldy1992.leetcode._290_word_pattern

class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val sArr = s.split(" ")
        if (sArr.size != pattern.length) {
            return false
        }
        val usedStrings = mutableSetOf<String>()
        val map = Array(123) { _ -> ""}

        for (idx in pattern.indices) {
            if (map[pattern[idx].code].isEmpty()) {
                if (usedStrings.contains(sArr[idx])) {
                    return false
                }
                map[pattern[idx].code] = sArr[idx]
                usedStrings.add(sArr[idx])
            } else if ( map[pattern[idx].code] != sArr[idx]) {
                return false
            }
        }
        return true
    }
}