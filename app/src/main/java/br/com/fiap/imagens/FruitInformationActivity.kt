package br.com.fiap.imagens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fruit_information.*

class FruitInformationActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_fruit_information)
        setImage()
    }

    private fun setImage() {
        when(this.intent.getIntExtra("SELECIONADO", -1)){
            0 -> {
               image_fruit.setImageResource(R.drawable.abacaxi)
               fruit_name.text = getString(R.string.txt_abacaxi)
               fruit_info.text = getString(R.string.abacaxi_info)
               tela_fruta.background = getDrawable(R.color.color_abacaxi)
            }

            1 -> {
                image_fruit.setImageResource(R.drawable.banana)
                fruit_name.text = getString(R.string.txt_banana)
                fruit_info.text = getString(R.string.banana_info)
                tela_fruta.background = getDrawable(R.color.color_banana)
            }

            2 -> {
                image_fruit.setImageResource(R.drawable.manga)
                fruit_name.text = getString(R.string.txt_manga)
                fruit_info.text = getString(R.string.manga_info)
                tela_fruta.background = getDrawable(R.color.color_manga)
            }

            3 -> {
                image_fruit.setImageResource(R.drawable.morango)
                fruit_name.text = getString(R.string.txt_morango)
                fruit_info.text = getString(R.string.morango_info)
                tela_fruta.background = getDrawable(R.color.color_morango)
            }

            4 -> {
                image_fruit.setImageResource(R.drawable.melancia)
                fruit_name.text = getString(R.string.txt_melancia)
                fruit_info.text = getString(R.string.melancia_info)
                tela_fruta.background = getDrawable(R.color.color_melancia)
            }
        }

    }

}


