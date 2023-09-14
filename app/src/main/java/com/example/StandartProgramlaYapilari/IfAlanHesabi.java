package com.example.StandartProgramlaYapilari;

import java.util.Scanner;

public class IfAlanHesabi {

    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Alan Hesabına hoşgeldiniz");
        System.out.println("(1) Dikdörtgen alanı");
        System.out.println("(2) Çember alanı ");

        int tercih = tarayici.nextInt();

        if (tercih == 1){
            System.out.println("Kısa kenar giriniz");
            int kısaKenar = tarayici.nextInt();
            System.out.println("Uzun kenar giriniz");
            int uzunKenar = tarayici.nextInt();

            System.out.println("Sonuc : "+(kısaKenar*uzunKenar));

        }

        if (tercih == 2 ){
            System.out.println("Yarı Çap giriniz");
            int yariCap = tarayici.nextInt();

            System.out.println("Çember alanı : "+(3.14*yariCap*yariCap));

        }


    }
}
