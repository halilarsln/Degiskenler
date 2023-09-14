package com.example.StandartProgramlaYapilari;

import java.util.Scanner;

public class SwitchÇalismasi {

    public static void main(String args[]){
        int gun = 2 ;
        switch (gun){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
                break;
            default:
                System.out.println("Böyle bir gün yok");
                break;
        }
    }
}
