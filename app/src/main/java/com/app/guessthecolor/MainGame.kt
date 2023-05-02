package com.app.guessthecolor


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainGame : AppCompatActivity() {
    private lateinit var currentFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.main_game)

        val okayBtn = findViewById<Button>(R.id.okay)
        val userInput = findViewById<EditText>(R.id.type_answer)

        // List of the different fragment levels
        val fragmentLevels = listOf(
            fragmentLevel1(),
            fragmentLevel2(),
            fragmentLevel3(),
            fragmentLevel4(),
            fragmentLevel5()
        )

        // Select a random fragment to start with
        currentFragment = fragmentLevels.random()
        supportFragmentManager.beginTransaction().replace(R.id.fraglevel_container, currentFragment).commit()

        okayBtn.setOnClickListener {
            when (currentFragment) {
                is fragmentLevel1 -> {
                    if (userInput.text.toString() == "YELLOW") {
                        currentFragment = fragmentLevels.random()
                        supportFragmentManager.beginTransaction().replace(R.id.fraglevel_container, currentFragment).commit()
                    } else {
                        Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()
                    }
                }
                is fragmentLevel2 -> {
                    if (userInput.text.toString() == "WHITE") {
                        currentFragment = fragmentLevels.random()
                        supportFragmentManager.beginTransaction().replace(R.id.fraglevel_container, currentFragment).commit()
                    } else {
                        Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()
                    }
                }
                is fragmentLevel3 -> {
                    if (userInput.text.toString() == "BLUE") {
                        currentFragment = fragmentLevels.random()
                        supportFragmentManager.beginTransaction().replace(R.id.fraglevel_container, currentFragment).commit()
                    } else {
                        Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()
                    }
                }
                is fragmentLevel4 -> {
                    if (userInput.text.toString() == "RED") {
                        currentFragment = fragmentLevels.random()
                        supportFragmentManager.beginTransaction().replace(R.id.fraglevel_container, currentFragment).commit()
                    } else {
                        Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()
                    }
                }
                is fragmentLevel5 -> {
                    if (userInput.text.toString() == "GREEN") {
                        currentFragment = fragmentLevels.random()
                        supportFragmentManager.beginTransaction().replace(R.id.fraglevel_container, currentFragment).commit()
                    } else {
                        Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}








