package ruang3d;

public class JuringBola extends Bola {
    public double rDasar, tinggi, luas, volume;
    
    public JuringBola(double r, double tinggi, double rDasar) {
        super(r);
        this.rDasar=rDasar;
        this.tinggi=tinggi;
        this.luas=hitungLuas();
        this.volume=hitungVolume();
    }

    public double hitungLuas(){
        return PHI * (2 * r * tinggi +rDasar * r);
    }

    public double hitungVolume(){
        return (2/3.0) * PHI * Math.pow(r,2) * tinggi;
    }
}