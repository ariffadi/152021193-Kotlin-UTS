package com.example.login

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import net.objecthunter.exp4j.ExpressionBuilder
import java.text.DecimalFormat
import android.content.Intent


class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val buttonClear = findViewById<Button>(R.id.button_clear)


        val input = findViewById<TextView>(R.id.input)
        val output = findViewById<TextView>(R.id.output)
        buttonClear.setOnClickListener {
            input.text = ""
            output.text = ""
        }


        val buttonBracketLeft = findViewById<Button>(R.id.button_bracket_left)


        buttonBracketLeft.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + "("
            input.setText(newText)
        }
        val buttonBracketRight = findViewById<Button>(R.id.button_bracket_right)


        buttonBracketRight.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + ")"
            input.setText(newText)
        }
        val buttonZero = findViewById<Button>(R.id.button_0)


        buttonZero.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + "0"
            input.setText(newText)
        }

        val buttonOne = findViewById<Button>(R.id.button_1)
        buttonOne.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + "1"
            input.setText(newText)
        }

        val buttontwo = findViewById<Button>(R.id.button_2)
        buttontwo.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + "2"
            input.setText(newText)
        }
        val button3 = findViewById<Button>(R.id.button_3)
        button3.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + "3"
            input.setText(newText)
        }
        val button4 = findViewById<Button>(R.id.button_4)
        button4.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + "4"
            input.setText(newText)
        }
        val button5 = findViewById<Button>(R.id.button_5)
        button5.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + "5"
            input.setText(newText)
        }
        val button6 = findViewById<Button>(R.id.button_6)
        button6.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + "6"
            input.setText(newText)
        }
        val button7 = findViewById<Button>(R.id.button_7)
        button7.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + "7"
            input.setText(newText)
        }
        val button8 = findViewById<Button>(R.id.button_8)
        button8.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + "8"
            input.setText(newText)
        }
        val button9 = findViewById<Button>(R.id.button_9)
        button9.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + "9"
            input.setText(newText)
        }
        val buttonDot = findViewById<Button>(R.id.button_dot)
        buttonDot.setOnClickListener {
            val currentText = input.text.toString()
            val newText = currentText + "."
            input.setText(newText)
        }
        val buttonDivision = findViewById<Button>(R.id.button_division)

        buttonDivision.setOnClickListener {
            input.append("÷") // Menambahkan karakter "÷" ke teks yang ada di input
        }

        val buttonMultiply = findViewById<Button>(R.id.button_multiply)

        buttonMultiply.setOnClickListener {
            input.append("×")
        }

        val buttonSubtraction = findViewById<Button>(R.id.button_subtraction)

        buttonSubtraction.setOnClickListener {
            input.append("-")
        }
        val buttonAdd = findViewById<Button>(R.id.button_addition)

        buttonAdd.setOnClickListener {
            input.append("+")
        }

        val buttonEquals = findViewById<Button>(R.id.button_equals)

        buttonEquals.setOnClickListener {
            // Panggil fungsi yang ingin Anda jalankan saat tombol "equals" diklik
            calculateResult()
        }

        fun addToInputText(buttonValue: String): String {
            return "${input.text}$buttonValue"
        }

        fun getInputExpression(): String {
            var expression = input.text.replace(Regex("÷"), "/")
            expression = expression.replace(Regex("×"), "*")
            return expression
        }

        fun evaluateExpression(expression: String): Any = Unit

        fun showResult() {
            val output = findViewById<TextView>(R.id.output)
            try {
                val expression = getInputExpression()
                val result = evaluateExpression(expression)
                if (result == null) {
                    // Show Error Message
                    output.text = "Error"
                    output.setTextColor(ContextCompat.getColor(this, R.color.red))
                } else {
                    // Show Result
                    output.text = DecimalFormat("0.######").format(result).toString()
                    output.setTextColor(ContextCompat.getColor(this, R.color.green))
                }
            } catch (e: Exception) {
                // Handle any exceptions that may occur during evaluation
                output.text = "Error"
                output.setTextColor(ContextCompat.getColor(this, R.color.red))
            }

            fun evaluateExpression(expression: String): Double? {
                return try {
                    val result = ExpressionBuilder(expression).build().evaluate()
                    result
                } catch (e: Exception) {
                    null
                }
            }


        }










    }

    private fun calculateResult() {
        TODO("Not yet implemented")
    }
}
