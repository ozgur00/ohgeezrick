package com.example.ohgeezrick.characters

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ohgeezrick.R
import com.example.ohgeezrick.base.BaseFragment
import com.example.ohgeezrick.databinding.FragmentCharactersBinding

class CharactersFragment : BaseFragment<CharactersViewModel, FragmentCharactersBinding>() {

    override val viewModel by viewModels<CharactersViewModel> { factory }

    override fun getLayoutResourceId() = R.layout.fragment_characters

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<RecyclerView>(R.id.characters_recyclerview).apply {
            adapter = CharactersAdapter {
                Log.d("click", "item clicked")
            }
            layoutManager = GridLayoutManager(context, 3)
        }
    }
}