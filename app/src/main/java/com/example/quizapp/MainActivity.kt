package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // make the app view to full screen
        // with out the Mobile setting toolbar on top
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

      //  val questionList = Constants.getQuestion()
      //  Log.i("Question Size" , "${questionList.size}")

        btn_start.setOnClickListener{
            if (et_id.toString().isEmpty()){
                Toast.makeText(
                    this,
                    "Please enter valid Id",
                    Toast.LENGTH_SHORT).show()
            } else {
                val indent = Intent(this, quizQuestionActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}


