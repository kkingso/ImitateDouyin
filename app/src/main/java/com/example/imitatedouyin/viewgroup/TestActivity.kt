package com.example.imitatedouyin.viewgroup

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.example.imitatedouyin.R

class TestActivity : AppCompatActivity() {

    private val TAG = "TestActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.i(TAG, "dispatchTouchEvent: " + ev?.action)
        return super.dispatchTouchEvent(ev)
//        return true
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.i(TAG, "onTouchEvent: " + event?.action)
        return super.onTouchEvent(event)
//        return true
    }
}