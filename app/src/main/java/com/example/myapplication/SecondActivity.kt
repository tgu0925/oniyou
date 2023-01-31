package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    val TAG: String = "로그"
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.chooseGradeOne.setOnClickListener(View.OnClickListener {
            onGradeOneButtonClicked()
            val intent = Intent(this,GradeOneActivity::class.java)
            startActivity(intent)
        })
    }

    fun onBackButtonClicked(view: View){
        Log.d(TAG, "SecondActivity - onBackButtonClicked() called")
        finish()
    }

    fun onGradeOneButtonClicked(){
        Log.d(TAG, "SecondActivity - onGradeOneButtonClicked() called")
    }

}