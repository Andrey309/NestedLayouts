package com.example.nestedlayouts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        var tv1: TextView = findViewById(R.id.textView)
        var tv2: TextView = findViewById(R.id.textView2)
        var tv3: TextView = findViewById(R.id.textView3)
        var tv4: TextView = findViewById(R.id.textView4)
        var tv5: TextView = findViewById(R.id.textView5)
        var tv6: TextView = findViewById(R.id.textView6)
        var tv7: TextView = findViewById(R.id.textView7)
        var tv8: TextView = findViewById(R.id.textView8)
        var tv9: TextView = findViewById(R.id.textView9)
        var i = 0
        var schet = 1

        button.setOnClickListener {


            if (tv4.text == "1") {

                tv1.setTextColor(Color.TRANSPARENT)
                tv2.text = "2"
                tv2.setTextColor(Color.BLACK)
                tv4.text = "2"
                tv8.text = "2"
                tv8.setTextColor(Color.BLACK)
                tv7.setTextColor(Color.TRANSPARENT)

            }
            else if (tv4.text == "2") {

                tv1.setTextColor(Color.TRANSPARENT)
                tv2.setTextColor(Color.TRANSPARENT)
                tv4.text = "3"
                tv4.setTextColor(Color.BLACK)
                tv8.setTextColor(Color.TRANSPARENT)
                tv3.text = "3"
                tv3.setTextColor(Color.BLACK)
                tv9.text = "3"
                tv9.setTextColor(Color.BLACK)

            }
            else
            {

                tv1.text = "1"
                tv1.setTextColor(Color.BLACK)
                tv2.setTextColor(Color.TRANSPARENT)
                tv4.text = "1"
                tv9.setTextColor(Color.TRANSPARENT)
                tv7.text = "1"
                tv7.setTextColor(Color.BLACK)
                tv3.setTextColor(Color.TRANSPARENT)

            }

        }
    }
}
