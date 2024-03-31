package com.goldy1992.leetcode

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
}