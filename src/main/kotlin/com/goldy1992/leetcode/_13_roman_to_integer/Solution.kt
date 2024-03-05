package org.example.com.goldy1992.leetcode._13_roman_to_integer

class Solution {

    companion object {
        const val I = 'I'
        const val V = 'V'
        const val X = 'X'
        const val L = 'L'
        const val C = 'C'
        const val D = 'D'
        const val M = 'M'
    }
    fun romanToInt(s: String): Int {
        if (s.length == 0) {
            return  0
        }
        var total = 0
        var n = 0
        while (n < s.length - 1) {
            val current = s[n]
            val current1 = s[n+1]
            val currentAmt = getDigitValue(current)
            val current1Amt = getDigitValue(current1)

            if (currentAmt < current1Amt) {
                when (current1) {
                    V -> total += 4
                    X -> total += 9
                    L -> total += 40
                    C -> total += 90
                    D -> total += 400
                    M -> total += 900
                }
                n += 2
            } else if (currentAmt == current1Amt) {
                var subTotal = 2 * currentAmt
                if (n  < s.length - 2 && getDigitValue(s[n+2]) == currentAmt) {
                    subTotal += currentAmt
                    n += 3
                }  else {
                    n += 2
                }
                total += subTotal
            } else {
                total += currentAmt
                n += 1
            }
        }

        if (n == s.length -1 ) {
            total += getDigitValue(s[n])
        }


        return total
    }

    private fun getDigitValue(c: Char) : Int {
        return when (c) {
            V -> 5
            X -> 10
            L -> 50
            C -> 100
            D -> 500
            M -> 1000
            I -> 1
            else -> 0
        }
    }
}