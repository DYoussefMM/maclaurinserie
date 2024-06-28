package com.example.maclaurinserie.funciones

import com.example.maclaurinserie.metodo.MaclaurinSeries

class ECosSeries : MaclaurinSeries() {
    override fun calculateTerm(x: Double, n: Int): Double {
        return pow(x, n) / factorial(n) * exp(approxCos(x))
    }

    override fun getInterval(): String {
        return "(-∞, ∞)"
    }

    private fun exp(x: Double): Double {
        var sum = 1.0
        var term = 1.0
        for (i in 1..20) {
            term *= x / i
            sum += term
        }
        return sum
    }

    private fun approxCos(x: Double): Double {
        var sum = 1.0
        var term = 1.0
        for (i in 1..10) {
            term *= -x * x / (2 * i * (2 * i - 1))
            sum += term
        }
        return sum
    }
}
