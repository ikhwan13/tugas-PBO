package bangun;

import java.util.Scanner;

import bidang2d.*;
import ruang3d.*;


public class Bangun {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        public double r, tinggi, rAtas, rDasar;
        int pilih;

        System.out.println("Tugas Geometri");
        System.out.println("1. Bidang 2D");
        System.out.println("2. Bidang 3D");
        System.out.print("Pilih : " );
        pilih = input.nextInt();

        switch (pilih){
            case 1 :
                {
                    System.out.println("Menu Bidang 2D");
                    System.out.println("---Lingkaran---");
                    System.out.print("Masukkan Jari-jari : ");
                    r = input.nextDouble();

                    Lingkaran lingkaran = new Lingkaran(r);

                    System.out.println("Keliling Lingkaran = " + lingkaran.keliling);
                    System.out.println("Luas Lingkaran = " + lingkaran.luas);
                }
                break;

            case 2 :
                {
                    System.out.println("Menu Bidang 3D");
                    System.out.println("1. Tabung");
                    System.out.println("2. Kerucut");
                    System.out.println("3. Bola");
                    System.out.print("Pilih : ");
                    pilih = input.nextInt();

                    switch (pilih){
                        case 1 :
                            {
                                System.out.println("---Tabung---");
                                System.out.print("Masukkan Jari-jari : ");
                                r = input.nextDouble();
                                System.out.print("Masukkan Tinggi : ");
                                tinggi = input.nextDouble();

                                Tabung tabung = new Tabung(r,tinggi);

                                System.out.println("Luas Tabung = " + tabung.luas);
                                System.out.println("Volume Tabung = " + tabung.volume);

                            } break;

                        case 2 :
                            {
                                System.out.println("---Kerucut---");
                                System.out.print("Masukkan Jari-jari : ");
                                r = input.nextDouble();
                                System.out.print("Masukkan Tinggi : ");
                                tinggi = input.nextDouble();
                                

                                Kerucut kerucut = new Kerucut(r,tinggi);

                                System.out.println("Luas Kerucut = " + kerucut.luas);
                                System.out.println("Volume Kerucut = " + kerucut.volume);
                                
                                System.out.println("--Kerucut Terpancung--");
                                
                                System.out.print("Masukkan Jari-jari atas : ");
                                rAtas = input.nextDouble();

                                KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(r,tinggi,rAtas);

                                System.out.println("Luas Kerucut Terpancung = " + kerucutTerpancung.hitungLuas());
                                System.out.println("Volume Kerucut Terpancung = " + kerucutTerpancung.hitungVolume());

                            } break;
                        case 3 :
                            {
                                System.out.println("---Bola---");
                                System.out.print("Masukkan Jari-jari : ");
                                r = input.nextDouble();

                                Bola bola = new Bola(r);

                                System.out.println("Luas Kerucut = " + bola.hitungLuas());
                                System.out.println("Volume Kerucut = " + bola.hitungVolume());

                                System.out.println("Telusuri :");
                                System.out.println("1. Juring Bola");
                                System.out.println("2. Tembereng Bola");
                                System.out.println("3. Keratan Bola");
                                System.out.println("4. Cincin Bola");
                                System.out.print("Pilih : ");
                                pilih = input.nextInt();

                                switch (pilih){
                                    case 1 :
                                    {
                                        System.out.println("--1. Juring Bola--");

                                        JuringBola juringBola = new JuringBola(r,tinggi,rDasar);

                                        System.out.println("Luas = " + juringBola.hitungLuas());
                                        System.out.println("Volume = " + juringBola.hitungVolume());
                                    }break;
                                    case 2 :
                                    {
                                        System.out.println("--2. Tembereng Bola--");

                                        TemberengBola temberengBola = new TemberengBola(r,tinggi,rAtas,rDasar);

                                        System.out.println("Luas = " + temberengBola.hitungLuas());
                                        System.out.println("Volume = " + temberengBola.hitungVolume());
                                    }break;
                                    case 3 :
                                    {
                                        System.out.println("--3. Keratan Bola--");

                                        KeratanBola keratanBola = new KeratanBola(r);

                                        System.out.println("Luas = " + keratanBola.hitungLuas());
                                        System.out.println("Volume = " + keratanBola.hitungVolume());
                                    }break;
                                    case 4 :
                                    {
                                        System.out.println("--4. Cincin Bola--");

                                        CincinBola cincinBola = new CincinBola(r);

                                        System.out.println("Luas = " + cincinBola.hitungLuas());
                                        System.out.println("Volume = " + cincinBola.hitungVolume());
                                    }break;
                                    default:
                                        throw new IllegalStateException("Unexpected value: " + pilih);
                                }

                            } break;

                        default:
                            throw new IllegalStateException("Unexpected value: " + pilih);
                    }
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + pilih);
        }
    }
}
