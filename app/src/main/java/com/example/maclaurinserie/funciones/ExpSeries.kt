package com.example.maclaurinserie.funciones

import com.example.maclaurinserie.metodo.MaclaurinSeries

class ExpSeries : MaclaurinSeries() {
    override fun calculateTerm(x: Double, n: Int): Double {
        return pow(x, n) / factorial(n)
    }

    override fun getInterval(): String {
        return "(-∞, ∞)"
    }
}

