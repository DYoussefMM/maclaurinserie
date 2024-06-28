package com.example.maclaurinserie.funciones

import com.example.maclaurinserie.metodo.MaclaurinSeries

class CoshSeries : MaclaurinSeries() {
    override fun calculateTerm(x: Double, n: Int): Double {
        return pow(x, 2 * n) / factorial(2 * n)
    }

    override fun getInterval(): String {
        return "(-∞, ∞)"
    }
}

