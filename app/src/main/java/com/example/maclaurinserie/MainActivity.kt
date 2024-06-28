package com.example.maclaurinserie

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.maclaurinserie.funciones.CosInverseSeries
import com.example.maclaurinserie.funciones.CosSeries
import com.example.maclaurinserie.funciones.CoshSeries
import com.example.maclaurinserie.funciones.CothInversoSeries
import com.example.maclaurinserie.funciones.ECosSeries
import com.example.maclaurinserie.funciones.ESinSeries
import com.example.maclaurinserie.funciones.ExpSeries
import com.example.maclaurinserie.funciones.LnSeries
import com.example.maclaurinserie.funciones.SinInverseSeries
import com.example.maclaurinserie.funciones.SinSeries
import com.example.maclaurinserie.funciones.SinhSeries
import com.example.maclaurinserie.funciones.TanhInverseSeries
import com.example.maclaurinserie.metodo.MaclaurinSeries

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val functionSpinner: Spinner = findViewById(R.id.function_spinner)
        val xInput: EditText = findViewById(R.id.x_input)
        val resultText: TextView = findViewById(R.id.result_text)
        val calculateButton: Button = findViewById(R.id.calculate_button)

        // Predefinir el número de términos en 17
        val terms = 17

        val functions = arrayOf("e^x", "sin(x)", "cos(x)", "sin⁻¹(x)", "cos⁻¹(x)", "ln(1 + x)", "sinh(x)", "cosh(x)", "tanh⁻¹(x)", "coth⁻¹(x)", "e^sin(x)", "e^cos(x)")
        functionSpinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, functions)

        calculateButton.setOnClickListener {
            val selectedFunction = functionSpinner.selectedItem.toString()
            val x = xInput.text.toString().toDoubleOrNull() ?: 0.0

            val series: MaclaurinSeries = when (selectedFunction) {
                "e^x" -> ExpSeries()
                "sin(x)" -> SinSeries()
                "cos(x)" -> CosSeries()
                "sin⁻¹(x)" -> SinInverseSeries()
                "cos⁻¹(x)" -> CosInverseSeries()
                "ln(1 + x)" -> LnSeries()
                "sinh(x)" -> SinhSeries()
                "cosh(x)" -> CoshSeries()
                "tanh⁻¹(x)" -> TanhInverseSeries()
                "coth⁻¹(x)" -> CothInversoSeries()
                "e^sin(x)" -> ESinSeries()
                "e^cos(x)" -> ECosSeries()
                else -> ExpSeries() // Default a e^x por ahora
            }
            val result = series.calculateSeries(x, terms)
            resultText.text = "Resultado: $result\nIntervalo de Convergencia: ${series.getInterval()}"
        }
    }
}
