package Week2.Asssigment;

public class TestBarang {
    public static void main(String[] args) {
             Barang barang1 = new Barang();
             barang1.kode = "BRG001";
             barang1.namaBarang = "Laptop";
             barang1.hargaDasar = 10000000;  // 10,000,000 Rupiah
             barang1.diskon = 0.15f;  // 15% discount

             barang1.tampilData();   
    }
}
