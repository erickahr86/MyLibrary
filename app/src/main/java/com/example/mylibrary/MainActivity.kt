package com.example.mylibrary

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.mylibrary.databinding.ActivityMainBinding

class MainActivity : ToolbarActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate( layoutInflater )
        setContentView( binding.root )

        toolbarToLoad( binding.toolbar as Toolbar )
        enableHomeDisplay( true )


    }
}