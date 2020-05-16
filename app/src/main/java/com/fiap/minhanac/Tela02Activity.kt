package com.example.mynac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Tela2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela02)

        //Recuperando a intent
        val intent = intent

        //Parametro - Mapa
        val extra = intent.extras

        //Captura da Informaçao do Usuario
        val name = extra?.getString("name_text")
        val email = extra?.getString("email_text")
        val message = extra?.getString("message_text")

        //Nome
        val textName = findViewById<TextView>(R.id.nome)

        //E-mail
        val textEmail = findViewById<TextView>(R.id.email)

        //Menssagem
        val textMessage = findViewById<TextView>(R.id.mensagem)

        //Button
        val btnClose = findViewById<Button>(R.id.voltar)

        //Clique
        btnClose.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity::class.java)
            //Dispara a Activity
            startActivity(intent)
        }
    }
}
