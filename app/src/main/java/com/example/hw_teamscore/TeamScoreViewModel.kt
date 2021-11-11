package com.example.hw_teamscore

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import kotlin.properties.ReadOnlyProperty

class TeamScoreViewModel : ViewModel() {
    

    private var _score = 0
    val score: Int
    get() = _score

   fun  addOne(){

       _score =+1

   }


   fun addFour() {

       _score=+4
   }

   fun subtractTwo(){

       _score=-2

   }

   init {
        Log.i("TeamScoreViewModel", "TeamScoreViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("TeamScoreViewModel", "TeamScoreViewModel destroyed!")
    }

}