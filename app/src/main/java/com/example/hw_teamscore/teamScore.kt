package com.example.hw_teamscore

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_teamscore.databinding.TeamScoreFragmentBinding


class teamScore : Fragment() {

    private val viewModel : TeamScoreViewModel by viewModels()


    private lateinit var binding: TeamScoreFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        return inflater.inflate(R.layout.team_score_fragment, container, false)
        Log.e("TAG", "onCreateView: first", )
        binding = TeamScoreFragmentBinding.inflate(inflater,container,false)


        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        viewModel = ViewModelProvider(this).get(TeamScoreViewModel::class.java)
//        Log.e("TAG", "onViewCreated: first", )

        // Setup a click listener for buttons.
        binding.addButton.setOnClickListener {

            viewModel.addOne()
            binding.score.text = viewModel.score.toString()

        }
        binding.add4button.setOnClickListener {

            viewModel.addFour()
            binding.score.text = viewModel.score.toString()
        }
        binding.subButton.setOnClickListener {

            viewModel.subtractTwo()
            binding.score.text = viewModel.score.toString()

        }
    }


    override fun onDetach() {
        super.onDetach()
    }
}

