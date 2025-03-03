package com.goldy1992.leetcode._49_group_anagrams

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val toReturn = mutableListOf<MutableList<String>>()
        for (s in strs) {
            if (toReturn.isEmpty()) {
                toReturn.add(mutableListOf(s))
            } else {

                var foundList = false

                for (l in toReturn) {
                    if (isAnagram(s, l[0])) {
                        l.add(s)
                        foundList = true
                        break
                    }
                }
                if (!foundList) {
                    toReturn.add(mutableListOf(s))
                }
            }
        }
        return toReturn
    }

    private fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val map = IntArray(26)

        for (idx in s.indices) {
            map[s[idx].code - 'a'.code] += 1
            map[t[idx].code- 'a'.code] -= 1
        }

        for (m in map) {
            if (m != 0) {
                return false
            }
        }

        return true
    }
}