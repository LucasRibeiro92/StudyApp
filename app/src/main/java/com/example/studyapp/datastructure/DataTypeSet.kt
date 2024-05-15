package com.example.studyapp.datastructure

import android.util.Log

class DataTypeSet {
    //SET
    fun declareSet() {
        //sampleStart
        // Read-only set
        val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
        Log.d("STUDY_SET_DECLARE", "$readOnlyFruit")
        // Mutable set with explicit type declaration
        val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
        Log.d("STUDY_SET_DECLARE", "$fruit")
        // [apple, banana, cherry]
        //sampleEnd
        /*
         *  You can see in the previous example that because sets only contain unique elements,
         *  the duplicate "cherry" item is dropped.
         */
    }

    fun castingSet() {
        val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
        val fruitLocked: Set<String> = fruit
    }

    /*
    * As sets are unordered, you can't access an item at a particular index.
    */

    fun countingSet() {
        //sampleStart
        val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
        Log.d("STUDY_SET_COUNT", "This set has ${readOnlyFruit.count()} items")
        // This set has 3 items
        //sampleEnd
    }

    fun accessingSetItem() {
        //sampleStart
        val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
        Log.d("STUDY_SET_SEARCHING", ("banana" in readOnlyFruit).toString())
        // true
        //sampleEnd
    }

    fun addOrRemoveItemInSet() {
        //sampleStart
        val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
        fruit.add("dragonfruit") // Add "dragonfruit" to the set
        Log.d("STUDY_SET_ADD", "$fruit") // [apple, banana, cherry, dragonfruit]
        fruit.remove("dragonfruit") // Remove "dragonfruit" from the set
        Log.d("STUDY_SET_REMOVE", "$fruit") // [apple, banana, cherry]
        //sampleEnd
    }

}