package ruang3d;

public class TemberengBola extends Bola {
    public double rDasar, rAtas, tinggi, luas, volume;
    
    public TemberengBola(double r, double tinggi, double rAtas, double rDasar) {
        super(r);
        this.tinggi=tinggi;
        this.rAtas=rAtas;
        this.rDasar=rDasar;
        this.luas=hitungLuas();
        this.volume=hitungVolume();
    }

    @Override
    public double hitungLuas(){
        return PHI * (2 * r * tinggi + Math.pow(rDasar,2));
    }

    @Override
    public double hitungVolume(){
        return PHI * tinggi * (3 * Math.pow(rDasar,2) + 3 * Math.pow(rAtas,2) + Math.pow(tinggi,2));
    }
}