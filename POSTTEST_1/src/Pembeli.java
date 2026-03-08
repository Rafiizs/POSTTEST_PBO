class Pembeli {

    int idPembeli;
    String nama;

    Pembeli(int idPembeli, String nama) {
        this.idPembeli = idPembeli;
        this.nama = nama;
    }

    void tampilPembeli() {
        System.out.println("ID Pembeli : " + idPembeli);
        System.out.println("Nama : " + nama);
    }
}
