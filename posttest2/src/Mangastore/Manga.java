package Mangastore;

public class Manga {

    private int id;
    private String judul;
    private String author;
    private int harga;

    public Manga(int id, String judul, String author, int harga) {
        this.id = id;
        this.judul = judul;
        this.author = author;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getAuthor() {
        return author;
    }

    public int getHarga() {
        return harga;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setHarga(int harga) {
        if (harga > 0) {
            this.harga = harga;
        }
    }

    public void tampilManga() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Author: " + author);
        System.out.println("Harga: " + harga);
        System.out.println("----------------------");
    }
}