package com.goldy1992.leetcode._224_basic_calculator

class Solution {
//    fun calculate(s: String): Int {
//        val stack = Array(s.length) { _-> ""}
//      //  val opStack = CharArray(s.length)
//        var stackCounter = -1
//        var currentIdx = 0
//
//        while (currentIdx < s.length) {
//            val c = s[currentIdx]
//            if (c.isDigit()) {
//                val startIdx = currentIdx
//                while (currentIdx + 1 < s.length && s[currentIdx + 1].isDigit()) {
//                    currentIdx++
//                }
//                if (stackCounter > 0 && isNumeric(stack[stackCounter-1])) {
//                    if (stack[stackCounter] == "+") {
//
//                        stack[stackCounter - 1] = (stack[stackCounter - 1].toInt() + s.substring(startIdx, currentIdx + 1).toInt()).toString()
//                        stackCounter -= 1
//                    }
//                    else if (stack[stackCounter] == "-") {
//
//                        stack[stackCounter - 1] = (stack[stackCounter - 1].toInt() - s.substring(startIdx, currentIdx + 1).toInt()).toString()
//                        stackCounter -= 1
//                    }
//                }
//                else {
//                    stack[++stackCounter] = s.substring(startIdx, currentIdx + 1)
//                }
//
//            } else {
//                if (c != ' ') {
//                    if (c == ')') {
//                        val secondOperand = stack[stackCounter]
//
//                        stackCounter-=2
//
//                        if (stackCounter > 0 && isNumeric(stack[stackCounter-1])) {
//                            if (stack[stackCounter] == "+") {
//
//                                stack[stackCounter - 1] = (stack[stackCounter - 1].toInt() + secondOperand.toInt()).toString()
//                                stackCounter -= 1
//                            }
//                            else if (stack[stackCounter] == "-") {
//
//                                stack[stackCounter - 1] = (stack[stackCounter - 1].toInt() - secondOperand.toInt()).toString()
//                                stackCounter -= 1
//                            }
//                        }
//                        else {
//                            stack[++stackCounter] = secondOperand
//                        }
//
//                        // pop until find '('
//                    } else {
//                        stackCounter++
//                        stack[stackCounter] = "$c"
//                    }
//                }
//            }
//            currentIdx++
//        }
//        return stack[0].toInt()
//    }

    class Op (
        var operand1: Int?,
        var operand2: Int?,
        var operator: Char?
    )
    fun calculate(s: String): Int {
        return 0
    }

    private fun isNumeric(toCheck: String): Boolean {
        return toCheck.toDoubleOrNull() != null
    }
}