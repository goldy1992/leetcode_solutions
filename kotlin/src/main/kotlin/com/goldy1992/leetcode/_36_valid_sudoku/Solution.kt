package com.goldy1992.leetcode._36_valid_sudoku

class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val valid = BooleanArray(58) { _ -> false }
        // rows
        for (row in board) {
            valid.forEachIndexed { idx, _ -> valid[idx] = false }
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
        // columns
        for (col in 0..8) {
            valid.forEachIndexed { idx, _ -> valid[idx] = false }
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


        // grids
        for (i in 1 ..3) {
            for (j in 1.. 3) {
                valid.forEachIndexed { idx, _ -> valid[idx] = false }
                for (row in (3 * i) -3..<(3*i)) {
                    for (col in (3 * j) - 3..<(3 * j)) {
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
            }
        }
        return true
    }
}