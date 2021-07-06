package com.humanbooster.picombusinesscase;

public class Society_category {

    //Attributs
    private int society_category_id;
    private int id_id_category;
    private int id_society;

    //Get & Set
    public int getSociety_category_id() {
        return society_category_id;
    }

    public void setSociety_category_id(int society_category_id) {
        this.society_category_id = society_category_id;
    }

    public int getId_id_category() {
        return id_id_category;
    }

    public void setId_id_category(int id_id_category) {
        this.id_id_category = id_id_category;
    }

    public int getId_society() {
        return id_society;
    }

    public void setId_society(int id_society) {
        this.id_society = id_society;
    }

    //Constructeurs
    public Society_category() {
    }

    public Society_category(int society_category_id, int id_id_category, int id_society) {
        this.society_category_id = society_category_id;
        this.id_id_category = id_id_category;
        this.id_society = id_society;
    }

    @Override
    public String toString() {
        return "Society_category{" +
                "society_category_id=" + society_category_id +
                ", id_id_category=" + id_id_category +
                ", id_society=" + id_society +
                '}';
    }
}
