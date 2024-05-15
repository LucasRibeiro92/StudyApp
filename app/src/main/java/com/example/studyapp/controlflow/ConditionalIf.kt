package com.example.studyapp.controlflow

import android.util.Log

class ConditionalIf {

    fun controlIf() {
        //sampleStart
        val d: Int
        val check = true
        if (check) {
            d = 1
        } else {
            d = 2
        }
        Log.d("STUDY_CONDIT_IF", "$d")
        // 1
        //sampleEnd
    }

}