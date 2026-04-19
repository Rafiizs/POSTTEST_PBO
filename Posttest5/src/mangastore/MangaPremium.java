package mangastore;

public class MangaPremium extends Manga implements Diskonable {

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