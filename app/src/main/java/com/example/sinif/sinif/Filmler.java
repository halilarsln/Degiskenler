package com.example.sinif.sinif;

public class Filmler {
    private int film_id;
    private String film_ad;
    private  int film_yil;

    private Kategoriler kategori;
    private Yonetmenler yönetmen;

    public Filmler() {
    }

    public Filmler(int film_id, String film_ad, int film_yil, Kategoriler kategori, Yonetmenler yönetmen) {
        this.film_id = film_id;
        this.film_ad = film_ad;
        this.film_yil = film_yil;
        this.kategori = kategori;
        this.yönetmen = yönetmen;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getFilm_ad() {
        return film_ad;
    }

    public void setFilm_ad(String film_ad) {
        this.film_ad = film_ad;
    }

    public int getFilm_yil() {
        return film_yil;
    }

    public void setFilm_yil(int film_yil) {
        this.film_yil = film_yil;
    }

    public Kategoriler getKategori() {
        return kategori;
    }

    public void setKategori(Kategoriler kategori) {
        this.kategori = kategori;
    }

    public Yonetmenler getYönetmen() {
        return yönetmen;
    }

    public void setYönetmen(Yonetmenler yönetmen) {
        this.yönetmen = yönetmen;
    }
}
