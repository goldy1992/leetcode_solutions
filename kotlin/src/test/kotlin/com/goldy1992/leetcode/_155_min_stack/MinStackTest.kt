package com.goldy1992.leetcode._155_min_stack

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class MinStackTest {

    private lateinit var minStack :MinStack

    companion object {
        const val MIN_STACK = "MinStack"
        const val PUSH ="push"
        const val POP = "pop"
        const val TOP = "top"
        const val GET_MIN = "getMin"
        const val TEST_CLASS_RES_DIR = "src/test/resources/_155_min_stack"
    }

    @Test
    fun testExample1() {
        minStack = MinStack()
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

    @Test
    fun testExample2() {

        val commandArray = arrayOf("MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push",
            "top","getMin","push","top","getMin","pop","getMin")
        val valueArray = arrayOf(null,2147483646,2147483646,2147483647,null,null,null,null,null,null,2147483647,null,null,-2147483648,null,null,null,null)
        val expected = arrayOf(null,null,null,null,2147483647,null,2147483646,null,2147483646,null,null,2147483647,2147483647,null,-2147483648,-2147483648,null,2147483647)

        val result = performTest(commandArray, valueArray)
        assertEquals(expected.size, result.size)
        for (i in expected.indices) {
            assertEquals(expected[i], result[i])
        }
    }


    private fun performTest(commands: Array<String>, values : Array<Int?>) : Array<Int?> {
        val toReturn = arrayOfNulls<Int?>(commands.size)

        for (i in commands.indices) {

            val command = commands[i]
            val value = values[i]
            println("command: $command, value: $value")

            when(command) {
                MIN_STACK -> {
                    minStack = MinStack()
                    toReturn[i] = null
                }
                PUSH -> {
                    toReturn[i] = null
                    minStack.push(value!!)
                }
                POP -> {
                    toReturn[i] = null
                    minStack.pop()
                }
                TOP -> toReturn[i] = minStack.top()
                GET_MIN -> toReturn[i] = minStack.getMin()
            }
            //performPrintTree()
        }
        return toReturn

    }


}