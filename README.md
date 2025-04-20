Final Project: Web UI Automation & API Automation

Dalam proyek akhir ini, peserta diminta untuk membangun automasi pengujian baik untuk Web UI maupun API berdasarkan requirement berikut:

Pengelolaan Repository menggunakan Git dan GitHub

Bahasa Pemrograman: Java

Manajemen Dependensi: Gradle

Library untuk API Testing: Rest Assured

Library untuk Web UI Testing: Selenium

Framework Penulisan Test: Cucumber dengan format Gherkin

CI/CD: GitHub Actions

Implementasi proyek dilakukan dengan struktur yang rapi dan modular. Test-case ditulis dalam format Gherkin menggunakan Cucumber, dengan pendekatan Page Object Model (POM) untuk menjaga keterbacaan dan pemeliharaan kode.

Untuk menjalankan pengujian, dibuat dua Gradle Task khusus yang diberi tag @api dan @web. Tag @api digunakan untuk menjalankan skenario pengujian API seperti:

Mengambil daftar pengguna

Menambahkan pengguna baru

Memperbarui data pengguna

Menghapus pengguna

Sementara itu, tag @web digunakan untuk menjalankan pengujian Web UI seperti:

Login dengan kredensial yang benar

Login dengan akun yang terkunci

Login dengan password yang salah

Menambahkan dan menghapus item dari keranjang belanja


