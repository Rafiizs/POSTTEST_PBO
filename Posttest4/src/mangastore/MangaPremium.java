package mangastore;

public class MangaPremium extends Manga {

    private String bonus;

    public MangaPremium(String judul, int harga, int jumlah, boolean diskon, String bonus) {
        super(judul, harga, jumlah, diskon);
        this.bonus = bonus;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Bonus: " + bonus);
    }
}