package com.example.iambeta.ProfilePage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.iambeta.MainPage.MainActivity
import com.example.iambeta.R

class ProfilePage : AppCompatActivity() {

    //Declaring Button Variables
    private var profileToEditPage: Button? = null
    private var profileToMainPage: Button? = null
    private var profileToLogOut: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        //Initializing profileEditPage Button
        profileToEditPage = findViewById(R.id.Button_profileToEditPage)

        //Initializing profileToMainPage Button & Checking if pressed
        profileToMainPage = findViewById(R.id.Button_profileToMainPage)
        profileToMainPage!!.setOnClickListener {
            openMainPage()
        }

        //Initializing profileLogOut Button
        profileToLogOut = findViewById(R.id.Button_profileLogOut)
    }

    private fun openMainPage(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
