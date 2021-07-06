package com.humanbooster.picombusinesscase;

public class Society {

    private int society_id;

    //Get & Set
    public int getSociety_id() {
        return society_id;
    }

    public void setSociety_id(int society_id) {
        this.society_id = society_id;
    }

    //Constructeur
    public Society() {
    }

    public Society(int society_id) {
        this.society_id = society_id;
    }

    @Override
    public String toString() {
        return "Society{" +
                "society_id=" + society_id +
                '}';
    }
}

