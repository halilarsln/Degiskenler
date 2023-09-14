package com.example.StandartProgramlaYapilari;

import java.util.Random;

public class HazirKomutlar {

    public static void main(String args[]){
        int i = - 5 ;
        System.out.println("Mutlak deger : "+Math.abs(i));
        System.out.println("Pİ : "+Math.PI);
        System.out.println("Üslü Sayilar : "+Math.pow(2.0,6.0));
        System.out.println("Köklü Sayilar : "+Math.sqrt(9));

        //Rastgele sayi üretme

        Random r = new Random();




        for (int k =0;k<5;k++){
            int sayi = r.nextInt(100);
            System.out.println("Random sayi : "+sayi);

        }


    }
}
