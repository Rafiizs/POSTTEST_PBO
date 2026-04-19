package mangastore;

public abstract class Manga {

    private static int counter = 1;

    private int id;
    private String judul;
    private int harga;
    private int jumlah;
    private boolean diskon;

    public Manga(String judul, int harga, int jumlah, boolean diskon) {
        this.id = counter++;
        this.judul = judul;
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
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

    public int getJumlah() {
        return jumlah;
    }

    public boolean isDiskon() {
        return diskon;
    }

    public void tampilInfo() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Harga: " + harga);
    }

    public abstract void tampilInfoLengkap();
}