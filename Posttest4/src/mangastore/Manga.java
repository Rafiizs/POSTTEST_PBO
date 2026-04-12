package mangastore;

public class Manga {

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

    public void tampilInfo(boolean diskon) {
        int hargaDiskon = harga - (harga * 10 / 100);
        tampilInfo();
        System.out.println("Harga setelah diskon: " + hargaDiskon);
    }

    public void tampilInfo(int jumlah) {
        tampilInfo();
        System.out.println("Jumlah beli: " + jumlah);
        System.out.println("Total harga: " + (harga * jumlah));
    }

    public void tampilInfoLengkap() {
        tampilInfo();

        if (diskon) {
            int hargaDiskon = harga - (harga * 10 / 100);
            System.out.println("Harga setelah diskon: " + hargaDiskon);
        }

        System.out.println("Jumlah beli: " + jumlah);
        System.out.println("Total harga: " + (harga * jumlah));
    }
}