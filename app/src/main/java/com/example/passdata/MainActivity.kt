package com.example.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

//APP ERROR: second atcivity giving null even after giving strings
class MainActivity : AppCompatActivity() {

    //creating key
    companion object {
        const val key = "com.example.passdata.MainActivity.Key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val placedorderbtn = findViewById<Button>(R.id.orderbtn)
        val edit1 = findViewById<EditText>(R.id.et1)
        val edit2 = findViewById<EditText>(R.id.et2)
        val edit3 = findViewById<EditText>(R.id.et3)
        val edit4 = findViewById<EditText>(R.id.et4)

        placedorderbtn.setOnClickListener {
            val order = edit1.text.toString() +  "  " +edit2.text.toString() + "  " +
                    edit3.text.toString()+"  "+edit4.text.toString()
//            log.i("Info Tag", "this is my info tag")
            val intent = Intent(this, PlacedOrderScreen::class.java)
            intent.putExtra(key, placedorderbtn)
            startActivity(intent)
        }
    }
}

private fun Intent.putExtra(key: String, placedorderbtn: Button?) {
}
