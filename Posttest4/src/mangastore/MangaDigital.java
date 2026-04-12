package mangastore;

public class MangaDigital extends Manga {

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
}