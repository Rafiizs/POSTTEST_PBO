package mangastore;

public class MangaFisik extends Manga implements Diskonable {

    private String jenisCover;

    public MangaFisik(String judul, int harga, int jumlah, boolean diskon, String jenisCover) {
        super(judul, harga, jumlah, diskon);
        this.jenisCover = jenisCover;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jenis Cover: " + jenisCover);
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