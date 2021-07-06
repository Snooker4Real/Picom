package com.humanbooster.picombusinesscase;

public class Zone {

    private int zone_id;
    private int zone_influence_level;
    private int id_ad_zone;
    private Double zone_price;

    //Get & Set
    public int getZone_id() {
        return zone_id;
    }

    public void setZone_id(int zone_id) {
        this.zone_id = zone_id;
    }

    public int getZone_influence_level() {
        return zone_influence_level;
    }

    public void setZone_influence_level(int zone_influence_level) {
        this.zone_influence_level = zone_influence_level;
    }

    public int getId_ad_zone() {
        return id_ad_zone;
    }

    public void setId_ad_zone(int id_ad_zone) {
        this.id_ad_zone = id_ad_zone;
    }

    public Double getZone_price() {
        return zone_price;
    }

    public void setZone_price(Double zone_price) {
        this.zone_price = zone_price;
    }

    //Constructeurs
    public Zone() {
    }

    public Zone(int zone_id, int zone_influence_level, int id_ad_zone, Double zone_price) {
        this.zone_id = zone_id;
        this.zone_influence_level = zone_influence_level;
        this.id_ad_zone = id_ad_zone;
        this.zone_price = zone_price;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "zone_id=" + zone_id +
                ", zone_influence_level=" + zone_influence_level +
                ", id_ad_zone=" + id_ad_zone +
                ", zone_price=" + zone_price +
                '}';
    }
}
