package com.example.JavaOOPOdevler;

import java.util.Scanner;

public class Odev8 {

    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Aylık gb harcamanızı giriniz");
        int gb = tarayici.nextInt();

        new OdevlerSinifi().internetUcretiHesapla(gb);
    }
}
