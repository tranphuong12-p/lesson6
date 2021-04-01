package vn.udn.vku.nhhai.uedn4_picasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgView = findViewById<ImageView>(R.id.imageView)
        findViewById<Button>(R.id.loadImageBtn).setOnClickListener{
            Picasso.get().load("https://sohanews.sohacdn.com/thumb_w/660/2019/5/23/image002-15586128974481023278688.png")
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into(imgView)
        }
    }
}