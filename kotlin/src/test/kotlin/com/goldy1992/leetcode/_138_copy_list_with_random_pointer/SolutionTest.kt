package com.goldy1992.leetcode._138_copy_list_with_random_pointer

import com.goldy1992.leetcode.linked_lists.Node
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = buildNode(arrayOf(
            arrayOf(7, null),
            arrayOf(13, 0),
            arrayOf(11, 4),
            arrayOf(10,2),
            arrayOf(1,0)
        )
        )
        val result = solution.copyRandomList(input)
        assertResult(input, result)
    }
    @Test
    fun testExample2() {
        val input = buildNode(
            arrayOf(
                arrayOf(1,1),
                arrayOf(2,1)
            )
        )
        val result = solution.copyRandomList(input)
        assertResult(input, result)
    }
    @Test
    fun testExample3() {
        val input = buildNode(
            arrayOf(
                arrayOf(3,null),
                arrayOf(3,0),
                arrayOf(3,null)
            )
        )
        val result = solution.copyRandomList(input)
        assertResult(input, result)
    }

    @Test
    fun testExample4() {
        val input = buildNode(
            arrayOf<Array<Int?>>(
            )
        )
        val result = solution.copyRandomList(input)
        assertResult(input, result)
    }

    private fun buildNode(array: Array<Array<Int?>>) : Node? {
        if (array.isEmpty()) {
            return null
        }
        val nodeList = mutableListOf<Node>()
        for (arr in array) {
            nodeList.add(Node(arr[0]!!))
        }

        for (n in nodeList.indices) {
            if (n == nodeList.size - 1) {
                nodeList[n].next = null
            } else {
                nodeList[n].next = nodeList[n + 1]
            }
            val randomPoint = array[n][1]
            nodeList[n].random = if (randomPoint == null) null else nodeList[randomPoint]
        }
        return nodeList[0]
    }

    private fun assertResult(expected: Node?, result: Node?) {
        var currentExpected: Node? = expected
        var currentResult: Node? = result
        while (currentExpected != null) {
            assertEquals(currentExpected.`val`, currentResult!!.`val`)
            if (currentExpected.random != null) {
                assertEquals(currentExpected.random!!.`val`, currentResult.random!!.`val`)
            } else {
                assertNull(currentResult.random)
            }
            currentExpected = currentExpected.next
            currentResult = currentResult.next

        }
    }
}