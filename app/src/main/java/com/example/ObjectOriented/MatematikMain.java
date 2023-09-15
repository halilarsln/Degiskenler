package com.example.ObjectOriented;

public class MatematikMain {
    public static void main(String args[]){

        Matematik m1 = new Matematik();

        m1.carpma(5,6);

        int gelenDeger = m1.toplam(3,6,90);

        System.out.println("Toplam : "+ gelenDeger);

        int cikarmaSonuc = m1.cikarma(40,30,"ahmet");

        System.out.println("Çıkarma : "+cikarmaSonuc);

    }
}
