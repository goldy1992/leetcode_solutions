package com.goldy1992.leetcode._122_best_time_to_buy_and_sell_stock_ii

class Solution {

    fun maxProfit(prices: IntArray): Int {
        var currentProfit = 0
        var currentIdx = 0
        while (currentIdx < prices.size - 1) {
            if (prices[currentIdx] < prices[currentIdx + 1]) {
                currentProfit += prices[currentIdx + 1] - prices[currentIdx]
            }
            currentIdx++
        }
        return currentProfit
    }

   /*
   INEFFICIENT APPROACH USING RECURSION

   fun maxProfit(prices: IntArray): Int {
        this.prices = prices
        val startStock = Stock(0, null)
        val maxProfit = calculateProfit(startStock, 0)
        return if (maxProfit > 0) maxProfit else 0
    }

    data class Stock(
        val currentProfit : Int = 0,
        val currentStock : Int? = null,
    )
    lateinit var prices: IntArray
    fun maxProfit(prices: IntArray): Int {
        this.prices = prices
        val startStock = Stock(0, null)
        val maxProfit = calculateProfit(startStock, 0)
        return if (maxProfit > 0) maxProfit else 0
    }

    private fun calculateProfit(stock: Stock, idx : Int) : Int {
        while (idx < prices.size) {
            if (stock.currentStock == null) {
                val stockBuy = Stock(currentProfit = stock.currentProfit - prices[idx], currentStock = prices[idx])
                val buyProfit = calculateProfit(stockBuy, idx+1,)
                val stockNoBuy = Stock(stock.currentProfit, null)
                val noBuyProfit = calculateProfit(stockNoBuy, idx+1)
                return max(buyProfit, noBuyProfit)
            } else { // stock sell
                val stockSell = Stock(stock.currentProfit + prices[idx], null)
                val sellProfit = calculateProfit(stockSell, idx+1)
                val stockNoSell = Stock(stock.currentProfit, stock.currentStock)
                val noSellProfit = calculateProfit(stockNoSell, idx+1)
                return max(sellProfit, noSellProfit)
            }
        }
        return stock.currentProfit
    } */
}