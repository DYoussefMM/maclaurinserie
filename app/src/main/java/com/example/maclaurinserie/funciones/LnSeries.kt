package com.example.maclaurinserie.funciones

import com.example.maclaurinserie.metodo.MaclaurinSeries

class LnSeries : MaclaurinSeries() {
    override fun calculateTerm(x: Double, n: Int): Double {
        return if (n == 0) 0.0 else pow(-1.0, n + 1) * pow(x, n) / n
    }

    override fun getInterval(): String {
        return "(-1, 1)"
    }
}

