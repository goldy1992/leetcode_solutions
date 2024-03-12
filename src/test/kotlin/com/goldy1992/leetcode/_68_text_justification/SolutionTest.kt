package com.goldy1992.leetcode._68_text_justification

import com.goldy1992.leetcode._68_text_justification.Solution
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = arrayOf("This", "is", "an", "example", "of", "text", "justification.")
        val maxWidth = 16
        val expected = listOf(
            "This    is    an",
            "example  of text",
            "justification.  "
        )
        val result = solution.fullJustify(input, maxWidth)
        assertLinesMatch(expected, result)
    }

    @Test
    fun testExample2() {
        val input = arrayOf("What","must","be","acknowledgment","shall","be")
        val maxWidth = 16
        val expected = listOf(
            "What   must   be",
            "acknowledgment  ",
            "shall be        "
        )
        val result = solution.fullJustify(input, maxWidth)
        assertLinesMatch(expected, result)
    }
    @Test
    fun testExample3() {
        val input = arrayOf("Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do")
        val maxWidth = 20
        val expected = listOf(
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  "
        )
        val result = solution.fullJustify(input, maxWidth)
        assertLinesMatch(expected, result)
    }
    @Test
    fun testExample4() {
        val input = arrayOf("The","important","thing","is","not","to","stop","questioning.","Curiosity","has","its","own","reason","for","existing.")
        val maxWidth = 17
        val expected = listOf(
            "The     important",
            "thing  is  not to",
            "stop questioning.",
            "Curiosity has its",
            "own   reason  for",
            "existing.        "
        )
        val result = solution.fullJustify(input, maxWidth)
        assertLinesMatch(expected, result)
    }
    @Test
    fun testExample5() {
        val input = arrayOf("ask","not","what","your","country","can","do","for","you","ask","what","you","can","do","for","your","country")
        val maxWidth = 16
        val expected = listOf(
            "ask   not   what",
            "your country can",
            "do  for  you ask",
            "what  you can do",
            "for your country"
        )
        val result = solution.fullJustify(input, maxWidth)
        assertLinesMatch(expected, result)
    }

    @Test
    fun testExample6() {
        val input = arrayOf("Listen","to","many,","speak","to","a","few.")
        val maxWidth = 6
        val expected = listOf(
            "Listen",
            "to    ",
            "many, ",
            "speak ",
            "to   a",
            "few.  "
        )
        val result = solution.fullJustify(input, maxWidth)
        assertLinesMatch(expected, result)
    }
    @Test
    fun testExample7() {
        val input = arrayOf("Give","me","my","Romeo;","and,","when","he","shall","die,","Take","him","and","cut","him","out","in","little","stars,","And","he","will","make","the","face","of","heaven","so","fine","That","all","the","world","will","be","in","love","with","night","And","pay","no","worship","to","the","garish","sun.")
        val maxWidth = 25
        val expected = listOf(
            "Give  me  my  Romeo; and,",
            "when  he  shall die, Take",
            "him  and  cut  him out in",
            "little stars, And he will",
            "make  the  face of heaven",
            "so   fine  That  all  the",
            "world  will  be  in  love",
            "with  night  And  pay  no",
            "worship   to  the  garish",
            "sun.                     "
        )
        val result = solution.fullJustify(input, maxWidth)
        assertLinesMatch(expected, result)
    }

}