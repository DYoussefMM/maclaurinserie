package com.example.maclaurinserie.funciones

import com.example.maclaurinserie.metodo.MaclaurinSeries

class CosSeries : MaclaurinSeries() {
    override fun calculateTerm(x: Double, n: Int): Double {
        return if (n % 2 != 0) 0.0 else pow(-1.0, n / 2) * pow(x, n) / factorial(n)
    }

    override fun getInterval(): String {
        return "(-∞, ∞)"
    }
}

