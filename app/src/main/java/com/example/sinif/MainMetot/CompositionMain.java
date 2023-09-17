package com.example.sinif.MainMetot;

import com.example.sinif.sinif.Filmler;
import com.example.sinif.sinif.Kategoriler;
import com.example.sinif.sinif.Yonetmenler;

public class CompositionMain {
    public static void main(String args[]){



    Kategoriler kategori = new Kategoriler(1,"Komedi");
    Yonetmenler yonetmen = new Yonetmenler(2,"YILMAZ ERDOGAN");
    Filmler film = new Filmler(10,"Vizontele",2009,kategori,yonetmen);

        System.out.println("Film id       : "+film.getFilm_id());
        System.out.println("Film ad       : "+film.getFilm_ad());
        System.out.println("Film yil      : "+film.getFilm_yil());
        System.out.println("Film yonetmen : "+film.getYönetmen().getYonetmen_ad());
        System.out.println("Film kategori : "+film.getKategori().getKategori_ad());

    }
}
