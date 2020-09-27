package com.wazunga.findit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_slide1.*

class slide1 : AppCompatActivity() {

    var logo: ImageView? = null
    var frontop: Animation? = null
    private val SPLASH_TIME_OUT:Long=2500 // 3 sec

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide1)

        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity
            startActivity(Intent(this, slide2::class.java))
            // close this activity
            finish()
        }, SPLASH_TIME_OUT)

        next_one.setOnClickListener {
            val intento1 = Intent(this, slide2::class.java)
            startActivity(intento1)
            finish()

        }

    }
}
