package com.example.maclaurinserie.funciones

import com.example.maclaurinserie.metodo.MaclaurinSeries


class TanhInverseSeries : MaclaurinSeries() {
    override fun calculateTerm(x: Double, n: Int): Double {
        return if (n % 2 == 0) 0.0 else pow(x, n) / n
    }

    override fun getInterval(): String {
        return "|x| < 1"
    }
}

