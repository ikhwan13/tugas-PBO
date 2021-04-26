package ruang3d;

public class KerucutTerpancung extends Kerucut {
    public double rAtas, tinggi, luas, volume; 
    
    public KerucutTerpancung(double r, double tinggi, double rAtas) {
        super(r,tinggi);
        this.luas=hitungLuas();
        this.volume=hitungVolume();
    }
    
    @Override
    public double apotema(){
        return Math.sqrt(Math.pow(r-rAtas,2) + Math.pow(tinggi,2));
    }
    
    @Override
    public double hitungLuas(){
        return PHI*(Math.pow(r,2)+r*apotema());
    }

    @Override
    public double hitungVolume(){
        return PHI * tinggi * (Math.pow(r,2)*Math.pow(rAtas,2) + r*rAtas ) / 3;
    }
}