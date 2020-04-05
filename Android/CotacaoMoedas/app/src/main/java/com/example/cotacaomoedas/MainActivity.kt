package com.example.cotacaomoedas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.secound_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dollar = 4.00
        val euros = 5.78
        val peso = 0.08


        check_dollar.setOnClickListener{
       check_euros.isChecked = false
       check_peso.isChecked = false
   }
      check_peso.setOnClickListener{
       check_euros.isChecked = false
       check_dollar.isChecked = false
   }
        check_euros.setOnClickListener{
            check_peso.isChecked = false
            check_dollar.isChecked = false
        }
        btn_calc.setOnClickListener{
            val valor = text_num.toString().toDouble()
            val intent = Intent(this@activity, secound_activity::class.java)
            if(check_dollar.isChecked == true){
                val valor = text_num.toString().toDouble()*dollar
                intent.putExtra("resultado", valor.toString())
                startActivity(intent)
            }
            else if(check_euros.isChecked == true){
                val valor = text_num.toString().toDouble() * euros
                intent.putExtra("resultado", valor.toString())
                startActivity(intent)
            }
            else if(check_peso.isChecked == true){
                val valor = text_num.toString().toDouble() * peso
                intent.putExtra("resultado", valor.toString())
                startActivity(intent)
            }
            else{
                Toast.makeText(applicationContext, "Escolha uma opção!", Toast.LENGTH_LONG).show()
            }

            if(intent != null){
                val valor = intent.gerStringExtra("resultado")
                text_resposta.text = valor
            }


        }



    }
}
