package ruang3d;

public class KeratanBola extends Bola{
    public double rDasar, rAtas, tinggi, luas, volume;
    
    public KeratanBola(double r, double rDasar, double rAtas, double tinggi) {
        super(r);
        this.rDasar=rDasar;
        this.rAtas=rAtas;
        this.tinggi=tinggi;
        this.luas=hitungLuas();
        this.volume=hitungVolume();
    }

    public double hitungLuas(){
        return PHI * (2 * r * tinggi + Math.pow(rDasar,2) +  2 * Math.pow(rAtas,2));
    }

    public double hitungVolume(){
        return (PHI * Math.pow(rDasar,2) + Math.pow(rAtas,2) + PHI * Math.pow(tinggi,3)/3)/2;
    }
}