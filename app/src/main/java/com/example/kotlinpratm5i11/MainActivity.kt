package com.example.kotlinpratm5i11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {
    val num1 = 10
    val num2 = 33
    var num3 = 66

    var resultado = num1 + num2 + num3
    println(resultado)

    num3 = 55
    println(resultado)

    val promedio = (num1 + num2 + num3) / 3.0
    println(promedio)
}

