package com.example.foca // Pastikan ini sesuai dengan nama package aplikasi Anda

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 3000 // 3 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Menghilangkan status bar untuk tampilan fullscreen (opsional, tergantung preferensi)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash)

        // Menggunakan Handler untuk menunda transisi ke Main Activity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SplashScreenActivity::class.java) // Ganti MainActivity dengan activity utama Anda
            startActivity(intent)
            finish() // Tutup SplashScreenActivity agar tidak bisa kembali ke sini dengan tombol back
        }, SPLASH_TIME_OUT)
    }
}