package com.example.ohgeezrick.characters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.ohgeezrick.BR
import com.example.ohgeezrick.R
import com.example.ohgeezrick.datamodels.Character

class CharactersAdapter(private val onItemClick: (Character) -> Unit): RecyclerView.Adapter<CharactersAdapter.CharacterViewHolder>() {

    private val characters: MutableList<Character> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CharacterViewHolder(parent, R.layout.item_character)

    override fun getItemCount() = characters.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(characters[position], onItemClick)
    }

    class CharacterViewHolder(
        parent: ViewGroup,
        @LayoutRes
        layoutId: Int,
        private val binding: ViewDataBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            layoutId,
            parent,
            false
        )
    ): RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Character, onClickAction: (Character) -> Unit) {
            this.binding.setVariable(BR.data, data)
            this.binding.executePendingBindings()
            itemView.setOnClickListener {
                onClickAction(data)
            }
        }

    }

}