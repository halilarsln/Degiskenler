package com.example.StandartProgramlaYapilari;

import java.util.Arrays;

public class Diziler {

    public static void main(String args[]){

        int plakalar [] =new int [5];

        plakalar[0] = 34 ;

        plakalar[3] = 16 ;

        plakalar[2] = 65 ;

       // System.out.println(Arrays.toString(plakalar));

        String [] meyveler = {"elma","armut","vişne","çilek","limon"};
        double [] boylar = {1.78,1.56,1.89};

        System.out.println(meyveler[4]);
        System.out.println(boylar[1]);

        System.out.println(Arrays.toString(meyveler));

        meyveler[3] = "mandalina" ;

        System.out.println(Arrays.toString(meyveler));

        System.out.println();
    }
}
