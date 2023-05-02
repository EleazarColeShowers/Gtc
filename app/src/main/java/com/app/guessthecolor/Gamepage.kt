package com.app.guessthecolor

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment

@Suppress("DEPRECATION")
class Gamepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gamer_activity)
        supportActionBar?.hide()

        //to make the fragments show after 3s, after displaying the splash page
        val delayMillis = 3000
        val handler = Handler()
        val fragments= listOf(fragment1(), fragment2())
        fun showNextFrag(index: Int){
            if(index< fragments.size){
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frag_container,fragments[index])
                    .commit()
                handler.postDelayed({showNextFrag(index +1)}, delayMillis.toLong())
            }

        }
        showNextFrag(0)




//        handler.postDelayed({
//            val fragment= Fragment()
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.frag_container, fragment)
//                .commit()
//        }, delayMillis.toLong())


    }
}