package br.com.fiap.imagens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fruit_information.*


class FruitInformationActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_fruit_information)

        val intent = intent
        val fNome = intent.getStringExtra("fNome")
        val fInfo = intent.getStringExtra("fInfo")
        val fImagem = intent.getIntExtra("fImagem", 0)
        val fCor = intent.getIntExtra("fCor", 0)

        fruit_name.text = fNome
        fruit_info.text = fInfo
        image_fruit.setImageResource(fImagem)
        tela_fruta.setBackgroundResource(fCor)
    }

}

