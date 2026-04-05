package mangastore;

public class MangaPremium extends Manga {

    private String bonus;

    public MangaPremium(String judul, int harga, String bonus) {
        super(judul, harga);
        this.bonus = bonus;
    }

    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Bonus: " + bonus);
    }
}