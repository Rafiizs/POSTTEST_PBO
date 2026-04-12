package mangastore;

public class MangaFisik extends Manga {

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
}