package com.example.JavaOOPOdevler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Odev2 {
    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Dikdörtgenin uzun kenarını giriniz");
        int uzunKenar = tarayici.nextInt();

        System.out.println("Dikdörtgenin kısa kenarını giriniz");
        int kisakenar = tarayici.nextInt();

        OdevlerSinifi o = new OdevlerSinifi();

        int gelenSonuc = o.cevreHesapla(kisakenar,uzunKenar);

        System.out.println("Sonuc : "+gelenSonuc);

    }
}
