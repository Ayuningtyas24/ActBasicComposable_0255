package com.example.prak2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
        // Gambar latar belakang
        Image(
            painter = painterResource(
                id = R.drawable.background_login
            ),
            contentDescription = "Latar belakang halaman login",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Judul dan keterangan login
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login",
                color = Color.Blue,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(
                modifier = Modifier.height(4.dp)
            )

            Text(
                text = "Ini adalah halaman login.",
                color = Color.White,
                fontSize = 12.sp
            )
        }
    }
}