package com.example.StandartProgramlaYapilari;

import java.util.Scanner;

public class TekCiftSonsuzDongu {
    public static void main(String args[]){
        Scanner tarayici = new Scanner(System.in);

        while (true){
            System.out.println("Bir sayıyı giriniz");
            int sayi = tarayici.nextInt();

            // + - / *

            int sonuc = sayi % 2 ;

            switch (sonuc){
                case 0 :
                    System.out.println("Sayı çifttir");
                    break;
                case 1 :
                    System.out.println("Sayı tektir");
                    break;

            }





            System.out.println("Çıkış için (1) Devamı için diğer sayilar");
            int secim = tarayici.nextInt();

            if (secim==1){
                System.out.println("Çıkıs yapıldı");
                break;
            }
        }



    }
}
