package ruang3d;

public class CincinBola extends Bola {
    public double taliBusur, tinggi, luas, volume, rPuncak, rDasar;
    
    public CincinBola(double r, double taliBusur, double tinggi, double rPuncak, double rDasar){
        super(r);
        this.taliBusur = taliBusur;
        this.tinggi = tinggi;
        this.rPuncak = rPuncak;
        this.rDasar = rDasar;
        this.luas = hitungLuas();
        this.volume = hitungVolume();
    }

    @Override
    public double hitungLuas(){
        return PHI *(2 * r * tinggi + taliBusur * ( rPuncak + rDasar));
    }

    public double hitungVolume(){
        return PHI * tinggi * Math.pow(this.taliBusur,2) / 6;
    }
}