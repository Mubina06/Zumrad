package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var ImgArray: MutableList<Int> = mutableListOf()
    var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ImgArray.add(R.id.imageView7)
        ImgArray.add(R.id.imageView8)
        ImgArray.add(R.id.imageView9)
        ImgArray.add(R.id.imageView10)
        ImgArray.add(R.id.imageView11)
        ImgArray.add(R.id.imageView12)

//        imageView.setOnContextClickListener {
//          button.visibility = View.VISIBLE
//        }
    }
}


