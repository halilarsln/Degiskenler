package com.example.ObjectOriented;

public class Araba {

    String renk ;
    int hiz;
    double uzunluk;

    boolean calişiyorMu;

    //metot davranisi
    public void calistir(){
        calişiyorMu = true;
    }
    public void durdur(){
        calişiyorMu = false;
    }
    public void hizlan(int miktar){
        hiz = hiz + miktar;
    }

    public void yavasla(int miktar){
        hiz = hiz - miktar;
    }
}
