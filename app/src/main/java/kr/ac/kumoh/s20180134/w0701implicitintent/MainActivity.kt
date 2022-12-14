package kr.ac.kumoh.s20180134.w0701implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20180134.w0701implicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // 카멜케이스
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHomepage.setOnClickListener{
            val uri = Uri.parse("http://www.instagram.com/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
            
        }
    }
}