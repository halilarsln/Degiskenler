package com.example.StandartProgramlaYapilari;

import java.util.Scanner;

public class WhileVeriIsle {
    public static void main(String args[]){


        Scanner tarayici = new Scanner(System.in);

        System.out.println("İşlenecek veri miktarını giriniz");
        int sayi = tarayici.nextInt();

        //5 5 4 3 2 1

        while (sayi > 0){
            System.out.println("İşlenen veri : "+sayi);
            sayi--;
        }
    }



}
