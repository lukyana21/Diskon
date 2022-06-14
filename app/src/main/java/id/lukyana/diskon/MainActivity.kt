package id.lukyana.diskon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import id.lukyana.diskon.BesarBiayaDiskon.Companion.EXTRA_DISKON

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Diskon: EditText = findViewById(R.id.isiDiskon)
        val Harga: EditText = findViewById(R.id.isiItem)
        val btn: Button = findViewById(R.id.btnHitung)
        val tmplError: TextView = findViewById(R.id.tampilanError)

        btn.setOnClickListener {
            val DiskonBarang = Diskon.text.toString()
            val HargaBarang = Harga.text.toString()

            btn.setOnClickListener {
                if (DiskonBarang.isNullOrBlank() && HargaBarang.isNullOrBlank()){
                    tmplError.text = "Segala Informasi yang dibutuhkan Harus Diisi!"
                }else if (HargaBarang.isNullOrBlank()){
                    tmplError.text = "Informasi Harga Tidak Boleh Kosong!"
                }else if (DiskonBarang.isNullOrBlank()){
                    tmplError.text = "Informasi Diskon Tidak Boleh Kosong!"
                }else{
                    val hasil = (HargaBarang.toDouble() - DiskonBarang.toDouble() / 100 * HargaBarang.toDouble()).toString()
                    val i = Intent(this@MainActivity, BesarBiayaDiskon::class.java)
                    i.putExtra(EXTRA_DISKON, hasil)
                    startActivity(i)
                }
            }
        }
    }
}