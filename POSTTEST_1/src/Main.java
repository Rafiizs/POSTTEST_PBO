import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Manga> daftarManga = new ArrayList<>();
    static int idCounter = 1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== SISTEM PEMBELIAN MANGA ===");
            System.out.println("1. Admin");
            System.out.println("2. Pembeli");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    menuAdmin();
                    break;

                case 2:
                    menuPembeli();
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak ada.");
            }

        } while (pilihan != 3);
    }

    static void menuAdmin() {

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU ADMIN ===");
            System.out.println("1. Tambah Manga");
            System.out.println("2. Lihat Manga");
            System.out.println("3. Kembali");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print("Judul Manga: ");
                    String judul = input.nextLine();

                    System.out.print("Author: ");
                    String author = input.nextLine();

                    System.out.print("Harga: ");
                    int harga = input.nextInt();

                    Manga mangaBaru = new Manga(idCounter++, judul, author, harga);
                    daftarManga.add(mangaBaru);

                    System.out.println("Manga berhasil ditambahkan.");
                    break;

                case 2:

                    if (daftarManga.isEmpty()) {
                        System.out.println("Belum ada manga.");
                    } else {
                        for (Manga m : daftarManga) {
                            m.tampilManga();
                        }
                    }
                    break;
            }

        } while (pilihan != 3);
    }

    static void menuPembeli() {

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU PEMBELI ===");
            System.out.println("1. Lihat Manga");
            System.out.println("2. Beli Manga");
            System.out.println("3. Kembali");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:

                    if (daftarManga.isEmpty()) {
                        System.out.println("Belum ada manga.");
                    } else {
                        for (Manga m : daftarManga) {
                            m.tampilManga();
                        }
                    }
                    break;

                case 2:

                    System.out.print("Masukkan ID Manga yang ingin dibeli: ");
                    int idBeli = input.nextInt();

                    boolean ditemukan = false;

                    for (Manga m : daftarManga) {

                        if (m.id == idBeli) {
                            System.out.println("Anda membeli manga: " + m.judul);
                            ditemukan = true;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Manga tidak ditemukan.");
                    }

                    break;
            }

        } while (pilihan != 3);
    }
}