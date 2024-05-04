package dev.alexisvillarruel.pc1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val nota1: EditText = findViewById(R.id.txtnota1)
            val nota2: EditText = findViewById(R.id.txtnota2)
            val nota3: EditText = findViewById(R.id.txtnota3)
            val btncalcular: Button= findViewById(R.id.btncalcular)
            btncalcular.setOnClickListener{
                this.sendMessage(nota1.text.toString());
        }
    }
    private fun sendMessage(message: String){
        val intent = Intent(this, ResultActivity:: class.java)
        intent.putExtra("param,message")
        startActivity(intent)
    }
}