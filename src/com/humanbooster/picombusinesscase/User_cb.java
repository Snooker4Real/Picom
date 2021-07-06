package com.humanbooster.picombusinesscase;

public class User_cb {

    private int user_cb_id;
    private String user_card_number;
    private String user_card_expiration;
    private String user_card_cvv;
    private String user_card_name;

    //Get & Set
    public int getUser_cb_id() {
        return user_cb_id;
    }

    public void setUser_cb_id(int user_cb_id) {
        this.user_cb_id = user_cb_id;
    }

    public String getUser_card_number() {
        return user_card_number;
    }

    public void setUser_card_number(String user_card_number) {
        this.user_card_number = user_card_number;
    }

    public String getUser_card_expiration() {
        return user_card_expiration;
    }

    public void setUser_card_expiration(String user_card_expiration) {
        this.user_card_expiration = user_card_expiration;
    }

    public String getUser_card_cvv() {
        return user_card_cvv;
    }

    public void setUser_card_cvv(String user_card_cvv) {
        this.user_card_cvv = user_card_cvv;
    }

    public String getUser_card_name() {
        return user_card_name;
    }

    public void setUser_card_name(String user_card_name) {
        this.user_card_name = user_card_name;
    }

    //Constructeurs

    public User_cb() {
    }

    public User_cb(int user_cb_id, String user_card_number, String user_card_expiration, String user_card_cvv, String user_card_name) {
        this.user_cb_id = user_cb_id;
        this.user_card_number = user_card_number;
        this.user_card_expiration = user_card_expiration;
        this.user_card_cvv = user_card_cvv;
        this.user_card_name = user_card_name;
    }

    @Override
    public String toString() {
        return "User_cb{" +
                "user_cb_id=" + user_cb_id +
                ", user_card_number='" + user_card_number + '\'' +
                ", user_card_expiration='" + user_card_expiration + '\'' +
                ", user_card_cvv='" + user_card_cvv + '\'' +
                ", user_card_name='" + user_card_name + '\'' +
                '}';
    }
}
