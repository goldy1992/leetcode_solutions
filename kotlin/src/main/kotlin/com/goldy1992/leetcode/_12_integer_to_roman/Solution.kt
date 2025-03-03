package com.goldy1992.leetcode._12_integer_to_roman

class Solution {

    fun intToRoman(num: Int): String {
        var remaining = num
        var toReturn = StringBuilder()


        if (remaining >= 1000) {
            var numThousand = 0
            while (remaining >= 1000) {
                remaining -= 1000
                numThousand++
            }
            for (i in 1 .. numThousand) {
                toReturn.append('M')
            }
        }

        if (remaining >= 100) {
            var numHundred = 0
            while (remaining >= 100) {
                remaining -= 100
                numHundred++
            }
            when (numHundred) {
                9 -> toReturn.append("CM")
                8 -> toReturn.append("DCCC")
                7 -> toReturn.append("DCC")
                6 -> toReturn.append("DC")
                5 -> toReturn.append("D")
                4 -> toReturn.append("CD")
                3 -> toReturn.append("CCC")
                2 -> toReturn.append("CC")
                1 -> toReturn.append("C")
            }
        }

        if (remaining >= 10) {
            var numTens = 0
            while (remaining >= 10) {
                remaining -= 10
                numTens++
            }
            when (numTens) {
                9 -> toReturn.append("XC")
                8 -> toReturn.append("LXXX")
                7 -> toReturn.append("LXX")
                6 -> toReturn.append("LX")
                5 -> toReturn.append("L")
                4 -> toReturn.append("XL")
                3 -> toReturn.append("XXX")
                2 -> toReturn.append("XX")
                1 -> toReturn.append("X")
            }
        }

        when (remaining) {
            9 -> toReturn.append("IX")
            8 -> toReturn.append("VIII")
            7 -> toReturn.append("VII")
            6 -> toReturn.append("VI")
            5 -> toReturn.append("V")
            4 -> toReturn.append("IV")
            3 -> toReturn.append("III")
            2 -> toReturn.append("II")
            1 -> toReturn.append("I")
        }


        return toReturn.toString()
    }

}