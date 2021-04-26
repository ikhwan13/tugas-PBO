package ruang3d;
import bidang2d.Lingkaran;

public class Kerucut extends Lingkaran{
    double tinggi, luas, volume;
    
    public Kerucut(double r, double tinggi){
        super(r);
        this.tinggi=tinggi;
        this.luas=hitungLuas();
        this.volume=hitungVolume();
    }

    public double apotema(){
        return Math.sqrt(Math.pow(this.r,2) + Math.pow(this.tinggi,2));
    }

    @Override
    public double hitungLuas(){
        return super.luas + (PHI*this.r*apotema());
    }

    public double hitungVolume(){
        return super.luas*this.tinggi/3;
    }
}