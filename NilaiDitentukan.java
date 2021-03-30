package com.company;

public class NilaiDitentukan
{
    public static void main(String[] args)
    {
        Tabung objek = new Tabung();
        double r = objek.radius = 5;
        double t = objek.tinggi = 10;

        System.out.println("\n //Nilai Radius 5 dan Tinggi 10//");
        System.out.println("\n\nNilai radius : "+ r);
        System.out.println("Nilai Tinggi : "+ t );
        System.out.println("\nNilai Luas Alas Tabung: "+ objek.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ objek.getVolume());

        Tabung objek2 = new Tabung();
        double r2 = objek2.radius = 7.5;
        double t2 = objek2.tinggi = 15.5;

        System.out.println("\n\n //Nilai Radius 7.5 dan Tinggi 15.5//");
        System.out.println("\nNilai radius : "+ r2 );
        System.out.println("Nilai Tinggi : "+ t2 );
        System.out.println("Nilai Luas Alas Tabung: "+ objek2.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ objek2.getVolume());
    }
}
