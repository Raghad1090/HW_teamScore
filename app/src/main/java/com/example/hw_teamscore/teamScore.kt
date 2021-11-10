package com.example.hw_teamscore

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import android.view.ViewGroup

class teamScore : Fragment() {


    private lateinit var viewModel: TeamScoreViewModel
    private val viewModel: TeamScoreViewModel by viewModels()

    private var score = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.team_score_fragment, container, false)

        binding = team_score_fragment.inflate(inflater, container,false)

        Log.d("TeamScoreFragment", "TeamScoreFragment created/re-created!")
        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {

        viewModel = ViewModelProvider(this).get(TeamScoreViewModel::class.java)

        // Setup a click listener for buttons.
        binding.button.setOnClickListener { addOne() }
        binding.button2.setOnClickListener { addFour() }
        binding.button3.setOnClickListener { subtractTwo() }
        // Update the UI
        showScoreOnScreen()
        binding.score.textview = getString(R.id.score, 0)
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("GameFragment", "GameFragment destroyed!")
    }


    private fun showScoreOnScreen() {
        binding.textViewscore.text = viewModel.score
    }
}

