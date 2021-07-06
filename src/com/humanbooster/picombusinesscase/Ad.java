package com.humanbooster.picombusinesscase;

import java.util.Date;

public class Ad {

    private int ad_id;
    private String ad_title;
    private String ad_text;
    private String ad_image_path;
    private String ad_html;
    private Date ad_date_starting;
    private Date ad_date_ending;
    private boolean ad_activity;
    private Date ad_creation;
    private int id_ad_zone;
    private int id_ad_time_slot;
    private int id_user;

    //Get & Set
    public int getAd_id() {
        return ad_id;
    }

    public void setAd_id(int ad_id) {
        this.ad_id = ad_id;
    }

    public String getAd_title() {
        return ad_title;
    }

    public void setAd_title(String ad_title) {
        this.ad_title = ad_title;
    }

    public String getAd_text() {
        return ad_text;
    }

    public void setAd_text(String ad_text) {
        this.ad_text = ad_text;
    }

    public String getAd_image_path() {
        return ad_image_path;
    }

    public void setAd_image_path(String ad_image_path) {
        this.ad_image_path = ad_image_path;
    }

    public String getAd_html() {
        return ad_html;
    }

    public void setAd_html(String ad_html) {
        this.ad_html = ad_html;
    }

    public Date getAd_date_starting() {
        return ad_date_starting;
    }

    public void setAd_date_starting(Date ad_date_starting) {
        this.ad_date_starting = ad_date_starting;
    }

    public Date getAd_date_ending() {
        return ad_date_ending;
    }

    public void setAd_date_ending(Date ad_date_ending) {
        this.ad_date_ending = ad_date_ending;
    }

    public boolean isAd_activity() {
        return ad_activity;
    }

    public void setAd_activity(boolean ad_activity) {
        this.ad_activity = ad_activity;
    }

    public Date getAd_creation() {
        return ad_creation;
    }

    public void setAd_creation(Date ad_creation) {
        this.ad_creation = ad_creation;
    }

    public int getId_ad_zone() {
        return id_ad_zone;
    }

    public void setId_ad_zone(int id_ad_zone) {
        this.id_ad_zone = id_ad_zone;
    }

    public int getId_ad_time_slot() {
        return id_ad_time_slot;
    }

    public void setId_ad_time_slot(int id_ad_time_slot) {
        this.id_ad_time_slot = id_ad_time_slot;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    //Constructeur
    public Ad() {
    }

    public Ad(int ad_id, String ad_title, String ad_text, String ad_image_path, String ad_html, Date ad_date_starting, Date ad_date_ending, boolean ad_activity, Date ad_creation, int id_ad_zone, int id_ad_time_slot, int id_user) {
        this.ad_id = ad_id;
        this.ad_title = ad_title;
        this.ad_text = ad_text;
        this.ad_image_path = ad_image_path;
        this.ad_html = ad_html;
        this.ad_date_starting = ad_date_starting;
        this.ad_date_ending = ad_date_ending;
        this.ad_activity = ad_activity;
        this.ad_creation = ad_creation;
        this.id_ad_zone = id_ad_zone;
        this.id_ad_time_slot = id_ad_time_slot;
        this.id_user = id_user;
    }


    @Override
    public String toString() {
        return "Ad{" +
                "ad_id=" + ad_id +
                ", ad_title='" + ad_title + '\'' +
                ", ad_text='" + ad_text + '\'' +
                ", ad_image_path='" + ad_image_path + '\'' +
                ", ad_html='" + ad_html + '\'' +
                ", ad_date_starting=" + ad_date_starting +
                ", ad_date_ending=" + ad_date_ending +
                ", ad_activity=" + ad_activity +
                ", ad_creation=" + ad_creation +
                ", id_ad_zone=" + id_ad_zone +
                ", id_ad_time_slot=" + id_ad_time_slot +
                ", id_user=" + id_user +
                '}';
    }
}
