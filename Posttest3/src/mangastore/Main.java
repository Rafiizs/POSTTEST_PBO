package mangastore;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Manga> daftarManga = new ArrayList<>();

        int pilihan;

        do {

            System.out.println("=== SISTEM PEMBELIAN MANGA ===");
            System.out.println("1. Tambah Manga Fisik");
            System.out.println("2. Tambah Manga Digital");
            System.out.println("3. Tambah Manga Premium");
            System.out.println("4. Lihat Manga");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");

            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {

                System.out.print("Judul: ");
                String judul = input.nextLine();

                System.out.print("Harga: ");
                int harga = input.nextInt();
                input.nextLine();

                System.out.println("Jenis Cover (contoh: Softcover / Hardcover / Limited Cover / Collector Edition)");
                System.out.print("Masukkan Jenis Cover: ");
                String cover = input.nextLine();

                daftarManga.add(new MangaFisik(judul, harga, cover));
            }

            else if (pilihan == 2) {

                System.out.print("Judul: ");
                String judul = input.nextLine();

                System.out.print("Harga: ");
                int harga = input.nextInt();
                input.nextLine();

                System.out.println("Format File (contoh: PDF / EPUB / CBR / CBZ)");
                System.out.print("Masukkan Format File: ");
                String format = input.nextLine();

                daftarManga.add(new MangaDigital(judul, harga, format));
            }

            else if (pilihan == 3) {

                System.out.print("Judul: ");
                String judul = input.nextLine();

                System.out.print("Harga: ");
                int harga = input.nextInt();
                input.nextLine();

                System.out.println("Bonus (contoh: Poster / Bookmark / Artbook)");
                System.out.print("Masukkan Bonus: ");
                String bonus = input.nextLine();

                daftarManga.add(new MangaPremium(judul, harga, bonus));
            }

            else if (pilihan == 4) {

                for (Manga m : daftarManga) {
                    m.tampilInfo();
                    System.out.println("----------------");
                }

            }

        } while (pilihan != 5);

    }
}