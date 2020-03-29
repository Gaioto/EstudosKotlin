package br.com.fiap.imagens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Fruta>()

        arrayList.add(Fruta(nome = getString(R.string.txt_abacaxi), desc = getString(R.string.abacaxi_desc), imagemFruta = R.drawable.abacaxi, info = getString(R.string.abacaxi_info), cor = R.color.color_abacaxi))
        arrayList.add(Fruta(nome = getString(R.string.txt_banana), desc = getString(R.string.banana_desc), imagemFruta = R.drawable.banana, info = getString(R.string.banana_info), cor = R.color.color_banana))
        arrayList.add(Fruta(nome = getString(R.string.txt_laranja), desc = getString(R.string.laranja_desc), imagemFruta = R.drawable.laranja, info = getString(R.string.laranja_info), cor = R.color.color_laranja))
        arrayList.add(Fruta(nome = getString(R.string.txt_manga), desc = getString(R.string.manga_desc), imagemFruta = R.drawable.manga, info = getString(R.string.manga_info), cor = R.color.color_manga))
        arrayList.add(Fruta(nome = getString(R.string.txt_melancia), desc = getString(R.string.melancia_desc), imagemFruta = R.drawable.melancia, info = getString(R.string.melancia_info), cor = R.color.color_melancia))
        arrayList.add(Fruta(nome = getString(R.string.txt_morango), desc = getString(R.string.morango_desc), imagemFruta = R.drawable.morango, info = getString(R.string.morango_info), cor = R.color.color_morango))
        arrayList.add(Fruta(nome = getString(R.string.txt_uva), desc = getString(R.string.uva_desc), imagemFruta = R.drawable.uva, info = getString(R.string.uva_info), cor = R.color.color_uva))
        arrayList.add(Fruta(nome = getString(R.string.txt_abacate), desc = getString(R.string.abacate_desc), imagemFruta = R.drawable.abacate, info = getString(R.string.abacate_info), cor = R.color.color_abacate))
        arrayList.add(Fruta(nome = getString(R.string.txt_kiwi), desc = getString(R.string.kiwi_desc), imagemFruta = R.drawable.kiwi, info = getString(R.string.kiwi_info), cor = R.color.color_kiwi))
        arrayList.add(Fruta(nome = getString(R.string.txt_limao), desc = getString(R.string.limao_desc), imagemFruta = R.drawable.limao, info = getString(R.string.limao_info), cor = R.color.color_limao))
        arrayList.add(Fruta(nome = getString(R.string.txt_maca), desc = getString(R.string.maca_desc), imagemFruta = R.drawable.maca, info = getString(R.string.maca_info), cor = R.color.color_maca))

        val myAdapter = MyAdapter(arrayList, this )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter

    }
}

