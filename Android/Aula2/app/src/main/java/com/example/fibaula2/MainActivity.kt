package com.example.fibaula2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_basico.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_basico)


        botao1.setOnClickListener{
            Toast.makeText(this@MainActivity,"Apertei o Login",
            Toast.LENGTH_LONG).show();
        }
    }
}
