package com.example.ObjectOriented;

public class NesneTabanliGiris {

    public static void main(String args[]){

        //normal degişken
        int yas = 30 ;
        //nesne oluşturma
        Araba bmw = new Araba();

        bmw.renk = "Kırmızı" ;
        bmw.hiz = 200 ;
        bmw.uzunluk =2.05 ;
        bmw.calişiyorMu = true ;

        Araba tofas = new Araba();

        tofas.renk ="mavi" ;
        tofas.hiz = 180 ;
        tofas.uzunluk= 3.5 ;
        tofas.calişiyorMu = false ;

        /*System.out.println("BMW");
        System.out.println("Bmw renk :"+bmw.renk);
        System.out.println("Bmw hiz :"+bmw.hiz);
        System.out.println("Bmw uzunluk :"+bmw.uzunluk);
        System.out.println("Bmw durumu :"+bmw.calişiyorMu);

        System.out.println("TOFAŞ");
        System.out.println("Tofaş renk :"+tofas.renk);
        System.out.println("Tofaş hiz :"+tofas.hiz);
        System.out.println("Tofaş uzunluk :"+tofas.uzunluk);
        System.out.println("Tofaş durumu :"+tofas.calişiyorMu);*/

        Araba reno = new Araba();

        reno.renk ="sari";
        reno.hiz = 150 ;
        reno.uzunluk = 3.67 ;
        reno.calişiyorMu = true ;

        //System.out.println(reno.renk);

        System.out.println("bmw calışma : "+bmw.calişiyorMu);
        System.out.println("tofas calışma :"+tofas.calişiyorMu);
        System.out.println("reno çalışma :"+reno.calişiyorMu);

        tofas.calistir();
        reno.durdur();
        reno.hizlan(30);

        System.out.println("bmw calışma : "+bmw.calişiyorMu);
        System.out.println("tofas calışma :"+tofas.calişiyorMu);
        System.out.println("reno çalışma :"+reno.calişiyorMu);

        System.out.println("BMW HIZ:"+bmw.hiz);
        bmw.hizlan(60);

        System.out.println("BMW HIZ:"+bmw.hiz);
        bmw.yavasla(90);

        tofas.hizlan(100);
        System.out.println("Tofas hız : "+tofas.hiz);





    }
}
