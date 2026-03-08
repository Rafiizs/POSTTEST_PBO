# Sistem Pembelian Manga (Java)
Nama: (Muhammad Rafii Zaidan Sakaria)
NIM: (2409106095)
Kelas: (C1'24)

## Deskripsi Program
Program ini merupakan aplikasi sederhana berbasis Java yang digunakan untuk melakukan pembelian manga.

Program dibuat menggunakan konsep **Object Oriented Programming (OOP)** seperti:
- Class
- Object
- Method
- ArrayList

Program memiliki dua role pengguna:
1. **Admin**
2. **Pembeli**

---

# Struktur Program

Program terdiri dari dua class utama:

## 1. Class Manga
Class ini digunakan untuk menyimpan data manga seperti:
- ID
- Judul Manga
- Author
- Harga

Class ini juga memiliki method untuk menampilkan informasi manga.

## 2. Class Main
Class ini berfungsi sebagai program utama yang menjalankan sistem pembelian manga.

Class ini berisi:
- Menu utama
- Menu Admin
- Menu Pembeli

---

# Fitur Program

## Menu Utama

User dapat memilih:

1. Admin
2. Pembeli
3. Keluar

![Menu Utama](assets/menu.png)

---

# Menu Admin

Admin memiliki dua fitur utama:

## 1. Tambah Manga

Admin dapat menambahkan manga baru dengan menginput:

- Judul Manga
- Author
- Harga

Manga yang ditambahkan akan disimpan ke dalam **ArrayList**.

![Tambah Manga](assets/tambah-manga.png)

---

## 2. Lihat Manga

Admin dapat melihat semua manga yang sudah ditambahkan.

Informasi yang ditampilkan:

- ID Manga
- Judul
- Author
- Harga

![Lihat Manga](assets/lihat-manga.png)

---

# Menu Pembeli

Pembeli memiliki dua fitur:

## 1. Lihat Manga

Pembeli dapat melihat daftar manga yang tersedia.

![Lihat Manga Pembeli](assets/lihat-manga-pembeli.png)

---

## 2. Beli Manga

Pembeli dapat membeli manga dengan memasukkan **ID Manga**.

Program akan menampilkan manga yang dibeli jika ID ditemukan.

Jika ID tidak ada maka program akan menampilkan pesan:

"Manga tidak ditemukan"

![Beli Manga](assets/beli-manga.png)

---

# Contoh Data Manga

| ID | Judul | Author | Harga |
|----|------|------|------|
| 1 | Naruto | Masashi Kishimoto | 45000 |
| 2 | One Piece | Eiichiro Oda | 50000 |
| 3 | Attack on Titan | Hajime Isayama | 55000 |

---

# Cara Menjalankan Program

1. Buka project di **IntelliJ IDEA**
2. Jalankan file `Main.java`
3. Pilih menu Admin atau Pembeli
4. Ikuti instruksi yang muncul pada terminal

---

# Screenshot Program

Semua screenshot program disimpan di folder **assets**.