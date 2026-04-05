package mangastore;

public class MangaFisik extends Manga {

    private String jenisCover;

    public MangaFisik(String judul, int harga, String jenisCover) {
        super(judul, harga);
        this.jenisCover = jenisCover;
    }

    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jenis Cover: " + jenisCover);
    }
}