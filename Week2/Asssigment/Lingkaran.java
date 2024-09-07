package Week2.Asssigment;

public class Lingkaran {
    double phi = 3.14;
    double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double hitungLuas() {
        return phi * r * r;
    }
    
    public double hitungKeliling() {
        return 2 * phi * r;
    }

}
