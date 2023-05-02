package com.app.guessthecolor

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class fragment2: Fragment(R.layout.fragment2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //to switch to another activity on clicking the fragment
        val tapToView = view.findViewById<com.airbnb.lottie.LottieAnimationView>(R.id.tap_to_view)
        tapToView.setOnClickListener {
            val intent = Intent(requireContext(), MainGame::class.java)
            startActivity(intent)
        }
    }
}