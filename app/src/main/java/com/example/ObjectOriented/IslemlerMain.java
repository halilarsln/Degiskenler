package com.example.ObjectOriented;

public class IslemlerMain {

    public static void main(String args[]){

        Islemler i = new Islemler();

        double sonuc = i.ortalamaHesapla(4.56,3.70,60,98.5,7);

        System.out.println(sonuc);
    }
}
