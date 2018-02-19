package com.dotinstall.myomikujiapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getOmikujibutton.setOnClickListener{
            //            Log.v("MainActivity","Button Clicked")
            val results =arrayOf("大吉","吉","中吉","小吉","大凶")
//          val n = Random().nextInt(5) //nに０からその整数値未満の整数値をランダムに生成
            val n = Random().nextInt(results.count()) //switch文ではなくcount()で配列の個数が返り値
            if(n==0){
//                resultTextView.setTextColor(Color.RED)
//                resultTextView.setTextColor(Color.parseColor("#ff0000")) cssのように
                resultTextView.setTextColor(Color.argb(255,255,0,0)) //透明度つき
            }else{
                resultTextView.setTextColor(Color.parseColor("#808080"))
            }

            resultTextView.text=results.get(n)//n番目のresultsの値を代入
        }
    }
}
