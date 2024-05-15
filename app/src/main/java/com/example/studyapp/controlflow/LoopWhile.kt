package com.example.studyapp.controlflow

import android.util.Log

class LoopWhile {

    fun whileControl() {
        var cakesEaten = 0
        while (cakesEaten < 3) {
            Log.d("STUDY_WHILE", "Eat a cake")
            cakesEaten++
        }
        // Eat a cake
        // Eat a cake
        // Eat a cake
    }

    fun doWhileControl() {
        var cakesBaked = 0
        do {
            Log.d("STUDY_DO_WHILE", "Bake a cake")
            cakesBaked++
        } while (cakesBaked < 3)
    }

    fun pizzaSlices() {
        var sliceOfPizza = 0
        while (sliceOfPizza < 9) {
            Log.d("STUDY_PIZZA_EXERCISE", "Right here, we have $sliceOfPizza pizza slices")
            sliceOfPizza++
        }
    }

    fun doPizzaSlices() {
        var sliceOfPizza = 0
        do {
            Log.d("STUDY_DO_PIZZA_EXERCISE", "Right here, we have $sliceOfPizza pizza slices")
            sliceOfPizza++
        } while (sliceOfPizza < 9)
    }
}