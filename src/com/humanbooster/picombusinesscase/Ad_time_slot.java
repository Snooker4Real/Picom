package com.humanbooster.picombusinesscase;

public class Ad_time_slot {

    private int ad_time_slot_id;
    private int id_ad;
    private int id_time_slot;

    //Get & Set
    public int getAd_time_slot_id() {
        return ad_time_slot_id;
    }

    public void setAd_time_slot_id(int ad_time_slot_id) {
        this.ad_time_slot_id = ad_time_slot_id;
    }

    public int getId_ad() {
        return id_ad;
    }

    public void setId_ad(int id_ad) {
        this.id_ad = id_ad;
    }

    public int getId_time_slot() {
        return id_time_slot;
    }

    public void setId_time_slot(int id_time_slot) {
        this.id_time_slot = id_time_slot;
    }

    //Constructeur

    public Ad_time_slot() {
    }

    public Ad_time_slot(int ad_time_slot_id, int id_ad, int id_time_slot) {
        this.ad_time_slot_id = ad_time_slot_id;
        this.id_ad = id_ad;
        this.id_time_slot = id_time_slot;
    }

    @Override
    public String toString() {
        return "Ad_time_slot{" +
                "ad_time_slot_id=" + ad_time_slot_id +
                ", id_ad=" + id_ad +
                ", id_time_slot=" + id_time_slot +
                '}';
    }
}

