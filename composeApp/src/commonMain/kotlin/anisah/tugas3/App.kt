package anisah.tugas3

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import anisah_tugas3_pam.composeapp.generated.resources.Res
import anisah_tugas3_pam.composeapp.generated.resources.profile
import org.jetbrains.compose.resources.painterResource


// Tema Warna sesuai instruksi
val SoftPink = Color(0xFFFFC1CC)
val DarkPink = Color(0xFFD81B60)

@Composable
fun App() {
    MaterialTheme {
        // State Management untuk Bonus Animasi (10%)
        var showContactInfo by remember { mutableStateOf(false) }

        // Layout Utama (25%): Column untuk menyusun vertikal dari atas ke bawah
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(SoftPink)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Reusable Composable 1
            ProfileHeader(
                name = "Anisah Octa Rohila",
                nim = "123140137",
                bio = "Mahasiswa Teknik Informatika yang tertarik pada UI/UX, pengembangan aplikasi mobile, dan cybersecurity."
            )

            Spacer(modifier = Modifier.height(32.dp))

            // UI Components (20%): Penggunaan Button
            Button(
                onClick = { showContactInfo = !showContactInfo },
                colors = ButtonDefaults.buttonColors(containerColor = DarkPink),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth(0.7f)
            ) {
                Text(
                    text = if (showContactInfo) "Sembunyikan Kontak" else "Lihat Kontak",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Bonus Nilai (10%): Animasi
            AnimatedVisibility(visible = showContactInfo) {
                // Reusable Composable 2
                ContactInfoCard()
            }
        }
    }
}

// --- REUSABLE COMPOSABLES (25%) ---

@Composable
fun ProfileHeader(name: String, nim: String, bio: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        // Komponen Image sederhana yang otomatis memotong gambar kotak menjadi bulat
        Image(
            painter = painterResource(Res.drawable.profile),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(120.dp)
                // Modifiers (15%): Chaining modifier .clip wajib ada
                .clip(CircleShape),
            // ContentScale.Crop akan melakukan zoom dan memotong tepi agar pas di lingkaran
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = name,
            fontSize = 26.sp,
            fontWeight = FontWeight.ExtraBold,
            color = DarkPink
        )
        Text(
            text = "NIM: $nim",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.DarkGray
        )
        Text(
            text = bio,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            color = Color.DarkGray,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}

@Composable
fun ContactInfoCard() {
    // UI Components (20%): Card dengan elevasi
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Reusable Composable 3 berulang
            InfoItem(icon = Icons.Default.Email, text = "anisah.123140137@student.itera.ac.id")
            InfoItem(icon = Icons.Default.Phone, text = "+62 811-2345-6789")
            InfoItem(icon = Icons.Default.LocationOn, text = "Bumi")
        }
    }
}

@Composable
fun InfoItem(icon: ImageVector, text: String) {
    // Layout (25%): Row untuk menyusun horizontal
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = DarkPink,
            modifier = Modifier.size(28.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = text,
            fontSize = 15.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.Medium
        )
    }
}