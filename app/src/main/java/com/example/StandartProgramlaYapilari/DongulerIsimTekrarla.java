package com.example.StandartProgramlaYapilari;

import java.util.Scanner;

public class DongulerIsimTekrarla {

    public static void main(String args[]){

        //5 ------- 0 - 4->0,1,2,3,4

        Scanner tarayici = new Scanner(System.in);

        System.out.println("İsminizi giriniz");
        String isim = tarayici.nextLine();

        System.out.println("Tekrarlama miktarini giriniz");
        int sayi = tarayici.nextInt();

        //6 kere dön

        //0,1,2,3,4,5,


        for (int i = 0;i <sayi ; i++){
            System.out.println(isim+"--"+(i+1));
        }



    }
}
