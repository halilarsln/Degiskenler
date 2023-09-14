package com.example.StandartProgramlaYapilari;

public class Donguler {
    public static void main(String args[]){


        // 0 - 3 -> 0.1.2.3 -> 4 kere dönecek.
        // 0 ile başlar.

        for(int i = 0; i <4;i++){ // 0-
            System.out.println("index "+i);
        }// arttırma gerçekleşir.

        // 6 tane veri olan dizi ->0,1,2,3,4,5
        int a = 0;
        while (a<4){// 0-1-2-3
            System.out.println("a deger : "+a);
            a++;
        }
    }
}
