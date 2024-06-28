package com.example.maclaurinserie.funciones

import com.example.maclaurinserie.metodo.MaclaurinSeries

class CothInversoSeries : MaclaurinSeries() {
    override fun calculateTerm(x: Double, n: Int): Double {
        return if (n % 2 == 0) 0.0 else 1.0 / (pow(x, n) * n)
    }

    override fun getInterval(): String {
        return "|x| > 1"
    }
}
