package com.goldy1992.leetcode._224_basic_calculator

class Solution {
    fun calculate(s: String): Int {
        val stack = Array(s.length) { _-> ""}
        var stackCounter = -1
        var currentIdx = 0

        while (currentIdx < s.length) {
            val c = s[currentIdx]
            if (c.isDigit()) {
                val startIdx = currentIdx
                while (currentIdx + 1 < s.length && s[currentIdx + 1].isDigit()) {
                    currentIdx++
                }
                if (stackCounter > 0 && isNumeric(stack[stackCounter-1])) {
                    if (stack[stackCounter] == "+") {

                        stack[stackCounter - 1] = (stack[stackCounter - 1].toInt() + s.substring(startIdx, currentIdx + 1).toInt()).toString()
                        stackCounter -= 1
                    }
                    else if (stack[stackCounter] == "-") {

                        stack[stackCounter - 1] = (stack[stackCounter - 1].toInt() - s.substring(startIdx, currentIdx + 1).toInt()).toString()
                        stackCounter -= 1
                    }
                }
                else if (stackCounter == 0 && stack[0] == "-") {
                    stack[stackCounter] = (0 -s.substring(startIdx, currentIdx + 1).toInt()).toString()

                }
                else {
                    stack[++stackCounter] = s.substring(startIdx, currentIdx + 1)
                }

            } else {
                if (c != ' ') {
                    if (c == ')') {
                        val result: Int
                        val secondOperand = stack[stackCounter]
                        val operator = stack[stackCounter - 1]
                        if (operator == "(") {
                            result = secondOperand.toInt()
                            stackCounter-= 1
                            stack[stackCounter] =result.toString()
                        } else {
                            var firstOperand : Int
                            val firstOperandStr = stack[stackCounter - 2]
                            if (firstOperandStr == "(") {
                                firstOperand = 0
                                stackCounter -= 2
                            } else {
                                stackCounter -= 3
                                firstOperand = firstOperandStr.toInt()
                            }

                            result = if (operator == "+") {
                                 firstOperand + secondOperand.toInt()
                            } else {
                                firstOperand - secondOperand.toInt()

                            }
                            stack[stackCounter] =result.toString()
                        }

                        if (stackCounter > 1 && isNumeric(stack[stackCounter-2])) {
                            if (stack[stackCounter-1] == "+") {
                                stack[stackCounter - 2] = (stack[stackCounter - 2].toInt() + stack[stackCounter].toInt()).toString()
                                stackCounter -= 2
                            }
                            else if (stack[stackCounter-1] == "-") {
                                stack[stackCounter - 2] = (stack[stackCounter - 2].toInt() - stack[stackCounter].toInt()).toString()
                                stackCounter -= 2
                            }
                        }
                        else if (stackCounter > 0) {
                            if (stack[stackCounter-1] == "-") {
                                stack[stackCounter-1] = (0 - stack[stackCounter].toInt()).toString()
                                stackCounter--
                            }
                        }
                    } else {
                        stackCounter++
                        stack[stackCounter] = "$c"
                    }
                }
            }
            currentIdx++
        }

        if (stackCounter == 2) {
            if (stack[1] == "+") {
                return stack[0].toInt() + stack[2].toInt()
            } else {
                return stack[0].toInt() - stack[2].toInt()
            }
        } else if (stackCounter == 1 && stack[0] == "-") {
            return 0 - stack[1].toInt()
        }

        return stack[0].toInt()
    }


    private fun isNumeric(toCheck: String): Boolean {
        return toCheck.toDoubleOrNull() != null
    }
}