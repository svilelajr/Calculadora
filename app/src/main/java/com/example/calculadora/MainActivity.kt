package com.example.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {



        private val primeiroNumero by lazy { findViewById<TextInputEditText>(R.id.txtInputLayoutPrimeiroNumero) }
        private val segundoNumero by lazy { findViewById<TextInputEditText>(R.id.txtInputLayoutSegundoNumero) }
        private val txtResultado by lazy { findViewById<TextView>(R.id.txtResultado) }
        private val btnCalcular by lazy { findViewById<Button>(R.id.btnCalcular) }



    @SuppressLint("ServiceCast")
    private fun hideKeyboard() {
        val inputService = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        inputService.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {

            val numero1 = primeiroNumero.text.toString()
            val numero2 = segundoNumero.text.toString()
            val resultado = soma(numero1.toInt(), numero2.toInt())
            txtResultado.text = resultado
            hideKeyboard()





        }

    }

    fun soma(numero1: Int, numero2:Int): String {

        return (numero1+numero2).toString()

    }

}