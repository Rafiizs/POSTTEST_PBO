package mangastore;

public class MangaDigital extends Manga {

    private String formatFile;

    public MangaDigital(String judul, int harga, String formatFile) {
        super(judul, harga);
        this.formatFile = formatFile;
    }

    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Format File: " + formatFile);
    }
}