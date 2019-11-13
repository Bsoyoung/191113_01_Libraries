package com.example.a191113_01_libraries

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    var mContext:Context = this

    abstract fun setupEvents()
    abstract fun setValues()
}