package com.example.maclaurinserie.metodo

abstract class MaclaurinSeries {
    abstract fun calculateTerm(x: Double, n: Int): Double
    abstract fun getInterval(): String

    fun calculateSeries(x: Double, terms: Int): Double {
        var sum = 0.0
        for (n in 0 until terms) {
            sum += calculateTerm(x, n)
        }
        return sum
    }

    protected fun factorial(n: Int): Double {
        var result = 1L
        for (i in 1..n) {
            result *= i
        }
        return result.toDouble()
    }

    protected fun pow(base: Double, exp: Int): Double {
        var result = 1.0
        var temp = base
        var i = exp
        while (i > 0) {
            if (i % 2 == 1) result *= temp
            temp *= temp
            i /= 2
        }
        return result
    }
}


