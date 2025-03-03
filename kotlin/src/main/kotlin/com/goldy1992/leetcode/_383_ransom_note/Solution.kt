package com.goldy1992.leetcode._383_ransom_note

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val numArr = IntArray(123)
        for (c in magazine) {
            numArr[c.code] += 1
        }
        for (c in ransomNote) {
            if (numArr[c.code] > 0) {
                numArr[c.code] -= 1
            } else {
                return false
            }
        }
        return true
    }
}