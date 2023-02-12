package com.example.masalkitabi

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.nfc.NdefRecord.createUri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isInvisible
import com.example.masalkitabi.databinding.ActivityDetayBinding
import kotlinx.android.synthetic.main.activity_detay.*



class DetayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetayBinding
    var mediaPlayer: MediaPlayer? = null
    private var seekForwardTime = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetayBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()


        var tutucu = 2

        mediaPlayer = MediaPlayer.create(this, R.raw.muzikk)


        sesAc.setOnClickListener {


            mediaPlayer?.start()

            // şarkıyı tekrardan çalmak için gereken kodlar  forwardSong()
            forwardSong()

            sesAc.isInvisible = true
            sesKapat.isInvisible = false

        }



        sesKapat.setOnClickListener {
            sesAc.isInvisible = false
            sesKapat.isInvisible = true
            mediaPlayer?.pause()

        }


        val intent = intent
        val landmark = intent.getSerializableExtra("landmark") as Landmark

        binding.baslikText.text = landmark.baslik

        binding.hikayeText.text = landmark.hikaye


        //bunlarla resim koyabilirsin
        // binding.imageView.setImageResource(landmark.image)
        // binding.activityDetayBackRaund.setBackgroundResource(landmark.image)


    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.pause()
    }


    // şarkıyı tekrardan çalmak için gereken kodlar
    private fun forwardSong() {

        if (!mediaPlayer!!.isLooping){
            mediaPlayer!!.isLooping=true

        }else{
            mediaPlayer!!.isLooping=false
        }

    }

}