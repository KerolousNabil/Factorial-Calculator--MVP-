package com.example.factorial_mvp.Persenter

import com.example.factorial_mvp.Model.Number

class Calcfactorial(val view: View) : ICalculateFact {
    override fun calc_fact(num: Int) {
        var fact = 1

        for (i in  num downTo fact){

            fact *= i

        }
        val number = Number(fact.toString())
        view.get_calc(number)
    }
    interface View
    {
        fun get_calc(number: Number)
    }
}