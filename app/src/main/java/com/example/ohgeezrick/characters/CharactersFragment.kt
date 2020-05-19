package com.example.ohgeezrick.characters

import androidx.fragment.app.viewModels
import com.example.ohgeezrick.R
import com.example.ohgeezrick.base.BaseFragment
import com.example.ohgeezrick.databinding.FragmentCharactersBinding

class CharactersFragment : BaseFragment<CharactersViewModel, FragmentCharactersBinding>() {

    override val viewModel by viewModels<CharactersViewModel> { factory }

    override fun getLayoutResourceId() = R.layout.fragment_characters
}