package com.goldy1992.leetcode._155_min_stack

class MinStack {

    private var minVal : Int = Int.MAX_VALUE
    private var stack = IntArray(10)
    var idx = -1
    fun push(`val`: Int) {
        idx++

        if (idx >= stack.size) {
            val newStack = IntArray(stack.size * 2)
            for (i in stack.indices) {
                newStack[i] = stack[i]
            }
            stack = newStack
        }

        stack[idx] = `val`
        if (`val` < minVal) {
            minVal = `val`
        }
    }

    fun pop() {
        if (idx >= 0) {
            if (stack[idx] == minVal) {
                if (idx > 0) {
                    var newMin = stack[0]
                    for (i in 1 until idx) {
                        if (stack[i] < newMin) {
                            newMin = stack[i]
                        }
                    }
                    minVal = newMin
                } else {
                    minVal = Int.MAX_VALUE
                }
            }

            stack[idx] = 0
            idx--

        }
    }

    fun top(): Int {
        return stack[idx]
    }

    fun getMin(): Int {
        return minVal
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */