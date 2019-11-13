package com.example.a191113_01_libraries

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        callBtn.setOnClickListener {

            var permissionListener = object : PermissionListener {
                override fun onPermissionGranted() {
                    var uri = Uri.parse("tel:${phoneNumTxt.text.toString().replace("-","")}")
                    var intent = Intent(Intent.ACTION_CALL,uri)
                    startActivity(intent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(mContext,"권한을 설정해야 전화 사용이 가능합니다.",Toast.LENGTH_SHORT).show()

                }

            }
            TedPermission.with(mContext)
                .setPermissionListener(permissionListener)
                .setRationaleMessage("전화 권한을 설정해야 바로 연결이 가능합니다.")
                .setDeniedMessage("설정 > 권한에서 허용 가능합니다.")
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()

        }
    }

    override fun setValues() {
        var url = "https://mblogthumb-phinf.pstatic.net/MjAxNzEwMTFfMTIg/MDAxNTA3Njg4OTE2Nzc0.bfpf13NNrJQ47nOad71EHrIGLwke2YRowmdw_nCdw1Yg.Ww7wKhtCxPmODHQv59ll6X99x6UBAGqf9rapYlMM82kg.PNG.sabins1112/2017-10-11_11%3B27%3B51.PNG?type=w2"
        Glide.with(mContext).load(url).into(profileImg)

    }

}
