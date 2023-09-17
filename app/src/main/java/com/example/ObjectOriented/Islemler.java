package com.example.ObjectOriented;

public class Islemler {

    public double ortalamaHesapla(double... sayilar){//dizi görevi

        double toplam = 0;

        for (Double d:sayilar){
            toplam = toplam + d ;
        }

        return toplam / sayilar.length ;



    }

}
