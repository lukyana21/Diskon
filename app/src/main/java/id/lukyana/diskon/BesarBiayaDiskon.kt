package id.lukyana.diskon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BesarBiayaDiskon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_besar_biaya_diskon)

        val hasil: TextView = findViewById(R.id.besarDiskon)

        val hasilTangkap = intent.getStringExtra(EXTRA_DISKON)
        hasil.text = hasilTangkap
    }

    companion object{
        const val EXTRA_DISKON = "extra_diskon"
    }
}