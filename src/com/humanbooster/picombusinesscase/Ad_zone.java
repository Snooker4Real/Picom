package com.humanbooster.picombusinesscase;

public class Ad_zone {

    int ad_zone_id;
    int id_ad;
    int id_zone;

    //Get & set
    public int getAd_zone_id() {
        return ad_zone_id;
    }

    public void setAd_zone_id(int ad_zone_id) {
        this.ad_zone_id = ad_zone_id;
    }

    public int getId_ad() {
        return id_ad;
    }

    public void setId_ad(int id_ad) {
        this.id_ad = id_ad;
    }

    public int getId_zone() {
        return id_zone;
    }

    public void setId_zone(int id_zone) {
        this.id_zone = id_zone;
    }

    //Constructeur
    public Ad_zone() {
    }

    public Ad_zone(int ad_zone_id, int id_ad, int id_zone) {
        this.ad_zone_id = ad_zone_id;
        this.id_ad = id_ad;
        this.id_zone = id_zone;
    }

    @Override
    public String toString() {
        return "Ad_zone{" +
                "ad_zone_id=" + ad_zone_id +
                ", id_ad=" + id_ad +
                ", id_zone=" + id_zone +
                '}';
    }
}
