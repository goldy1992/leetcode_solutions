package com.goldy1992.leetcode._150_reverse_polish_notation

class Solution {

    private val ADD = '+'
    private val MULTIPLY = '*'
    private val SUBSTRACT = '-'
    private val DIVIDE = '/'

    fun evalRPN(tokens: Array<String>): Int {
        val opStack = IntArray(tokens.size)
        opStack[0] = tokens[0].toInt()
        var counter = 1

        for (t in 1 until tokens.size) {
           // val token = tokens[t]
            if (tokens[t].length == 1 && tokens[t][0].code < '0'.code) {
                // evaluate
                // operand1 = opStack[counter-2]
                // operand2 = opStack[counter-1]
                val result = when (tokens[t][0]) {
                    ADD -> opStack[counter-2] + opStack[counter-1]
                    MULTIPLY -> opStack[counter-2] * opStack[counter-1]
                    DIVIDE -> opStack[counter-2] / opStack[counter-1]
                    SUBSTRACT -> opStack[counter-2] - opStack[counter-1]
                    else -> opStack[counter-2] + opStack[counter-1]
                }

                opStack[counter - 2] = result
                counter--

            } else {
                opStack[counter] = tokens[t].toInt()
                counter++
            }
        }
        return opStack[0]
    }

}