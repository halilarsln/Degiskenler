package com.example.ObjectOriented;

public class OtobusMain {
    public static void main(String args[]){

        Otobüs kamilKoç = new Otobüs();

        kamilKoç.kapasite = 50 ;
        kamilKoç.mevcutYolcu = 20 ;
        kamilKoç.nereden = "İstanbul";
        kamilKoç.nereye = "Bursa";

        Otobüs nilufer = new Otobüs();

        nilufer.kapasite = 40 ;
        nilufer.mevcutYolcu = 10 ;
        nilufer.nereden = "Ankara";
        nilufer.nereye = "Kütahya";

        //kamilKoç.bilgiAl();
        System.out.println("----------------------");
        //nilufer.bilgiAl();

        kamilKoç.yolcuAl(20);
        kamilKoç.yolcuIndir(40);

        kamilKoç.bilgiAl();

        kamilKoç.nereye= "İzmir";

        kamilKoç.bilgiAl();






    }
}
