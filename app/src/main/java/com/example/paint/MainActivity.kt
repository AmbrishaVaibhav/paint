package com.example.paint

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paint.Paintview.Companion.colorList
import com.example.paint.Paintview.Companion.currentbrush
import com.example.paint.Paintview.Companion.pathList

class MainActivity : AppCompatActivity() {
    companion object{
        var path = Path()
        var paintbrush=Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val redbut = findViewById<ImageButton>(R.id.redcol)
        val bluebut = findViewById<ImageButton>(R.id.bluecol)
        val greenbut = findViewById<ImageButton>(R.id.greencol)
        val yellowbut = findViewById<ImageButton>(R.id.yellowcol)
        val blackbut = findViewById<ImageButton>(R.id.blackcol)
        val eraser = findViewById<ImageButton>(R.id.whitecol)
        redbut.setOnClickListener {
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.RED
            currentcolour(paintbrush.color)
        }
        bluebut.setOnClickListener {
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.BLUE
            currentcolour(paintbrush.color)}
        greenbut.setOnClickListener {
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.GREEN
            currentcolour(paintbrush.color)}
        yellowbut.setOnClickListener {
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.YELLOW
            currentcolour(paintbrush.color)}
        blackbut.setOnClickListener {
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.BLACK
            currentcolour(paintbrush.color)}
        eraser.setOnClickListener {
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
             pathList.clear()
             colorList.clear()
             path.reset()
            }

    }
    private fun currentcolour(color: Int){
        currentbrush= color
        path =Path()
    }
}
