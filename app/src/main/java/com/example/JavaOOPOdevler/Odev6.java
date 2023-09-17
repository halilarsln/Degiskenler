package com.example.JavaOOPOdevler;

import java.util.Scanner;

public class Odev6 {

    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Ögrenci adını giriniz");
        String ogrenciAdi = tarayici.next();

        System.out.println("Ögrenci okul No giriniz");
        int okulNo = tarayici.nextInt();

        System.out.println("Ögrenci izin Miktari giriniz");
        int izinMiktari = tarayici.nextInt();

        System.out.println("Ögrenci tarih giriniz");
        String tarih = tarayici.next();

        System.out.println("Velinin adını soyadını giriniz");
        String veliAdi = tarayici.next();

        OdevlerSinifi o = new OdevlerSinifi();

        o.dilekceOlustur(ogrenciAdi,okulNo,izinMiktari,tarih,veliAdi);
    }
}
