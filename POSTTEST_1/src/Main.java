import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Manga> mangaList = new ArrayList<>();

        int pilihan;

        do {

            System.out.println("\n=== SISTEM PEMBELIAN MANGA ===");
            System.out.println("1. Tambah Manga");
            System.out.println("2. Lihat Manga");
            System.out.println("3. Update Manga");
            System.out.println("4. Hapus Manga");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
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
                    input.nextLine();

                    Manga mangaBaru = new Manga(judul, author, harga);
                    mangaList.add(mangaBaru);

                    System.out.println("Manga berhasil ditambahkan!");
                    break;

                case 2:

                    if (mangaList.isEmpty()) {
                        System.out.println("Data manga kosong!");
                    } else {

                        for (int i = 0; i < mangaList.size(); i++) {

                            System.out.println("\nID Manga: " + i);
                            System.out.println("Judul  : " + mangaList.get(i).judul);
                            System.out.println("Author : " + mangaList.get(i).author);
                            System.out.println("Harga  : " + mangaList.get(i).harga);
                        }

                    }

                    break;

                case 3:

                    System.out.print("Masukkan ID manga yang ingin diupdate: ");
                    int idUpdate = input.nextInt();
                    input.nextLine();

                    if (idUpdate >= 0 && idUpdate < mangaList.size()) {

                        System.out.print("Judul baru: ");
                        mangaList.get(idUpdate).judul = input.nextLine();

                        System.out.print("Author baru: ");
                        mangaList.get(idUpdate).author = input.nextLine();

                        System.out.print("Harga baru: ");
                        mangaList.get(idUpdate).harga = input.nextInt();
                        input.nextLine();

                        System.out.println("Data berhasil diupdate!");

                    } else {
                        System.out.println("ID tidak ditemukan!");
                    }

                    break;

                case 4:

                    System.out.print("Masukkan ID manga yang ingin dihapus: ");
                    int idHapus = input.nextInt();

                    if (idHapus >= 0 && idHapus < mangaList.size()) {

                        mangaList.remove(idHapus);
                        System.out.println("Manga berhasil dihapus!");

                    } else {
                        System.out.println("ID tidak ditemukan!");
                    }

                    break;

                case 5:
                    System.out.println("Program selesai!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");

            }

        } while (pilihan != 5);

    }
}