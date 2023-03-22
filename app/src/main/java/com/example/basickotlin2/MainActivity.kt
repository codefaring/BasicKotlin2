package com.example.basickotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.basickotlin2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        for(num in 1..10){
            Log.d("for문 실행결과", "지금 숫자는 $num")
        }

        var arrayWeek = arrayOf("월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일")

        for(week in 0 until arrayWeek.size){
            Log.d("for문 실행결과", "지금 숫자는 $week")
        }

        for(num in 1..10 step 4){
            Log.d("for문 step 실행결과", "숫자는 $num")
        }

        for(num in 10 downTo 5){
            Log.d("for문 downTo 실행결과", "숫자는 $num")
        }

        for(num in 10 downTo 0 step 2){
            Log.d("for문 downTo step 실행결과", "숫자는 $num")
        }

        var count = 1
//        while(count == 1) {   // 무한 루프
//            Log.d("while", "현재 숫자는 $count")
//        }

        while(count < 10) {   // 무한 루프
            Log.d("while", "현재 숫자는 $count")
            count += 1
        }

        for(index in 1..10) {
            Log.d("for문 break", "현재 인덱스는 $index 입니다")
            if(index > 5){
                break
            }
        }

        for(num in 1..10) {
            if(num > 5 && num < 9) {
                continue
            }
            Log.d("for문 break", "현재 인덱스는 $num 입니다")
        }

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShow.setOnClickListener{
            binding.textShow.text = "Log.d 확인하세요!!"
        }
    }
}