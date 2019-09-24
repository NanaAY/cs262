package edu.calvin.cs262.na29

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.R
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
//import sun.jvm.hotspot.utilities.IntArray


//import androidx.core.app.ComponentActivity.ExtraData
//import androidx.core.content.ContextCompat.getSystemService
//import android.icu.lang.UCharacter.GraphemeClusterBreak.T
//import android.widget.Toast
//import sun.jvm.hotspot.utilities.IntArray
//import android.R
//import androidx.core.content.ContextCompat.getSystemService
//import android.icu.lang.UCharacter.GraphemeClusterBreak.T
//import sun.jvm.hotspot.utilities.IntArray





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showToast(view: View) {
        val toast = Toast.makeText(
            this, R.string.toast_message,
            Toast.LENGTH_SHORT
        )
        toast.show()
    }

    fun countUp(view: View) {}


}
