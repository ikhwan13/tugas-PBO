package ruang3d;
import bidang2d.Lingkaran;

public class Tabung extends Lingkaran{
    public double tinggi, luas, volume;

    public Tabung(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
        this.luas=hitungLuas();
        this.volume=hitungVolume();
    }

    @Override
    public double hitungLuas() {
        return super.keliling * (r + tinggi);
    }

    public double hitungVolume() {
        return super.hitungLuas()*tinggi;
    }

}