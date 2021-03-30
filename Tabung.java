package com.company;

public class Tabung
{
    double radius = 1;
    double tinggi = 1;

    public double getVolume()
    {
        return Math.PI * radius * radius * tinggi;
    }

    public double getLuasAlas()
    {
        return Math.PI * radius * radius;
    }
    public double getRadius(double R)
    {
        return radius = R;
    }

    public double getTinggi(double T)
    {
        return tinggi = T;
    }
}
