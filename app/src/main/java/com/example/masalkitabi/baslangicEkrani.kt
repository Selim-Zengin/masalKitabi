package com.example.masalkitabi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.ImageView
import com.bumptech.glide.Glide

class baslangicEkrani : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baslangic_ekrani)

        showGıf()

        supportActionBar?.hide()

        handler=Handler()
        handler.postDelayed({
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)

    }
    fun showGıf(){
        val imageView:ImageView=findViewById(R.id.imageView)
        Glide.with(this).load(R.drawable.baslangicgif1).into(imageView)
    }


}