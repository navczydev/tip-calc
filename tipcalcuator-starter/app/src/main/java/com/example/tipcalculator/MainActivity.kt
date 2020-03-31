package com.example.tipcalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

/**
 * starter project for tip calculator
 * @author Nav Singh
 */
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private var billAmount = 0.0
    private var tipPercentage = 15 //default tip % set to 15

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //TODO 4 add textChange listeners for  bill amount and tip % TextInputEditText fields

        //TODO 5 add calculateTip() and updateUI() methods
    }

}
