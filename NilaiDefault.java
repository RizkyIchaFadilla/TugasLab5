package com.company;
import java.util.Scanner;

public class NilaiDefault
{
    public static void main(String[] args)
    {
        Scanner baca = new Scanner (System.in);
        Tabung icha = new Tabung();

        //Contructor Nilai default
        System.out.println(" \n**Contructor Nilai default**");
        System.out.println("\n\nNilai Radius : "+ icha.radius);
        System.out.println("Nilai Tinggi : "+ icha.tinggi);
        System.out.println("Nilai Luas Alas Tabung: "+ icha.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ icha.getVolume());


        //Countructor Nilai bebas
        System.out.println("\n\n **Contructor Input Nilai Bebas**");
        System.out.print("\nMasukkan Nilai Radius : ");
        double rad = baca.nextDouble();
        System.out.print("Masukkan Nilai Tinggi : ");
        double ting = baca.nextDouble();

        Tabung tes2 = new Tabung();
        tes2.radius = rad;
        tes2.tinggi = ting;

        System.out.println("Nilai Radius  : "+ rad);
        System.out.println("Nilai Tinggi  : "+ ting);
        System.out.println("Nilai Luas Alas Tabung: "+ tes2.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ tes2.getVolume());

    }
}
