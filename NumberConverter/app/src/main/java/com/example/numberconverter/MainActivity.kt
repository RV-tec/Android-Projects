 package com.example.numberconverter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val editText = findViewById<EditText>(R.id.edit_view)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.text_view)

        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.conversion_options,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        button.setOnClickListener {
            val input = editText.text.toString()
            val selectedOption = spinner.selectedItem.toString()

            when (selectedOption) {
                "Decimal" -> {
                    val decimal = input.toInt()
                    textView.text = "Binary: ${decimalToBinary(decimal)}\n" +
                            "Octal: ${decimalToOctal(decimal)}\n" +
                            "Hexadecimal: ${decimalToHexadecimal(decimal)}"
                }
                "Binary" -> {
                    val binary = input
                    textView.text = "Decimal: ${binaryToDecimal(binary)}\n" +
                            "Octal: ${binaryToOctal(binary)}\n" +
                            "Hexadecimal: ${binaryToHexadecimal(binary)}"
                }
                "Octal" -> {
                    val octal = input
                    textView.text = "Decimal: ${octalToDecimal(octal)}\n" +
                            "Binary: ${octalToBinary(octal)}\n" +
                            "Hexadecimal: ${octalToHexadecimal(octal)}"
                }
                "Hexadecimal" -> {
                    val hexadecimal = input
                    textView.text = "Decimal: ${hexadecimalToDecimal(hexadecimal)}\n" +
                            "Binary: ${hexadecimalToBinary(hexadecimal)}\n" +
                            "Octal: ${hexadecimalToOctal(hexadecimal)}"
                }
            }
        }
    }

    private fun decimalToBinary(decimal: Int): String {
        return Integer.toBinaryString(decimal)
    }

    private fun decimalToOctal(decimal: Int): String {
        return Integer.toOctalString(decimal)
    }

    private fun decimalToHexadecimal(decimal: Int): String {
        return Integer.toHexString(decimal).toUpperCase(Locale.ROOT)
    }

    private fun binaryToDecimal(binary: String): Int {
        return Integer.parseInt(binary, 2)
    }

    private fun binaryToOctal(binary: String): String {
        val decimal = binaryToDecimal(binary)
        return decimalToOctal(decimal)
    }

    private fun binaryToHexadecimal(binary: String): String {
        val decimal = binaryToDecimal(binary)
        return decimalToHexadecimal(decimal).toUpperCase(Locale.ROOT)
    }

    private fun octalToDecimal(octal: String): Int {
        return Integer.parseInt(octal, 8)
    }

    private fun octalToBinary(octal: String): String {
        val decimal = octalToDecimal(octal)
        return decimalToBinary(decimal)
    }

    private fun octalToHexadecimal(octal: String): String {
        val decimal = octalToDecimal(octal)
        return decimalToHexadecimal(decimal).toUpperCase(Locale.ROOT)
    }

    private fun hexadecimalToDecimal(hexadecimal: String): Int {
        return Integer.parseInt(hexadecimal, 16)
    }

    private fun hexadecimalToBinary(hexadecimal: String): String {
        val decimal = hexadecimalToDecimal(hexadecimal)
        return decimalToBinary(decimal)
    }

    private fun hexadecimalToOctal(hexadecimal: String): String {
        val decimal = hexadecimalToDecimal(hexadecimal)
        return decimalToOctal(decimal)
    }

}