package bidang2d;

public class Lingkaran implements Bidang2D {
    public double r, keliling, luas;

    public Lingkaran(double r){
        this.r = r;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    @Override
    public double hitungKeliling() {
        return r * 2 * PHI;
    }

    @Override
    public double hitungLuas() {
        return Math.pow(r,2)*PHI;
    }
}