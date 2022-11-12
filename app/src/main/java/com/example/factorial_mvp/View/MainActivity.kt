package com.example.factorial_mvp.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.factorial_mvp.Model.Number
import com.example.factorial_mvp.Persenter.Calcfactorial
import com.example.factorial_mvp.Persenter.ICalculateFact
import com.example.factorial_mvp.R

class MainActivity : AppCompatActivity() , Calcfactorial.View {

    lateinit var text_calc: EditText
    lateinit var result: TextView
    lateinit var calc: Button
    //interface
     var calcfactorial: ICalculateFact = Calcfactorial(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_calc = findViewById(R.id.textfield)
        result =findViewById(R.id.result)
        calc = findViewById(R.id.button)

        calc.setOnClickListener {
            calcfactorial.calc_fact(text_calc.text.toString().toInt())
        }
    }

    override fun get_calc(number: Number) {
        result.text = "Factorial of ${text_calc.text}  is = ${number.number}"

    }
}