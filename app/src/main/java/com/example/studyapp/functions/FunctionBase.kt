package com.example.studyapp.functions

import android.util.Log

class FunctionBase {

    //DEFAULT PARAMETER VALUES
    fun defaultValueParameter(message: String, prefix: String = "Info") {
        Log.d("STUDY_FUNCTION", "[$prefix] $message")
    }

}