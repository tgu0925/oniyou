package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class GradeOneActivity : AppCompatActivity() {
    val TAG: String = "로그"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grade_one)
    }

    fun onBackButtonClicked(view: View){
        Log.d(TAG, "SecondActivity - onBackButtonClicked() called")
        finish()
    }

}