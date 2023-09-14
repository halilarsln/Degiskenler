package com.example.StandartProgramlaYapilari;

public class IfCalisma {

    public static void main(String args[]){

        int yas = 15 ;
        String isim = "Halil";

        if (yas > 18){//true
            System.out.println("Resitsiniz.");
        }else{//false
            System.out.println("Reşit değilsiniz");
        }

        if(isim .equals("Halil")){
            System.out.println("Merhaba Halil");
        }else if (isim.equals("Mehmet")){
            System.out.println("Merhaba Halil olmayan");
        }else{
            System.out.println("Merhaba kimse");
        }

        int sifre = 1234 ;
        String kullaniciAdi = "admin";

        if(sifre == 1234 && kullaniciAdi.equals("admin")){
            System.out.println("Merhaba "+kullaniciAdi);
        }else {
            System.out.println("Hatalı giriş");
        }




    }
}
