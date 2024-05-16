package com.example.studyapp.functions

import android.util.Log

class LambdaExpressions {

    fun lambdaUppercase() {
        Log.d("STUDY_LAMBDA", { string: String -> string.uppercase() }("hello"))
    }

    fun lambdaFilter() {
        //sampleStart
        val numbers = listOf(1, -2, 3, -4, 5, -6, 7, 10)
        val positives = numbers.filter { x -> x > 0 }
        val negatives = numbers.filter { x -> x < 0 }
        val ten = numbers.filter { x -> x == 10 }
        Log.d("STUDY_LAMBDA_FILTER", positives.toString())
        // [1, 3, 5]
        Log.d("STUDY_LAMBDA_FILTER", negatives.toString())
        // [-2, -4, -6]
        Log.d("STUDY_LAMBDA_FILTER", ten.toString())
        // [10]
        //sampleEnd
    }

    fun lambdaMap() {
        //sampleStart
        val numbers = listOf(1, -2, 3, -4, 5, -6)
        val doubled = numbers.map { x -> x * 2 }
        val tripled = numbers.map { x -> x * 3 }
        val stringed = numbers.map { x -> x.toString() }
        Log.d("STUDY_LAMBDA_MAP", doubled.toString())
        // [2, -4, 6, -8, 10, -12]
        Log.d("STUDY_LAMBDA_MAP", tripled.toString())
        // [3, -6, 9, -12, 15, -18]
        Log.d("STUDY_LAMBDA_MAP", stringed.toString())
        //sampleEnd
    }

}