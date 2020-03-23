package br.com.fiap.imagens

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter(private val arrayList: ArrayList<Fruta>, private val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun colocaFruta(fruta: Fruta) {

            itemView.nomeFruta.text = fruta.nome
            itemView.descFruta.text = fruta.desc
            itemView.imgFrutas.setImageResource(fruta.imagemFruta)

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

            when(posicao){

                0 -> {
                    Toast.makeText(context, "ABACAXI!!!!", Toast.LENGTH_LONG).show()
                }

                1 -> {
                    Toast.makeText(context, "BANANA!!!!", Toast.LENGTH_LONG).show()
                }

                2 -> {
                    Toast.makeText(context, "LARANJA!!!!", Toast.LENGTH_LONG).show()
                }

                3 -> {
                    Toast.makeText(context, "MANGA!!!!", Toast.LENGTH_LONG).show()
                }

                4 -> {
                    Toast.makeText(context, "MELANCIA!!!!", Toast.LENGTH_LONG).show()
                }

                5 -> {
                    Toast.makeText(context, "MORANGO!!!!", Toast.LENGTH_LONG).show()
                }

                6 -> {
                    Toast.makeText(context, "UVA!!!!", Toast.LENGTH_LONG).show()
                }




            }
        }
    }
}


