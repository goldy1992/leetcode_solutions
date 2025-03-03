package com.goldy1992.leetcode._20_valid_parentheses

class Solution {
    companion object {
        const val BRACKET_OPEN = '('
        const val BRACKET_CLOSE = ')'
        const val SQ_BRACKET_OPEN = '['
        const val SQ_BRACKET_CLOSE = ']'
        const val CURLY_BRACKET_OPEN = '{'
        const val CURLY_BRACKET_CLOSE = '}'

    }
    fun isValid(s: String): Boolean {

        if (s.length % 2 == 1) {
            return false
        }

        val arr = CharArray(s.length)

        var count = 0
        for (c in s) {
            if (c == BRACKET_OPEN
                || c == SQ_BRACKET_OPEN
                || c == CURLY_BRACKET_OPEN) {
                arr[count] = c
                count++
            } else if (count <= 0) {
                return false
            }
            else {
                when (arr[count - 1]) {
                    BRACKET_OPEN -> {
                        if (c != BRACKET_CLOSE) {
                            return false
                        }
                    }
                    CURLY_BRACKET_OPEN -> {
                        if (c != CURLY_BRACKET_CLOSE) {
                            return false
                        }
                    }
                    SQ_BRACKET_OPEN -> {
                        if (c != SQ_BRACKET_CLOSE) {
                            return false
                        }
                    }
                }
                count--
            }
    }
        return count == 0
    }
}