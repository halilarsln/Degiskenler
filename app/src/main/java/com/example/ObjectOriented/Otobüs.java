package com.example.ObjectOriented;

public class Otobüs {

    //Özellikler
    int kapasite;
    int mevcutYolcu;
    String nereden;
    String nereye;

    public void bilgiAl(){
        System.out.println("Kapasite     : "+kapasite);
        System.out.println("Mevcut Yolcu : "+mevcutYolcu);
        System.out.println("Nereden      : "+nereden);
        System.out.println("Nereye       : "+nereye);
    }
    public void yolcuAl(int yolcuMiktari){
        mevcutYolcu += yolcuMiktari ;

        if (mevcutYolcu > kapasite){
            System.out.println("Otobüs dolu :( ");
        }else{
            System.out.println("Yolcu Sayisi : "+mevcutYolcu);
        }

    }
    public void yolcuIndir(int yolcuMiktari){
        mevcutYolcu -= yolcuMiktari ;

        if (mevcutYolcu == 0 ){
            System.out.println("Otobüs boş ");
        }else{
            System.out.println("Yolcu Sayisi : "+mevcutYolcu);
        }
    }
}
