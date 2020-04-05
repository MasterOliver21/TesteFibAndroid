package com.example.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        btn_ICM.setOnClickListener(){
            val altura = editAltura.toString().toDouble()
            val peso = editPeso.toString().toDouble()
            val icm = peso/(altura*altura)

            if(icm < 18.5){
                txt_view.text = "Deficit de massa corporal Baixo risco"
            }
            else if (icm > 18.5 && icm <= 24.9){
                txt_view.text = "Massa corporal normal Normal"
            }
            else if(icm > 25 && icm <= 29.9){
                txt_view.text = "Sobrepeso Elevado"
            }
            else if(icm > 30 && icm <= 34.9){
                txt_view.text = "Obesidade leve Alto"
            }
            else if (icm > 35 && icm < 39.9){
                txt_view.text = "Obesidade media Muito Alto"
            }
            else{
                txt_view.text = "Obesidade morbida Iminente"
            }

            Toast.makeText(this,"Feito!", Toast.LENGTH_LONG).show()

        }
        }

    }



