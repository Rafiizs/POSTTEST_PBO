package mangastore;

public class MangaDigital extends Manga implements Diskonable {

    private String formatFile;

    public MangaDigital(String judul, int harga, int jumlah, boolean diskon, String formatFile) {
        super(judul, harga, jumlah, diskon);
        this.formatFile = formatFile;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Format File: " + formatFile);
    }

    @Override
    public void tampilInfoLengkap() {
        tampilInfo();
        tampilDiskon();
        System.out.println("Jumlah beli: " + getJumlah());
        System.out.println("Total harga: " + (getHarga() * getJumlah()));
    }

    @Override
    public void hitungDiskon() {
        if (isDiskon()) {
            int hargaDiskon = getHarga() - (getHarga() * 10 / 100);
            System.out.println("Harga setelah diskon: " + hargaDiskon);
        }
    }

    @Override
    public void tampilDiskon() {
        hitungDiskon();
    }
}