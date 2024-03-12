package com.goldy1992.leetcode._28_first_index_of_string_occurence

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        for (n in 0 .. haystack.length - needle.length) {
            if (haystack.substring(n, n + needle.length) == needle) {
                return n
            }
        }
        return -1
    }
}