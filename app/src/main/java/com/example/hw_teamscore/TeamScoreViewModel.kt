package com.example.hw_teamscore

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import kotlin.properties.ReadOnlyProperty

class TeamScoreViewModel : ViewModel() {
    
//declare var
    private var _score = 0
    val score: Int
    get() = _score


    //declare functions

   fun  addOne(): Int {

       _score +=1

       return _score
   }


   fun addFour(): Int {

       _score+=4

       return _score
   }


   fun subtractTwo(): Int {

       _score-=2

       return _score
   }
}