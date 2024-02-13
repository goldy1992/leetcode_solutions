package org.example.com.goldy1992.leetcode.buy_sell_stock

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var currentMaxProfit = 0
        var max = prices[0]
        var min = prices[0]

        for (p in 1 until prices.size) {
            val currentPrice = prices[p]
            if (currentPrice > max) {
                max = currentPrice
                currentMaxProfit = currentMaxProfit.coerceAtLeast(max - min)
            } else if (currentPrice < min) {
                min = currentPrice
                max = currentPrice
            }
        }

        return currentMaxProfit
    }
}