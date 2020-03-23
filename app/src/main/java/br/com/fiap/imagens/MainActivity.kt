package br.com.fiap.imagens

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    //var selecionado : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        //listenClicks()

        val arrayList = ArrayList<Fruta>()

        arrayList.add(Fruta(nome = "Abacaxi", desc = "Fruta citrica, amarela por dentro", imagemFruta = R.drawable.abacaxi))
        arrayList.add(Fruta(nome = "Banana", desc = "Fruta doce, amarela por dentro e por fora", imagemFruta = R.drawable.banana))
        arrayList.add(Fruta(nome = "Laranja", desc = "Fruta citrica, laranja por dentro e por fora", imagemFruta = R.drawable.laranja))
        arrayList.add(Fruta(nome = "Manga", desc = "Fruta doce, amarela e vermelha por fora e amarela por dentro", imagemFruta = R.drawable.manga))
        arrayList.add(Fruta(nome = "Melancia", desc = "Fruta doce, verde por fora e vermelha por dentro", imagemFruta = R.drawable.melancia))
        arrayList.add(Fruta(nome = "Morango", desc = "Fruta doce, vermelha por fora e por dentro", imagemFruta = R.drawable.morango))
        arrayList.add(Fruta(nome = "Uva", desc = "Fruta doce, podendo ter a cor verde ou roxa por fora", imagemFruta = R.drawable.uva))

        val myAdapter = MyAdapter(arrayList, this )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter

    }

    /*fun listenClicks() {
        imgFrutas.setOnClickListener {

            var intent = Intent(this, FruitInformationActivity::class.java).apply {
                putExtra("SELECIONADO", selecionado)
            }

            startActivity(intent)
        }*/
    }

