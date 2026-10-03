
package com.example.prak2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tugas() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Background halaman login
        Image(
            painter = painterResource(
                id = R.drawable.background_login
            ),
            contentDescription = "Background halaman login",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Komposisi halaman login
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Judul Login
            Text(
                text = "Login",
                color = Color.Blue,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Keterangan Login
            Text(
                text = "Ini adalah halaman login.",
                color = Color.White,
                fontSize = 12.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Logo UMY
            Image(
                painter = painterResource(
                    id = R.drawable.logo_umy
                ),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Nama mahasiswa
            Text(
                text = "Nama: Ayuningtyas",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(4.dp))

            // NIM mahasiswa
            Text(
                text = "NIM: 20240140255",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Gambar Kartun berbentuk lingkaran
            Image(
                painter = painterResource(
                    id = R.drawable.kartun_lucu
                ),
                contentDescription = "Gambar Kartun",
                modifier = Modifier
                    .size(140.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
    }
}