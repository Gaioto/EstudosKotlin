package br.com.fiap.imagens

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class FruitInformation : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_fruit_information)
    }
}