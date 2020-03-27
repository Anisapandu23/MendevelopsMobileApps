package com.anisapandu.hitungusiaku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_hitung.setOnClickListener {

            // mendeklarasikan edit text pada tahun lahir
            var tahunLahir = txt_tahun.text.toString().toInt()

            // mengambil tahun sekarang dari calendar
            var tahun:Int = Calendar.getInstance().get(Calendar.YEAR)

            // rumus = tahun sekarang dikurangi dengan tahun yang kita inputkan
            var usia = 0
            if (tahunLahir.toInt() !=null){
                usia = tahun - tahunLahir.toInt()
                tv_hasil.text = "Usia Anda = $usia Tahun"
            }else{
                tv_hasil.text = "Tahun Tidak Valid !"
            }

        }
    }
}
