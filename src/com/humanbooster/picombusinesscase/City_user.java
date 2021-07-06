package com.humanbooster.picombusinesscase;

public class City_user {

    //Attributs
    private int city_user_id;
    private String city_user_name;
    private String city_user_postal_code;

    //Get & Set
    public int getCity_user_id() {
        return city_user_id;
    }

    public void setCity_user_id(int city_user_id) {
        this.city_user_id = city_user_id;
    }

    public String getCity_user_name() {
        return city_user_name;
    }

    public void setCity_user_name(String city_user_name) {
        this.city_user_name = city_user_name;
    }

    public String getCity_user_postal_code() {
        return city_user_postal_code;
    }

    public void setCity_user_postal_code(String city_user_postal_code) {
        this.city_user_postal_code = city_user_postal_code;
    }

    //Constructeur
    public City_user() {
    }

    public City_user(int city_user_id, String city_user_name, String city_user_postal_code) {
        this.city_user_id = city_user_id;
        this.city_user_name = city_user_name;
        this.city_user_postal_code = city_user_postal_code;
    }

    @Override
    public String toString() {
        return "City_user{" +
                "city_user_id=" + city_user_id +
                ", city_user_name='" + city_user_name + '\'' +
                ", city_user_postal_code='" + city_user_postal_code + '\'' +
                '}';
    }
}
