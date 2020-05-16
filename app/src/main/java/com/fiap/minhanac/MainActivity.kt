package com.example.mynac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Chama o id Text
        val etName = findViewById<EditText>(R.id.nome)
        //Recupera o Text
        val name = etName.text.toString()

        //Chama o id Email
        val etEmail = findViewById<EditText>(R.id.email)
        //Recupera o email
        val email = etEmail.text.toString()

        //Chama o id Mensagem
        val etMessage = findViewById<EditText>(R.id.mensagem)
        //Recupera a mensagem
        val message = etMessage.text.toString()

        //Chama o id do botão
        val btnSubmit = findViewById<Button>(R.id.enviar)

        //Ação do Clique
        btnSubmit.setOnClickListener{
            val intent = Intent(applicationContext, Tela2Activity::class.java)
            intent.putExtra("name_text", name)
            //Dispara a Activity
            startActivity(intent)
        }
    }
}
