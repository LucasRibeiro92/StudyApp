package com.example.studyapp.datastructure

import android.util.Log

class DataTypeList {
    //LIST
    fun list() {
        //sampleStart
        // Read only list
        val readOnlyShapes = listOf("triangle", "square", "circle")
        Log.d("STUDY_LIST", "$readOnlyShapes")
        // [triangle, square, circle]
        // Mutable list with explicit type declaration
        val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
        Log.d("STUDY_LIST", "$shapes")
        // [triangle, square, circle]
        //s
    }

    fun castingList() {
        //To prevent unwanted modifications, you can obtain read-only views of mutable lists by assigning them to a List:
        val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
        val shapesLocked: List<String> = shapes
        /*
        try {
            shapesLocked.remove[0]
        } catch (e: throwable) {
            Log.d("STUDY_LIST_CASTING", "$e")
        }
        */
        //This is also called casting.
    }

    fun accessingListItem() {
        //sampleStart
        val readOnlyShapes = listOf("triangle", "square", "circle")
        Log.d("STUDY_LIST_CASTING", readOnlyShapes[1])
        //or
        Log.d("STUDY_LIST_CASTING", readOnlyShapes.first())
        // The first item in the list is: triangle
        //sampleEnd

    }

    //To get the number of items in a list, use the .count() function:
    fun countList() {
        //sampleStart
        val readOnlyShapes = listOf("triangle", "square", "circle")
        Log.d("STUDY_LIST_COUNT", "This list has ${readOnlyShapes.count()} items")
        // This list has 3 items
        //sampleEnd
    }

    //To check that an item is in a list, use the in operator:
    fun checkItemInList() {
        //sampleStart
        val readOnlyShapes = listOf("triangle", "square", "circle")
        Log.d("STUDY_LIST_SEARCHING", ("circle" in readOnlyShapes).toString())
        // true
        //sampleEnd
    }

    // To add or remove items from a mutable list, use .add() and .remove() functions respectively:
    fun addOrRemoveItemInList() {
        //sampleStart
        val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
        // Add "pentagon" to the list
        shapes.add("pentagon")
        Log.d("STUDY_LIST_ADD", "$shapes")
        // [triangle, square, circle, pentagon]
        // Remove the first "pentagon" from the list
        shapes.remove("pentagon")
        Log.d("STUDY_LIST_REMOVE", "$shapes")
        // [triangle, square, circle]
        //sampleEnd
    }
}