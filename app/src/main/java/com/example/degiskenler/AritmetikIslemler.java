package com.example.degiskenler;

public class AritmetikIslemler {

    public static void main(String args[]){

        //pixr2

        double daireAlani ;

        double pi = 3.14;

        int yariCap = 2 ;

        daireAlani = pi * yariCap * yariCap ;

        System.out.println("Daire Alanı : "+daireAlani);

        int kuvvet ;
        int kutle = 85 ;
        int ivme = 10 ;

        kuvvet = kutle * ivme ;

        System.out.println("Kuvvet : "+kuvvet) ;

        int x1 ;
        int x2 ;

        int v = 30 ;
        int v0 = 40 ;
        int t = 5 ;
        int a = 2 ;

        x1 =((v+v0)/2)*t ;

        System.out.println("X1 : "+x1);

        x2 =(v0 * t)+ (a*t*t)/2;

        System.out.println("X2 : "+x2);

        int toplam = 80 ;

        toplam += 20 ;

        System.out.println("Toplam : "+toplam);

        int carpma = 30 ;
        carpma *= 50 ;

        System.out.println("SONUÇ : "+carpma);

        int sayi1 = 4 ; // sayi = 4

        int sayi2 = ++sayi1 ; //sayi1 = 5, sayi2 = 5

        int sayi3 = ++sayi2; // sayi1 = 6,sayi3 = 6

        System.out.println("Sayi1 : "+sayi1);
        System.out.println("Sayi2 : "+sayi2);
        System.out.println("Sayi3 : "+sayi3);

        int k = 10 ; //k = 10;

        int l = k++ ;//l = 10 ,k = 11

        int z = k++ ;//z = 11 ,k = 12

        System.out.println("k : "+k);
        System.out.println("l : "+l);
        System.out.println("z : "+z);


















    }
}
