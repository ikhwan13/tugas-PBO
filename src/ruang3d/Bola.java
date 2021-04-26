package ruang3d;
import bidang2d.Lingkaran;

public class Bola extends Lingkaran {
    public double luas, volume;

    public Bola(double r) {
        super(r);
        this.luas = hitungLuas();
        this.volume = hitungVolume();
    }

    @Override
    public double hitungLuas() {
        return 4 * super.hitungLuas();
    }

    public double hitungVolume() {
        return (4 * super.hitungLuas() * r) / 3;
    }
}