package com.example.StandartProgramlaYapilari;

public class DonguleerSinirDegerOrnekler {

    public static void main(String args[]){

        //ornek 1 : 3 ile 6 arasında 3,4,5,6

        for (int k = 3 ;k <= 7; k++){
            System.out.println("k deger : "+k);
        }

        int a= 3;

        while(a<7){
            System.out.println("a deger "+a);
            a++;
        }

        // örnek 2 : 0 - 8 ->0,2,4,6,8

        for (int z = 0;z < 9;z+=2){
            System.out.println("z deger : "+z);
        }

        int m = 0 ;
        while (m<9){
            System.out.println("m deger :"+m);
            m = m+2 ;
        }

    }
}
