package br.com.fiap.imagens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val imagens = intArrayOf(
        R.drawable.abacaxi,
        R.drawable.banana,
        R.drawable.manga,
        R.drawable.morango,
        R.drawable.melancia
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_main)
    }

    fun trocarImagem(view : View) {
        val sorteado = Random() .nextInt (imagens.size)
        imgFrutas.setImageResource( imagens[sorteado])
    }
}
