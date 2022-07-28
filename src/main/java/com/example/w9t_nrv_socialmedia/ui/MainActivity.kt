package com.example.w9t_nrv_socialmedia.ui

import android.os.Bundle
import android.view.LayoutInflater
import com.example.w9t_nrv_socialmedia.R
import com.example.w9t_nrv_socialmedia.databinding.ActivityMainBinding
import com.example.w9t_nrv_socialmedia.ui.base.BaseActivity
import com.example.w9t_nrv_socialmedia.ui.home.HomeFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val homeFragment = HomeFragment()

    override val LOG_TAG = MainActivity::class.simpleName
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun setup() {
        initNavigationBar()
        replaceFragment(homeFragment)
    }

    private fun initNavigationBar(){
        binding?.bottomNavigation?.setOnNavigationItemSelectedListener { item ->
          replaceFragment(
            when(item.itemId){
                R.id.pageHome -> homeFragment
                else -> throw Exception("Fragment not found")
            }
          )
            true
        }
    }

    private  fun replaceFragment(fragment: HomeFragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.idFragmentHome, fragment).commit()
    }

}