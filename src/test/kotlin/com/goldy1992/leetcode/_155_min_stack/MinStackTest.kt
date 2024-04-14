package com.goldy1992.leetcode._155_min_stack

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class MinStackTest {
    private val minStack = MinStack()

    @Test
    fun testExample1() {
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        var expectedMin = -3
        assertEquals(expectedMin, minStack.getMin()) // return -3
        minStack.pop()
        val expectedTop = 0
        assertEquals(expectedTop, minStack.top()) // return 0
        expectedMin = -2
        assertEquals(expectedMin, minStack.getMin()) // return -2
    }
}