package com.goldy1992.leetcode._71_simplify_path

class Solution {
    val NULL = Char(0)
    fun simplifyPath(path: String): String {
        if (path.length <= 1) {
            return path
        }
        val stack : Array<CharArray> = Array<CharArray>(path.length) { _ -> CharArray(path.length)}
        var stackCounter = 0
        var readIdx = 1
        stack[0][0] = '/'
        var writeIdx = 1
        while(readIdx < path.length - 1 && path[readIdx] == '/') {
            readIdx++
        }

        while (readIdx < path.length) {
            while (readIdx < path.length && path[readIdx] != '/' ) {
                stack[stackCounter][writeIdx] = path[readIdx]
                writeIdx++
                readIdx++
            }

            val s = stack[stackCounter].concatToString(1, writeIdx)
            if (s == "..") {
                clear(stack[stackCounter])
                if (stackCounter > 0) {
                stackCounter--
                clear(stack[stackCounter])
                }
            } else if (s == ".") {
                clear(stack[stackCounter])
                if (readIdx == path.length && stackCounter == 0) {
                    stack[stackCounter][0] = '/'
                }
            } else {
                stackCounter++
            }
            writeIdx = 0

            while(readIdx < path.length - 1 && path[readIdx] == '/' && path[readIdx+1] == '/') {
                readIdx++
            }

            if (readIdx < path.length - 1) {
                stack[stackCounter][writeIdx] = path[readIdx]
                writeIdx++
            }
            if (stackCounter == 0 && stack[stackCounter][0] == NULL) {
                stack[stackCounter][0] = '/'
            }

            readIdx++
        }


        val toReturn = CharArray(path.length)
        var counter = 0
        nextStackItem@ for (arr in stack) {
            for (c in arr) {
                if (c != NULL) {
                    toReturn[counter] = c
                    counter++
                } else {
                    continue@nextStackItem
                }
            }
        }
        return toReturn.concatToString(0, counter)
    }

    private fun clear(arr: CharArray) {
        for ( i in arr.indices) {
            if (arr[i] == NULL) {
                return
            } else {
                arr[i] = NULL
            }
        }
    }

}