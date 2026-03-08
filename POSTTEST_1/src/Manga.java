public class Manga {

    int id;
    String judul;
    String author;
    int harga;

    public Manga(int id, String judul, String author, int harga) {
        this.id = id;
        this.judul = judul;
        this.author = author;
        this.harga = harga;
    }

    public void tampilManga() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Author: " + author);
        System.out.println("Harga: " + harga);
        System.out.println("----------------------");
    }
}