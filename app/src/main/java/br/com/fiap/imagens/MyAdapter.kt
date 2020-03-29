package br.com.fiap.imagens

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*
import kotlin.collections.ArrayList


class MyAdapter(private val arrayList: ArrayList<Fruta>, private val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun colocaFruta(fruta: Fruta) {

            itemView.nomeFruta.text = fruta.nome
            itemView.descFruta.text = fruta.desc
            itemView.imgFrutas.setImageResource(fruta.imagemFruta)
            itemView.frutaFundo.setBackgroundResource(fruta.cor)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, posicao: Int) {
        holder.colocaFruta(arrayList[posicao])

        holder.itemView.setOnClickListener {

            val fruta = arrayList[posicao]
            val fNome: String = fruta.nome
            val fInfo: String = fruta.info
            val fImagem: Int = fruta.imagemFruta
            val fCor: Int = fruta.cor

            val intent = Intent(context, FruitInformationActivity::class.java)
            intent.putExtra("fNome", fNome)
            intent.putExtra("fInfo", fInfo)
            intent.putExtra("fImagem", fImagem)
            intent.putExtra("fCor", fCor)

            context.startActivity(intent)
        }
    }
}


