package mangastore;

public class Manga {

    private static int counter = 1;

    private int id;
    private String judul;
    private int harga;

    public Manga(String judul, int harga) {
        this.id = counter++;
        this.judul = judul;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public int getHarga() {
        return harga;
    }

    public void tampilInfo() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Harga: " + harga);
    }
}