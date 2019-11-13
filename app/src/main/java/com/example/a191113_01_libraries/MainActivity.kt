package com.example.a191113_01_libraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
        var url = "https://mblogthumb-phinf.pstatic.net/MjAxNzEwMTFfMTIg/MDAxNTA3Njg4OTE2Nzc0.bfpf13NNrJQ47nOad71EHrIGLwke2YRowmdw_nCdw1Yg.Ww7wKhtCxPmODHQv59ll6X99x6UBAGqf9rapYlMM82kg.PNG.sabins1112/2017-10-11_11%3B27%3B51.PNG?type=w2"
        Glide.with(mContext).load(url).into(profileImg)

    }

}
