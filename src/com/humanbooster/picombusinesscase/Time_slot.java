package com.humanbooster.picombusinesscase;

import java.sql.Time;

public class Time_slot {

    private int time_slot_id;
    private Time time_slot_starting;
    private Time time_slot_ending;
    private Double time_slot_extra_price;
    private int id_ad_time_slot;

    //Get & Set
    public int getTime_slot_id() {
        return time_slot_id;
    }

    public void setTime_slot_id(int time_slot_id) {
        this.time_slot_id = time_slot_id;
    }

    public Time getTime_slot_starting() {
        return time_slot_starting;
    }

    public void setTime_slot_starting(Time time_slot_starting) {
        this.time_slot_starting = time_slot_starting;
    }

    public Time getTime_slot_ending() {
        return time_slot_ending;
    }

    public void setTime_slot_ending(Time time_slot_ending) {
        this.time_slot_ending = time_slot_ending;
    }

    public Double getTime_slot_extra_price() {
        return time_slot_extra_price;
    }

    public void setTime_slot_extra_price(Double time_slot_extra_price) {
        this.time_slot_extra_price = time_slot_extra_price;
    }

    public int getId_ad_time_slot() {
        return id_ad_time_slot;
    }

    public void setId_ad_time_slot(int id_ad_time_slot) {
        this.id_ad_time_slot = id_ad_time_slot;
    }

    //Constructeur

    public Time_slot() {
    }

    public Time_slot(int time_slot_id, Time time_slot_starting, Time time_slot_ending, Double time_slot_extra_price, int id_ad_time_slot) {
        this.time_slot_id = time_slot_id;
        this.time_slot_starting = time_slot_starting;
        this.time_slot_ending = time_slot_ending;
        this.time_slot_extra_price = time_slot_extra_price;
        this.id_ad_time_slot = id_ad_time_slot;
    }

    @Override
    public String toString() {
        return "Time_slot{" +
                "time_slot_id=" + time_slot_id +
                ", time_slot_starting=" + time_slot_starting +
                ", time_slot_ending=" + time_slot_ending +
                ", time_slot_extra_price=" + time_slot_extra_price +
                ", id_ad_time_slot=" + id_ad_time_slot +
                '}';
    }
}
