package com.example.ObjectOriented;

public class ConstructorMain {

    public static void main(String args[]){

        Ogrenciler ogrenci = new Ogrenciler();

        ogrenci.adres = "Antalya" ;
        ogrenci.isim = "Ayşe Sare" ;
        ogrenci.okulNo = 1410 ;

        System.out.println(ogrenci.isim);

        Ogrenciler ogrenci2 = new Ogrenciler("Ahmet",5678,"Bursa");

        System.out.println(ogrenci2.adres);

    }
}
