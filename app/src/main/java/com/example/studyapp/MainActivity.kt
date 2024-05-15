package com.example.studyapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.studyapp.controlflow.ConditionalIf
import com.example.studyapp.controlflow.ConditionalWhen
import com.example.studyapp.controlflow.LoopFor
import com.example.studyapp.controlflow.LoopWhile
import com.example.studyapp.databinding.ActivityMainBinding
import com.example.studyapp.datastructure.DataTypeList
import com.example.studyapp.datastructure.DataTypeMap
import com.example.studyapp.datastructure.DataTypeSet

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    /*
     *  Declarating of Study Objects
     */
    private lateinit var dataTypeList: DataTypeList
    private lateinit var dataTypeSet: DataTypeSet
    private lateinit var dataTypeMap: DataTypeMap
    private lateinit var conditionalIf: ConditionalIf
    private lateinit var conditionalWhen: ConditionalWhen
    private lateinit var loopFor: LoopFor
    private lateinit var loopWhile: LoopWhile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()

        /*
         *  Instantiating of Study Objects
         */
        instantiatingStudyObjects()

        /*
         *  Calling examples
         */
        //listExamples()
        //setExamples()
        //mapExamples()
        //ifExamples()
        //whenExamples()
        //forExamples()
        whileExamples()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    /*
     *  Instantiating of Study Objects
     */
    private fun instantiatingStudyObjects() {
        //List<>
        dataTypeList = DataTypeList()
        //Set<>
        dataTypeSet = DataTypeSet()
        //Map<>
        dataTypeMap = DataTypeMap()
        //If
        conditionalIf = ConditionalIf()
        //When
        conditionalWhen = ConditionalWhen()
        //For
        loopFor = LoopFor()
        //While
        loopWhile = LoopWhile()
    }

    /*
     *  Calling examples
     */
    //LIST EXAMPLES
    private fun listExamples() {
        dataTypeList.list()
        dataTypeList.castingList()
        dataTypeList.accessingListItem()
        dataTypeList.countList()
        dataTypeList.addOrRemoveItemInList()
        dataTypeList.checkItemInList()
    }
    //SET EXAMPLES
    private fun setExamples() {
        dataTypeSet.declareSet()
        dataTypeSet.countingSet()
        dataTypeSet.accessingSetItem()
        dataTypeSet.addOrRemoveItemInSet()
    }
    //MAP EXAMPLES
    private fun mapExamples() {
        dataTypeMap.declareMap()
        dataTypeMap.accessingMapItem()
        dataTypeMap.countItemMap()
        dataTypeMap.addOrRemoveItemInMap()
        dataTypeMap.checkIfKeyInMap()
        dataTypeMap.obtainCollectionsFromMap()
        dataTypeMap.containKeyOrValueMap()
    }
    //IF EXAMPLES
    private fun ifExamples() {
        conditionalIf.controlIf()
    }
    //WHEN EXAMPLES
    private fun whenExamples() {
        conditionalWhen.controlWhen()
    }
    //FOR EXAMPLES
    private fun forExamples() {
        loopFor.forControl()
        loopFor.forInControl()
    }
    //WHILE EXAMPLES
    private fun whileExamples() {
        loopWhile.whileControl()
        loopWhile.doWhileControl()
    }
}