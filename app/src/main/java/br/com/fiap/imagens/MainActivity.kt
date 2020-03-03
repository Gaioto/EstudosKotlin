package br.com.fiap.imagens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.putInt
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var selecionado : Int = 0

    val imagens = intArrayOf(
        R.drawable.abacaxi,
        R.drawable.banana,
        R.drawable.manga,
        R.drawable.morango,
        R.drawable.melancia
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_main)
        listenClicks()
    }

    fun trocarImagem(view : View) {
        val sorteado = Random() .nextInt (imagens.size)
        selecionado = sorteado
        imgFrutas.setImageResource( imagens[sorteado])
    }

    fun listenClicks() {
        imgFrutas.setOnClickListener {

            var intent = Intent(this, FruitInformationActivity::class.java).apply {
                putExtra("SELECIONADO", selecionado)
            }

            startActivity(intent)
        }
    }
}
