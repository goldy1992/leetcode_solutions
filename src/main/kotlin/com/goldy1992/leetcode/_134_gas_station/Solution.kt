package com.goldy1992.leetcode._134_gas_station

class Solution {
    data class Candidate(val energy : Int,
        val idx: Int)

    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        var arrayDiffSum = 0
        val candidateList = mutableListOf<Candidate>()

       for (i in gas.indices) {
            val arrayVal = gas[i] - cost[i]
            if (arrayVal >= 0) {
                candidateList.add(Candidate(arrayVal, i))
            }
            arrayDiffSum+= arrayVal
        }
        if (arrayDiffSum < 0) {
            return -1
        }

        candidateList.sortByDescending(Candidate::energy)
        outerloop@ for (c in candidateList) {
            var idx = if (c.idx <= gas.size - 2) c.idx + 1 else 0
            var energy = c.energy
            while (idx != c.idx) {
                energy += gas[idx] - cost[idx]
                if (energy < 0) {
                    continue@outerloop
                }
                idx = if (idx <= gas.size - 2) idx + 1 else 0
            }
            return c.idx
        }

        return -1
    }
//    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
//        var arrayDiffSum = 0
//        val candidateMap = mutableSetOf<Int>()
//
//        val arrayDiff = IntArray(gas.size) {
//            val arrayVal = gas[it] - cost[it]
//            if (arrayVal >= 0) {
//                candidateMap.add(it)
//            }
//            arrayDiffSum+= arrayVal
//            arrayVal
//        }
//        if (arrayDiffSum < 0) {
//            return -1
//        }
//        outerloop@ for (c in candidateMap) {
//            var idx = if (c <= gas.size - 2) c + 1 else 0
//            var energy = arrayDiff[c]
//            while (idx != c) {
//                energy += arrayDiff[idx]
//                if (energy < 0) {
//                    continue@outerloop
//                }
//                idx = if (idx <= gas.size - 2) idx + 1 else 0
//            }
//            return c
//        }
//
//        return -1
//    }
}