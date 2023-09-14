package com.example.StandartProgramlaYapilari;

public class DızılerDonguler {
    public static void main(String args[]){

        String sehirler [] = {"bursa","izmir","ankara","van","trabzon"};

        System.out.println(sehirler[0]);
        System.out.println(sehirler[1]);
        System.out.println(sehirler[2]);
        System.out.println(sehirler[3]);
        System.out.println(sehirler[4]);

        for (int i = 0 ;i < 5 ; i++){
            System.out.println(sehirler[i]);
        }

        String markalar [] = {"HP","APPLE","GOOGLE"};

        for (int i = 0;i < markalar.length;i++){
            System.out.println(markalar[i]);
        }

        String isimler [] = {"ahmet","ayşe","tuba","zeynep"};

        for (String s:isimler){
            System.out.println(s);
        }


        int sayilar [] = {30,20,50,80,93};

        for(int sayi :sayilar){
            System.out.println(sayi);
        }
    }
}
