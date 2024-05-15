package com.example.studyapp.controlflow

import android.util.Log

class ConditionalWhen {

    fun controlWhen() {
        val obj = "Hello"

        when (obj) {
            // Checks whether obj equals to "1"
            "1" -> Log.d("STUDY_WHEN", "One")
            // Checks whether obj equals to "Hello"
            "Hello" -> Log.d("STUDY_WHEN","Greeting")
            // Default statement
            else -> Log.d("STUDY_WHEN","Unknown")
        }

        val result = when (obj) {
            // If obj equals "1", sets result to "one"
            "1" -> "One"
            // If obj equals "Hello", sets result to "Greeting"
            "Hello" -> "Greeting"
            // Sets result to "Unknown" if no previous condition is satisfied
            else -> "Unknown"
        }
        Log.d("STUDY_WHEN_TO_VAR", result)

        val temp = 18
        val description = when {
            // If temp < 0 is true, sets description to "very cold"
            temp < 0 -> "very cold"
            // If temp < 10 is true, sets description to "a bit cold"
            temp < 10 -> "a bit cold"
            // If temp < 20 is true, sets description to "warm"
            temp < 20 -> "warm"
            // Sets description to "hot" if no previous condition is satisfied
            else -> "hot"
        }
        Log.d("STUDY_WHEN_TO_BOOL_CHAIN", description)
    }
}