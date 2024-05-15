package com.example.studyapp.controlflow

import android.util.Log

class LoopFor {
    //Iteraring on numbers using .. type of range
    fun forControl() {
        for (number in 1..5) {
            Log.d("STUDY_FOR", number.toString())
        }
    }

    //Iterating over a collection using in type of range
    fun forInControl() {
        //sampleStart
        val cakes = listOf("carrot", "cheese", "chocolate")
        for (cake in cakes) {
            Log.d("STUDY_FOR_IN", "Yummy, it's a $cake cake!")
        }
        // Yummy, it's a carrot cake!
        // Yummy, it's a cheese cake!
        // Yummy, it's a chocolate cake!
        //sampleEnd
    }
}