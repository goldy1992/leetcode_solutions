package com.goldy1992.leetcode._36_valid_sudoku

class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (row in board) {
            val valid = BooleanArray(58) { i -> false }
            for (i in row) {
                if (i != '.') {
                    if (!valid[i.code]) {
                        valid[i.code] = true
                    } else {
                        print("false at board[${board.indexOf(row)}][$i]")
                        return false
                    }
                }
            }
        }

        for (col in 0..8) {
            val valid = BooleanArray(58) { i -> false }
            for (row in 0 .. 8) {
                if (board[row][col] != '.') {
                    if (!valid[board[row][col].code]) {
                        valid[board[row][col].code] = true
                    } else {
                        print("false at board[$row][$col]")
                        return false
                    }
                }
            }
        }

        // TODO: add 3x3 sub box check
        return true
    }
}