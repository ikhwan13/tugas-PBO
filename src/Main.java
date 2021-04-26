
import java.util.Scanner;

import bidang2d.*;
import ruang3d.*;


public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double r, tinggi=0, rAtas=0, rDasar=0,taliBusur=0;
        int pilih;

        do{
            System.out.println("Tugas Geometri");
            System.out.println("1. Bidang 2D");
            System.out.println("2. Bidang 3D");
            System.out.println("0. Exit");
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
                            System.out.print("Masukkan Tinggi Baru: ");
                            tinggi = input.nextDouble();
                            System.out.print("Masukkan Jari-jari atas : ");
                            rAtas = input.nextDouble();

                            KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(r,tinggi,rAtas);

                            System.out.println("Luas Kerucut Terpancung = " + kerucutTerpancung.luas);
                            System.out.println("Volume Kerucut Terpancung = " + kerucutTerpancung.volume);

                        } break;
                        case 3 :
                        {
                            System.out.println("---Bola---");
                            System.out.print("Masukkan Jari-jari : ");
                            r = input.nextDouble();

                            Bola bola = new Bola(r);

                            System.out.println("Luas Bola = " + bola.luas);
                            System.out.println("Volume Bola = " + bola.volume);

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

                                    System.out.print("Masukkan Tinggi Juring : ");
                                    tinggi = input.nextDouble();
                                    System.out.print("Masukkan Jari-jari Dasar Juring : ");
                                    rDasar = input.nextDouble();

                                    JuringBola juringBola = new JuringBola(r,tinggi,rDasar);

                                    System.out.println("Luas = " + juringBola.luas);
                                    System.out.println("Volume = " + juringBola.volume);
                                }break;
                                case 2 :
                                {
                                    System.out.println("--2. Tembereng Bola--");

                                    System.out.print("Masukkan Tinggi Tembereng : ");
                                    tinggi = input.nextDouble();
                                    System.out.print("Masukkan Jari-jari Atas Tembereng : ");
                                    rAtas = input.nextDouble();
                                    System.out.print("Masukkan Jari-jari Dasar Tembereng : ");
                                    rDasar = input.nextDouble();

                                    TemberengBola temberengBola = new TemberengBola(r,tinggi,rAtas,rDasar);

                                    System.out.println("Luas = " + temberengBola.luas);
                                    System.out.println("Volume = " + temberengBola.volume);
                                }break;
                                case 3 :
                                {
                                    System.out.println("--3. Keratan Bola--");

                                    System.out.print("Masukkan Tinggi Keratan : ");
                                    tinggi = input.nextDouble();
                                    System.out.print("Masukkan Jari-jari Atas Keratan : ");
                                    rAtas = input.nextDouble();
                                    System.out.print("Masukkan Jari-jari Dasar Keratan : ");
                                    rDasar = input.nextDouble();

                                    KeratanBola keratanBola = new KeratanBola(r,rDasar,rAtas,tinggi);

                                    System.out.println("Luas = " + keratanBola.luas);
                                    System.out.println("Volume = " + keratanBola.volume);
                                }break;
                                case 4 :
                                {
                                    System.out.println("--4. Cincin Bola--");

                                    System.out.print("Masukkan Tinggi Cincin : ");
                                    tinggi = input.nextDouble();
                                    System.out.print("Masukkan Panjang Tali Busur : ");
                                    taliBusur = input.nextDouble();
                                    System.out.print("Masukkan Jari-jari Atas Cincin : ");
                                    rAtas = input.nextDouble();
                                    System.out.print("Masukkan Jari-jari Dasar Cincin : ");
                                    rDasar = input.nextDouble();

                                    CincinBola cincinBola = new CincinBola(r,taliBusur,tinggi,rAtas,rDasar);

                                    System.out.println("Luas = " + cincinBola.luas);
                                    System.out.println("Volume = " + cincinBola.volume);
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
        }while(pilih!=0);
    }
}