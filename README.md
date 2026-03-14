# Anisah's Profile App

## 📝 Deskripsi Proyek

Anisah's Profile App adalah aplikasi multi-platform yang dirancang untuk menampilkan informasi profil pribadi secara elegan dan interaktif. Aplikasi ini memanfaatkan teknologi Kotlin Multiplatform dengan Compose untuk memberikan pengalaman pengguna yang konsisten di platform Android dan Desktop. Tujuan utama proyek ini adalah untuk mendemonstrasikan kemampuan pengembangan aplikasi modern dengan fokus pada UI/UX yang menarik, animasi, dan komponen reusable.

## ✨ Fitur Utama

- **Profil Interaktif**: Menampilkan foto profil, nama, NIM, dan bio singkat.
- **Toggle Kontak**: Tombol untuk menampilkan atau menyembunyikan informasi kontak dengan animasi halus.
- **Animasi Dinamis**: Menggunakan AnimatedVisibility untuk transisi yang mulus saat menampilkan kartu kontak.
- **Desain Responsif**: Layout yang menyesuaikan dengan ukuran layar, menggunakan Column dan Row untuk penyusunan vertikal dan horizontal.
- **Komponen Reusable**: Fungsi composable seperti ProfileHeader, ContactInfoCard, dan InfoItem yang dapat digunakan ulang.
- **Tema Warna Kustom**: Menggunakan palet warna pink lembut dan gelap untuk estetika yang konsisten.

## 📱 Tampilan Antarmuka (Screenshots)

### Android Application Screenshots

![Android Dashboard](build/assets/ss1.png)  
*Main Dashboard displaying profile information with a toggle button for contact details.*

![Android Data Input](build/assets/ss2.png)  
*Expanded view showing contact information card with email, phone, and location.*

### Desktop Application Screenshots

![Desktop Main Window](build/assets/ss3.png)  
*Overview of the main application window with profile header and interactive button.*

![Desktop Settings and Reports](build/assets/ss4.png)  
*Detailed contact information panel with icons and formatted text.*

## 💻 Persyaratan Sistem

### Android
- **OS**: Android 5.0 (API Level 21) atau lebih tinggi
- **RAM**: Minimal 2 GB
- **Storage**: 50 MB ruang kosong
- **Lainnya**: Dukungan untuk Compose UI

### Desktop
- **OS**: Windows 10 atau lebih tinggi, macOS 10.14+, Linux (distro modern)
- **RAM**: Minimal 4 GB
- **Storage**: 100 MB ruang kosong
- **Lainnya**: Java 11+ terinstal (untuk JVM target)

## 🚀 Instalasi & Menjalankan

### Android
1. Pastikan perangkat Android Anda terhubung ke komputer dengan USB debugging diaktifkan.
2. Buka terminal di root proyek dan jalankan `./gradlew assembleDebug` untuk membangun APK.
3. Transfer file APK dari `composeApp/build/outputs/apk/debug/` ke perangkat Android.
4. Instal APK dan buka aplikasi.

Atau, unduh langsung dari [Google Play Store](https://play.google.com/store) (jika tersedia).

### Desktop
1. Pastikan Java 11+ terinstal di sistem Anda.
2. Buka terminal di root proyek.
3. Jalankan `./gradlew run` untuk menjalankan aplikasi desktop secara langsung.
4. Aplikasi akan terbuka di jendela baru.

Untuk membangun executable:
- Jalankan `./gradlew packageDistributionForCurrentOS` untuk membuat paket instalasi (MSI untuk Windows, DMG untuk macOS, DEB untuk Linux).

## 📖 Cara Penggunaan

1. **Luncurkan Aplikasi**: Buka aplikasi di perangkat Android atau desktop.
2. **Lihat Profil**: Aplikasi akan menampilkan foto profil, nama, NIM, dan bio secara default.
3. **Akses Kontak**: Klik tombol "Lihat Kontak" untuk menampilkan informasi kontak dengan animasi.
4. **Sembunyikan Kontak**: Klik lagi tombol (yang berubah menjadi "Sembunyikan Kontak") untuk menyembunyikan informasi kontak.
5. **Navigasi**: Semua elemen responsif; gunakan scroll jika diperlukan pada layar kecil.

## 🛠️ Teknologi yang Digunakan

- **Bahasa Pemrograman**: Kotlin
- **Kerangka Kerja**: Kotlin Multiplatform, Jetpack Compose Multiplatform
- **Pustaka UI**: Compose Foundation, Compose Material 3, Compose Icons Extended
- **Build Tool**: Gradle (Kotlin DSL)
- **Platform Target**: Android (JVM 11), Desktop (JVM), JS (Browser), WASM (Experimental)
- **Alat Lain**: Android Studio, IntelliJ IDEA, Git

## 📄 Lisensi

Proyek ini menggunakan lisensi MIT. Lihat file [LICENSE](LICENSE) untuk detail lebih lanjut.

## ✍️ Penulis

- **Anisah Octa Rohila** - Pengembang Utama (NIM: 123140137)

## 📞 Kontak

Untuk pertanyaan, saran, atau kontribusi, hubungi:
- **Email**: anisah.123140137@student.itera.ac.id
- **LinkedIn**: [Anisah Octa Rohila](https://linkedin.com/in/anisah-octa-rohila) (jika tersedia)
- **GitHub**: [anisah-octa](https://github.com/anisah-octa) (jika tersedia)
