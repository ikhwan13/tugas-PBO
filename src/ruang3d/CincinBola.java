package ruang3d;

public class CincinBola extends Bola {
    public double taliBusur, tinggi, luas, volume, rAtas, rDasar;
    
    public CincinBola(double r, double taliBusur, double tinggi, double rAtas, double rDasar){
        super(r);
        this.taliBusur = taliBusur;
        this.tinggi = tinggi;
        this.rAtas = rAtas;
        this.rDasar = rDasar;
        this.luas = hitungLuas();
        this.volume = hitungVolume();
    }

    @Override
    public double hitungLuas(){
        return PHI *(2.0 * r * tinggi + taliBusur * ( rAtas + rDasar));
    }

    @Override
    public double hitungVolume(){
        return (PHI * tinggi * Math.pow(this.taliBusur,2)) / 6.0;
    }
}