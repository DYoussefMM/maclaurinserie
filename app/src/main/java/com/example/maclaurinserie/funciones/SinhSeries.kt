package com.example.maclaurinserie.funciones

import com.example.maclaurinserie.metodo.MaclaurinSeries

class SinhSeries : MaclaurinSeries() {
    override fun calculateTerm(x: Double, n: Int): Double {
        return pow(x, 2 * n + 1) / factorial(2 * n + 1)
    }

    override fun getInterval(): String {
        return "(-∞, ∞)"
    }
}

