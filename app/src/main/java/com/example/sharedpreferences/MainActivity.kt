package com.example.sharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {

    companion object{
        const val TESTE1 = "TESTE1"
        const val TESTE2 = "TESTE2"
        const val TESTE3 = "TESTE3"
        const val TESTE4 = "TESTE4"
        const val TESTE5 = "TESTE5"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun configurando(arg: SharedPreferences) {
        val primeiroSwitch = findViewById<SwitchCompat>(R.id.first_switch)
        val segundoSwitch = findViewById<SwitchCompat>(R.id.second_switch)
        val terceiroSwitch = findViewById<SwitchCompat>(R.id.third_switch)
        val quartoSwitch = findViewById<SwitchCompat>(R.id.fourth_switch)
        val quintoSwitch = findViewById<SwitchCompat>(R.id.fifth_switch)

        primeiroSwitch.setOnCheckedChangeListener { _, isChecked ->
            arg.edit().putBoolean(TESTE1, isChecked).apply()
        }

        segundoSwitch.setOnCheckedChangeListener { _, isChecked ->
            arg.edit().putBoolean(TESTE2, isChecked).apply()
        }

        terceiroSwitch.setOnCheckedChangeListener { _, isChecked ->
            arg.edit().putBoolean(TESTE3, isChecked).apply()
        }

        quartoSwitch.setOnCheckedChangeListener { _, isChecked ->
            arg.edit().putBoolean(TESTE4, isChecked).apply()
        }

        quintoSwitch.setOnCheckedChangeListener { _, isChecked ->
            arg.edit().putBoolean(TESTE5, isChecked).apply()
        }

}