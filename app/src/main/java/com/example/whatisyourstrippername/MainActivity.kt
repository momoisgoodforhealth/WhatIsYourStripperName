package com.example.whatisyourstrippername

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Swipe the three names simultaneously to the right to create your name lmao. :)",Toast.LENGTH_LONG).show()
        Timber.i("On Create Called")

    }

    override fun onStart() {
        super.onStart()
        Timber.i("OnStart Called")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("OnResume Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("OnDestroy Called")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("OnPause Called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("OnStop Called")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("OnRestart Called")
    }
}
