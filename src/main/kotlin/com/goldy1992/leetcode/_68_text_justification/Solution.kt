package org.example.com.goldy1992.leetcode._68_text_justification

class Solution {
    fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
        val toReturn = mutableListOf<String>()
        val currentLineWordList = mutableListOf<String>()
        var numWords = 0
        var currentCharacterCount = 0
        for (word in words) {
            val newLength = currentCharacterCount + word.length + numOfGaps(numWords + 1)
            if (newLength <= maxWidth) {
                currentLineWordList.add(word)
                numWords++
                currentCharacterCount += word.length
            } else {
                // TODO format current line
                val lineToAdd = createLineFullJustified(maxWidth, currentCharacterCount, numWords, currentLineWordList)
                toReturn.add(lineToAdd)

                currentLineWordList.clear()
                currentLineWordList.add(word)
                numWords = 1
                currentCharacterCount = word.length
            }
        }
        if (numWords > 0) {
            val lineToAdd = createLineLeftJustified(maxWidth, currentCharacterCount, currentLineWordList)
            toReturn.add(lineToAdd)

        }
        return toReturn
    }

    private fun createLineFullJustified(
        maxWidth: Int,
        currentCharacterCount: Int,
        numWords: Int,
        currentLineWordList: MutableList<String>
    ): String {
        var space = maxWidth - currentCharacterCount
        val numGaps = numOfGaps(numWords)
        // work with the minimum gap size and add spaces between the MOST LEFT words.
        val minGapSize = if (numWords == 1) 0 else space / numOfGaps(numWords) // avoids division by 0
        var lineToAdd = ""
        var gapNum = 1
        for (w in currentLineWordList) {
            lineToAdd += w
            val remainingGaps = numGaps - gapNum
            if (remainingGaps >= 0) {
                if (space - minGapSize - (remainingGaps * minGapSize) > 0) {
                    lineToAdd += gap(minGapSize + 1)
                    space -= minGapSize + 1
                } else if (space > 0) {
                    lineToAdd += gap(minGapSize)
                    space -= minGapSize
                }
                gapNum++
            }
        }
        if (lineToAdd.length < maxWidth) {
            lineToAdd += gap(maxWidth - lineToAdd.length)
        }
        return lineToAdd
    }

    /**
     * All words will be space by one and then trailing whitespace is added.
     */
    private fun createLineLeftJustified(
        maxWidth: Int,
        currentCharacterCount: Int,
        currentLineWordList: MutableList<String>
    ): String {
        var space = maxWidth - currentCharacterCount
        var lineToAdd = ""
        for (w in currentLineWordList) {
            lineToAdd += w
            if (space >= 1) {
                lineToAdd += " "
                space--
            }
        }
        lineToAdd += gap(space)
        return lineToAdd
    }

    /**
     * Whitespace helper method
     */
    private fun gap(size: Int) : String {
        var toReturn = ""
        for (i in 1 .. size) {
            toReturn += " "
        }
        return toReturn
    }

    /**
     * NOTE: this will return 0 when there's one word!
     */
    private fun numOfGaps(numWords: Int) : Int {
        return numWords - 1
    }
}