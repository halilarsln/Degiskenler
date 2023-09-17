package com.example.JavaOOPOdevler;

import java.util.Scanner;

public class Odev3 {
    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Faktoriyel hesabı için sayı giriniz");
        int sayi = tarayici.nextInt();

        OdevlerSinifi o = new OdevlerSinifi();

        int faktorıyel = o.faktoriyel(sayi);

        System.out.println("Faktoriyel sonuç :"+faktorıyel);


    }
}
