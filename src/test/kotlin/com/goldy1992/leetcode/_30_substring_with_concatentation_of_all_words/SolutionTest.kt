package com.goldy1992.leetcode._30_substring_with_concatentation_of_all_words

import com.goldy1992.leetcode.TestUtils
import com.goldy1992.leetcode.TestUtils.buildFilePath
import java.io.File
import kotlin.test.Test
import kotlin.test.*

class SolutionTest {
    companion object {

        const val TEST_CLASS_RES_DIR = "src/test/resources/_30_substring_with_concatentation_of_all_words"
    }
    private val solution = Solution()

    @Test
    fun testExample1() {
        val s = "barfoothefoobarman"
        val words = arrayOf("foo","bar")
        val expected = setOf(0, 9)
        val result = solution.findSubstring(s, words)
        assertEquals(expected.size, result.size)
        for (e in expected) {
            assertTrue(result.contains(e))
        }
    }
    @Test
    fun testExample2() {
        val s = "wordgoodgoodgoodbestword"
        val words = arrayOf("word","good","best","word")
        val expected = emptySet<Int>()
        val result = solution.findSubstring(s, words)
        assertEquals(expected.size, result.size)
    }

    @Test
    fun testExample3() {
        val s = "barfoofoobarthefoobarman"
        val words = arrayOf("foo","bar","the")
        val expected = setOf(6,9,12)
        val result = solution.findSubstring(s, words)
        assertEquals(expected.size, result.size)
        for (e in expected) {
            assertTrue(result.contains(e))
        }
    }
    @Test
    fun testExample4() {
        val s = "barfoofo"
        val words = arrayOf("foo","bar","the")
        val expected = emptySet<Int>()
        val result = solution.findSubstring(s, words)
        assertEquals(expected.size, result.size)
    }
    @Test
    fun testExample5() {
        val s = "wordgoodgoodgoodbestword"
        val words = arrayOf("word","good","best","good")
        val expected = setOf(8)
        val result = solution.findSubstring(s, words)
        assertEquals(expected.size, result.size)
        for (e in expected) {
            assertTrue(result.contains(e))
        }
    }

    @Test
    fun testExample6() {
        val s = TestUtils.readFileAsString(buildFilePath(TEST_CLASS_RES_DIR, "test_6_string.txt"))
        val words = TestUtils.readFileAsStringArray(buildFilePath(TEST_CLASS_RES_DIR, "test_6_word_list.txt"))
        val expected = mutableSetOf<Int>()
        for (i in 0 until 5000) {
            expected.add(i)
        }
        val result = solution.findSubstring(s, words)
        assertEquals(expected.size, result.size)
        for (e in expected) {
            assertTrue(result.contains(e as Int))
        }
    }



}