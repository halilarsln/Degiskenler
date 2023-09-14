package com.example.StandartProgramlaYapilari;

import java.util.Arrays;

public class DizilerSiralama {
    public static void main(String args[]){

        String isimler [] = {"zeynep","ali","murat","yeşim"};

        for(String s:isimler){
            System.out.println(s);
        }

        Arrays.sort(isimler);

        for (String x :isimler){
            System.out.println(x);
        }








    }
}
