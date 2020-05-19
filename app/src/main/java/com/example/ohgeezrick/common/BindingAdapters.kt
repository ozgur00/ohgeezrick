package com.example.ohgeezrick.common

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.ohgeezrick.R
import com.example.ohgeezrick.characters.CharactersAdapter
import com.example.ohgeezrick.datamodels.Character

@BindingAdapter("imageUrl")
fun setImage(view: ImageView, imageUrl: String?) {
    Glide.with(view.context)
        .load(imageUrl)
        .placeholder(R.color.colorAccent)
        .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
        .into(view)
}

@BindingAdapter("characters")
fun setCharacters(recyclerView: RecyclerView, sourceList: List<Character>?) {
    (recyclerView.adapter as CharactersAdapter).setCharacters(sourceList.orEmpty())
}