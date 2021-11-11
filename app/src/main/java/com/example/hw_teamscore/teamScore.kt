package com.example.hw_teamscore

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_teamscore.databinding.TeamScoreFragmentBinding


class teamScore : Fragment() {

    private val viewModel1: TeamScoreViewModel by viewModels()

    private var binding: TeamScoreFragmentBinding ? = null

    private lateinit var viewModel: TeamScoreViewModel

    private var score = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       // return inflater.inflate(R.layout.team_score_fragment, container, false)

        binding = TeamScoreFragmentBinding.inflate(inflater,container,false)


        Log.d("TeamScoreFragment", "TeamScoreFragment created/re-created!")

        return binding!!.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(TeamScoreViewModel::class.java)

        // Setup a click listener for buttons.
        binding!!.button.setOnClickListener { viewModel.addOne()  }
        binding!!.button2.setOnClickListener { viewModel.addFour() }
        binding!!.button3.setOnClickListener { viewModel.subtractTwo() }
        // Update the UI
//        showScoreOnScreen()
        binding!!.score1.text = "getString(R.id.score1, 0)"
    }


    override fun onDetach() {
        super.onDetach()
        Log.d("GameFragment", "GameFragment destroyed!")
    }


//    private fun showScoreOnScreen() {
//        binding!!.score1.text = viewModel.score
//    }

}

