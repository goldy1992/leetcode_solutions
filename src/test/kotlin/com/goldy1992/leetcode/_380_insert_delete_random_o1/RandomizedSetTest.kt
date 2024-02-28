package com.goldy1992.leetcode._380_insert_delete_random_o1

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertTrue
import java.io.BufferedReader
import java.io.File
import kotlin.test.Test


class RandomizedSetTest {
    private var set : RandomizedSet? = null

    companion object {
        const val CREATE = "RandomizedSet"
        const val INSERT ="insert"
        const val REMOVE = "remove"
        const val RANDOM = "getRandom"
        const val INPUT_DELIMITER = ","
        const val TEST_CLASS_RES_DIR = "src/test/resources/_380_insert_delete_random_o1"
    }
    @Test
    fun testExample2() {
        val commands = arrayOf("RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom")
        val values = arrayOf<Int?>(null,1,2,2,null,1,2,null)
        val expected = arrayOf<String?>(null,"true","false","true","1","true","false","2")
        val result = performTest(commands, values)

        assertArrayEquals(expected, result)
    }
    @Test
    fun testExample3() {
        val commands = arrayOf("RandomizedSet","insert","insert","insert","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom")
        val values = arrayOf<Int?>(null,0,1,2,null,null,null,null,null,null,null,null,null,null)
        //val expected = arrayOf<String?>(null,"true","false","true","1","true","false","2")
        val result = performTest(commands, values)

       // assertArrayEquals(expected, result)
    }

    @Test
    fun testExample4() {
        val commands = arrayOf("RandomizedSet","insert","insert","remove","insert","insert","insert","remove","remove","insert","remove","insert","insert","insert","insert","insert","getRandom","insert","remove","insert","insert")
        val values = arrayOf<Int?>(null,3,-2,2,1,-3,-2,-2,3,-1,-3,1,-2,-2,-2,1,null,-2,0,-3,1)
        val expected = arrayOf<String?>(null,"true","true","false","true","true","false","true","true","true","true","false","true","false","false","false","-2","false","false","true","false")
        val result = performTest(commands, values)
        //performPrintTree()
        //assertArrayEquals(expected, result)
    }
    @Test
    fun testExample5() {
        val commands = readFileAsString("test_5_commands.txt")
        val values = readValues("test_5_values.txt")
        val expected = mutableListOf<String?>(null)
        for (i in 1..200) {
            expected.add("true")
        }
        for (i in 1..100) {
            expected.add(null)
        }
        for (i in 1..200) {
            expected.add("true")
        }

        val result = performTest(commands, values)
        assertArrayEquals(expected.toTypedArray().sliceArray(0..200), result.sliceArray(0..200))
        assertArrayEquals(expected.toTypedArray().sliceArray(301 until expected.size), result.sliceArray(301 until result.size))
    }

    @Test
    fun testExample6() {
        val commands = arrayOf("RandomizedSet","insert","insert","insert","insert","insert","insert","remove")
        val values = arrayOf(null, 3, 2, 1, 3, 2, 5, 3)
        val expected = arrayOf(null,"true","true","true","false","false","true", "true")
        val result = performTest(commands, values)

        assertArrayEquals(expected, result)
        val expectedResultSet = setOf(1, 2, 5)
        for (i in 1..10) {
            assertTrue(expectedResultSet.contains(set!!.getRandom()))
        }
    }
    @Test
    fun testExample7() {

        val commands = readFileAsString("test_7_commands.txt")
        val values = readValues("test_7_values.txt")
        val expectedInserts = arrayOf(null,"true","true","true","true")
        val result = performTest(commands, values)

        assertArrayEquals(expectedInserts, result.sliceArray(0 until 5))
        val expectedResultSet = setOf(1, 10, 20, 30)
        val resultMap = mutableMapOf<Int, Int>(
            1 to 0,
            10 to 0,
            20 to 0,
            30 to 0)
        for (i in 5 until result.size) {
            val r = result[i]!!.toInt()
            assertTrue(expectedResultSet.contains(r))
            resultMap[r] = resultMap[r]!! + 1
        }

        for (i in expectedResultSet) {
            println("$i: ${resultMap[i]}")
        }
    }



    private fun performTest(commands: Array<String>, values : Array<Int?>) : Array<String?> {
        val toReturn = arrayOfNulls<String?>(commands.size)

        for (i in commands.indices) {

            val command = commands[i]
            val value = values[i]
            println("command: $command, value: $value")

            when(command) {
                CREATE -> {
                    set = RandomizedSet()
                    toReturn[i] = null
                }
                INSERT -> toReturn[i] = set!!.insert(value!!).toString()
                REMOVE -> toReturn[i] = set!!.remove(value!!).toString()
                RANDOM -> toReturn[i] = set!!.getRandom().toString()
            }
            //performPrintTree()
        }
        return toReturn

    }

    private fun performPrintTree() {
        val printer = TreePrinter(
            { n: Struct? -> n?.num.toString()

            },
            { n: Struct? -> n?.left },
            { n: Struct? -> n?.right })

        if (set == null || set!!.tree.root == null) {
            println("empty tree")
        } else {
            printer.printTree(set!!.tree.root!!)
        }

    }

    private fun readFileAsString(fileName: String) : Array<String> {
        val filePath = TEST_CLASS_RES_DIR + File.separator + fileName
        val bufferedReader: BufferedReader = File(filePath).bufferedReader()
        val string = bufferedReader.use { it.readText() }
        return string.split(INPUT_DELIMITER).toTypedArray()
    }

    private fun readValues(fileName: String) : Array<Int?> {
        val valuesStringArray = readFileAsString(fileName)
        val valuesList = mutableListOf<Int?>()
        for (value in valuesStringArray) {
            if (value == "null") {
                valuesList.add(null)
            } else {
                valuesList.add(value.toInt())
            }
        }
        return  valuesList.toTypedArray()
    }
}