package com.goldy1992.leetcode._289_game_of_life

class Solution {
    fun gameOfLife(board: Array<IntArray>): Unit {
        val resultBoard = Array<IntArray>(board.size) {_-> IntArray(board[0].size) }
        for (row in board.indices) {
            for (col in board[0].indices) {
                val neighbors = getNeighbors(row, col, board)
                val liveNeighbours = neighbors.filter { it == 1 }.size
                resultBoard[row][col] =
                if (board[row][col] == 1) {

                    //Any live cell with fewer than two live neighbors dies as if caused by under-population.
                    if (liveNeighbours < 2) {
                        0
                    }
                    // Any live cell with more than three live neighbors dies, as if by over-population.
                    else if (liveNeighbours > 3) {
                        0
                    }
                    // Any live cell with two or three live neighbors lives on to the next generation.
                    else {
                        1
                    }
                } else {
                    // Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                    if (liveNeighbours == 3) {
                        1
                    } else {
                        0
                    }
                }
            }
        }

        for (row in board.indices) {
            for (col in board[0].indices) {
                board[row][col] = resultBoard[row][col]
            }
        }
    }

    private fun getNeighbors(row: Int, col: Int, board: Array<IntArray>) : List<Int> {
        val toReturn = mutableListOf<Int>()
        if (row > 0) {
            toReturn.add(board[row -1][col])
        }
        if (row < board.size -1) {
            toReturn.add(board[row + 1][col])
        }
        if (col > 0) {
            toReturn.add(board[row][col-1])
        }
        if (col < board[0].size -1) {
            toReturn.add(board[row][col+1])
        }
        // diagonals
        // top left
        if (row > 0 && col > 0) {
            toReturn.add(board[row -1][col-1])
        }
        // top right
        if (row > 0 && col < board[0].size -1) {
            toReturn.add(board[row-1][col + 1])
        }
        // bottom left
        if (row < board.size -1 && col > 0) {
            toReturn.add(board[row + 1][col-1])
        }
        // bottom right
        if (row < board.size -1 && col < board[0].size -1) {
            toReturn.add(board[row + 1][col+1])
        }
        return toReturn
    }
}