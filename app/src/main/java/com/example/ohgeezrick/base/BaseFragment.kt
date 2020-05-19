package com.example.ohgeezrick.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.ohgeezrick.BR
import com.example.ohgeezrick.mvvm.ViewModelFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<VM: BaseViewModel, DB: ViewDataBinding> : DaggerFragment() {

    @Inject
    lateinit var factory: ViewModelFactory

    abstract val viewModel: VM

    lateinit var binding: DB

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(LayoutInflater.from(requireContext()), getLayoutResourceId(), container, false
        )
        bind(viewModel)
        return binding.root
    }

    @LayoutRes
    abstract fun getLayoutResourceId(): Int

    @CallSuper
    protected open fun bind(viewModel: VM) {
        this.binding.lifecycleOwner = this
        this.binding.setVariable(BR.viewModel, viewModel)
    }

}