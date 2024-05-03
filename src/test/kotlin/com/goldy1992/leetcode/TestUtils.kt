package com.goldy1992.leetcode

import com.goldy1992.leetcode.linked_lists.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import java.io.BufferedReader
import java.io.File

object TestUtils {
    private const val INPUT_DELIMITER = ","
    fun readFileAsString(filePath: String) : String {
        val bufferedReader: BufferedReader = File(filePath).bufferedReader()
        return bufferedReader.use { it.readText() }
   }

    fun readFileAsStringArray(filePath: String) : Array<String> {
        val bufferedReader: BufferedReader = File(filePath).bufferedReader()
        val string = bufferedReader.use { it.readText() }
        return string.split(INPUT_DELIMITER).toTypedArray()
    }

    fun readFileAsIntArray(filePath: String) : IntArray {
        val strArray = readFileAsStringArray(filePath)
        return strArray.map { it.toInt() }.toIntArray()
    }

    fun buildFilePath(dir: String, fileName: String) : String {
        return dir + File.separator + fileName
    }

    fun assertListNodeResult(
        result: ListNode?,
        expected: List<Int>
    ) {
        var currentNode = result
        for (i in expected.indices) {
            assertNotNull(currentNode?.`val`)
            assertEquals(currentNode?.`val`, expected[i])
            currentNode = currentNode?.next
        }
    }

    fun createReverseListNode(arr: IntArray): ListNode {
        val toReturn = ListNode(arr[arr.size - 1])
        var currentNode = toReturn
        for (n in arr.size - 2 downTo 0) {
            val node = ListNode(arr[n])
            currentNode.next = node
            currentNode = node
        }
        return toReturn
    }

    fun createListNode(arr: IntArray): ListNode {
        val toReturn = ListNode(arr[0])
        var currentNode = toReturn
        for (n in 1 until arr.size) {
            val node = ListNode(arr[n])
            currentNode.next = node
            currentNode = node
        }
        return toReturn
    }
}