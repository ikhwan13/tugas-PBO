package ruang3d;

public class JuringBola extends Bola {
    public double rDasar, tinggi, luas, volume;
    JuringBola(double r, double tinggi, double rDasar) {
        super(r);
        this.rDasar=rDasar;
        this.tinggi=tinggi;
        this.luas=hitungLuas();
        this.volume=hitungVolume();
    }

    public double hitungLuas(){
        return 2 * PHI * r * tinggi + PHI * rDasar * r;
    }

    public double hitungVolume(){
        return 2/3 * PHI * Math.pow(r,2) * tinggi;
    }
}