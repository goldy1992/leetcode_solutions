package com.goldy1992.leetcode._380_insert_delete_random_o1

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class RandomizedSetTest {
    private val set = RandomizedSet()

    companion object {
        const val CREATE = "RandomizedSet"
        const val INSERT ="insert"
        const val REMOVE = "remove"
        const val RANDOM = "getRandom"
    }
    @Test
    fun testExample1() {
        assertTrue(set.insert(0))
        assertTrue(set.insert(1))
        assertFalse(set.insert(1))
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

        assertArrayEquals(expected, result)
    }



    private fun performTest(commands: Array<String>, values : Array<Int?>) : Array<String?> {
        val toReturn = arrayOfNulls<String?>(commands.size)
        var rs: RandomizedSet? = null

        for (i in commands.indices) {

            val command = commands[i]
            when(command) {
                CREATE -> {
                    rs = RandomizedSet()
                    toReturn[i] = null
                }
                INSERT -> toReturn[i] = rs!!.insert(values[i]!!).toString()
                REMOVE -> toReturn[i] = rs!!.remove(values[i]!!).toString()
                RANDOM -> toReturn[i] = rs!!.getRandom().toString()
            }
        }
        return toReturn

    }

}