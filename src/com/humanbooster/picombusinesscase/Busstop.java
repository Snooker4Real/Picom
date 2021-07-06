package com.humanbooster.picombusinesscase;

public class Busstop {

    private int busstop_id;
    private String busstop_name;
    private int id_zone;
    private String busstop_ip_adress;

    //Get & Set
    public int getBusstop_id() {
        return busstop_id;
    }

    public void setBusstop_id(int busstop_id) {
        this.busstop_id = busstop_id;
    }

    public String getBusstop_name() {
        return busstop_name;
    }

    public void setBusstop_name(String busstop_name) {
        this.busstop_name = busstop_name;
    }

    public int getId_zone() {
        return id_zone;
    }

    public void setId_zone(int id_zone) {
        this.id_zone = id_zone;
    }

    public String getBusstop_ip_adress() {
        return busstop_ip_adress;
    }

    public void setBusstop_ip_adress(String busstop_ip_adress) {
        this.busstop_ip_adress = busstop_ip_adress;
    }

    //Constructeur
    public Busstop() {
    }

    public Busstop(int busstop_id, String busstop_name, int id_zone, String busstop_ip_adress) {
        this.busstop_id = busstop_id;
        this.busstop_name = busstop_name;
        this.id_zone = id_zone;
        this.busstop_ip_adress = busstop_ip_adress;
    }

    @Override
    public String toString() {
        return "Busstop{" +
                "busstop_id=" + busstop_id +
                ", busstop_name='" + busstop_name + '\'' +
                ", id_zone=" + id_zone +
                ", busstop_ip_adress='" + busstop_ip_adress + '\'' +
                '}';
    }
}
