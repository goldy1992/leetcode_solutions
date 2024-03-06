package org.example.com.goldy1992.leetcode._14_longest_common_prefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 1) {
            return strs[0]
        }
        var currentPrefix = ""
        var idx = 0
        while (idx <= 200) {
            var currentChar : Char = Char.MIN_VALUE
            strs.forEachIndexed { n, s ->
                if (idx < s.length) {
                    if (n == 0) {
                        currentChar = s[idx]
                    } else {
                        if (s[idx] != currentChar) {
                            return currentPrefix
                        }
                    }
                } else {
                    return currentPrefix
                }
            }
            currentPrefix += currentChar
            idx++
        }
        return currentPrefix
    }
}