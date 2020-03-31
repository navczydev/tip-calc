package com.example.tipcalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Nav Singh
 */
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private var billAmount = 0.0
    private var tipPercentage = 15 //default tip % set to 15

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //set default values for tip and amount to 0
        updateUI(0.0)

        //text change listener for bill amount
        edit_amount.doOnTextChanged { text, _, _, _ ->
            if (text.toString().isNotEmpty()) {
                billAmount = text.toString().toDouble()
                calculateTip(billAmount, tipPercentage)
            }
        }

        //text change listener for tip %
        edit_tip.doOnTextChanged { text, _, _, _ ->
            if (text.toString().isNotEmpty()) {
                tipPercentage = text.toString().toInt()
                calculateTip(billAmount, tipPercentage)
            }
        }
    }

    //calculation of tip and trigger a call to update UI
    private fun calculateTip(billAmount: Double, tipPercentage: Int) {
        val tipAmount = billAmount * tipPercentage / 100
        updateUI(tipAmount)
    }

    private fun updateUI(tipAmount: Double) {
        tv_tip_amount.text = getString(R.string.tip_amount, tipAmount.toString())
        tv_total_amount.text =
            getString(R.string.total_amount, (billAmount + tipAmount).toString())

    }
}
