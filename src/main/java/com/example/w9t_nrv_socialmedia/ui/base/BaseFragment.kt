package com.example.w9t_nrv_socialmedia.ui.base

import android.graphics.drawable.DrawableContainer
import android.os.Bundle
import android.provider.CalendarContract
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding>: Fragment() {

    abstract val LOG_TAG: String?
    abstract val bindingInflater: (LayoutInflater) -> VB
    private var _binding: ViewBinding? = null

    protected val binding
        get() = _binding as VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState:Bundle?
    ): View?{
        _binding = bindingInflater(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    abstract fun setup()
    protected fun log(value: Any){ Log.v(LOG_TAG, value.toString()) }

}