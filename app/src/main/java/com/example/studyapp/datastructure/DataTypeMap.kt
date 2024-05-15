package com.example.studyapp.datastructure

import android.util.Log

class DataTypeMap {
    //MAP
    fun declareMap() {
        //sampleStart
        // Read-only map
        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        Log.d("STUDY_MAP_DECLARE", "$readOnlyJuiceMenu")
        // {apple=100, kiwi=190, orange=100}
        // Mutable map with explicit type declaration
        val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        Log.d("STUDY_MAP_DECLARE", "$juiceMenu")
        // {apple=100, kiwi=190, orange=100}
        //sampleEnd
    }

    fun castingMap() {
        val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        val juiceMenuLocked: Map<String, Int> = juiceMenu
    }

    fun accessingMapItem() {
        //sampleStart
        // Read-only map
        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        Log.d("STUDY_MAP_SEARCH","The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
        // The value of apple juice is: 100
        //sampleEnd
    }

    fun countItemMap() {
        //sampleStart
        // Read-only map
        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        Log.d("STUDY_MAP_COUNT","This map has ${readOnlyJuiceMenu.count()} key-value pairs")
        // This map has 3 key-value pairs
        //sampleEnd
    }

    fun addOrRemoveItemInMap() {
        //sampleStart
        val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        juiceMenu.put("coconut", 150) // Add key "coconut" with value 150 to the map
        Log.d("STUDY_MAP_ADD", "$juiceMenu")
        // {apple=100, kiwi=190, orange=100, coconut=150}
        juiceMenu.remove("orange") // Remove key "orange" from the map
        Log.d("STUDY_MAP_REMOVE", "$juiceMenu")
        // {apple=100, kiwi=190, coconut=150}
        //sampleEnd
    }

    fun checkIfKeyInMap() {
        //sampleStart
        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        Log.d("STUDY_MAP_CHECK_KEY","This map has ${readOnlyJuiceMenu.containsKey("kiwi")}")
        // true
        //sampleEnd
    }

    fun obtainCollectionsFromMap() {
        //sampleStart
        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        Log.d("STUDY_MAP_COL_KEY","This map cointains the keys: ${readOnlyJuiceMenu.keys}")
        // [apple, kiwi, orange]
        Log.d("STUDY_MAP_COL_VALUE","This map contains the values: ${readOnlyJuiceMenu.values}")
        // [100, 190, 100]
        //sampleEnd
    }

    fun containKeyOrValueMap() {
        //sampleStart
        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        Log.d("STUDY_LIST_CONTAIN_KEY", ("orange" in readOnlyJuiceMenu.keys).toString())
        // true
        Log.d("STUDY_LIST_CONTAIN_VALUE", (200 in readOnlyJuiceMenu.values).toString())
        // false
        //sampleEnd
    }
}