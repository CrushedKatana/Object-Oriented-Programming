package Week5.Assigment;

public class Percobaan5 {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(2);

        Dosen dosen1 = new Dosen("12345", "Dr. Ahmad", "Jakarta");
        dosen1.setSKS(12);

        daftarGaji.addPegawai(dosen1);

        Dosen dosen2 = new Dosen("67890", "Dr. Budi", "Bandung");
        dosen2.setSKS(8);

        daftarGaji.addPegawai(dosen2);

        daftarGaji.printSemuaGaji();
    }
}
