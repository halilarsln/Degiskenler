package com.example.degiskenler;

public class TurDonusumu {

    public  static void main(String args[]){

        double d = 23.56  ;
        long l = (long) d;
        int i = (int) l;

        System.out.println("Double Deger : "+d);
        System.out.println("Long Deger : "+l);
        System.out.println("Integer Deger : "+i);

        int x = 67 ;
        long y = x ;
        double z = y ;
        System.out.println("X deger : "+x);
        System.out.println("Y deger : "+y);
        System.out.println("Z deger : "+z);

        int sayi = 56 ;

        String yazi1 = String.valueOf(sayi);
        String yazi2 = Integer.toString(sayi);
        String yazi3 = sayi+"";

        System.out.println(yazi1);
        System.out.println(yazi2);
        System.out.println(yazi3);

        String metin = "56";

        int sayi1 = Integer.parseInt(metin);
        int sayi2 = Integer.valueOf(metin);

        System.out.println(sayi1);
        System.out.println(sayi2);

    }
}
