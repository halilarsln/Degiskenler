package com.example.StandartProgramlaYapilari;

public class BreakContinue {

    public static void main(String args[]){

        for (int i = 0 ; i < 6 ; i++){
            System.out.println("index : "+i);
            if (i==3){
                break;
            }
            System.out.println("index : "+i);
        }
    }
}
