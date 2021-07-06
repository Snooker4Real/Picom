package com.humanbooster.picombusinesscase;

public class User {

    private int user_id;
    private String user_firstname;
    private String user_lastname;
    private String user_email;
    private String user_password;
    private String user_telephone;
    private boolean user_newsletter;
    private int id_city_user;
    private String user_adress_number;
    private String user_address_street;
    private int id_society;
    private String user_society_name;
    private String user_society_siret;
    private int user_cb;
    private boolean user_status_admin;
    private boolean user_civilite_monsieur;

    //Get & Set

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_firstname() {
        return user_firstname;
    }

    public void setUser_firstname(String user_firstname) {
        this.user_firstname = user_firstname;
    }

    public String getUser_lastname() {
        return user_lastname;
    }

    public void setUser_lastname(String user_lastname) {
        this.user_lastname = user_lastname;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_telephone() {
        return user_telephone;
    }

    public void setUser_telephone(String user_telephone) {
        this.user_telephone = user_telephone;
    }

    public boolean isUser_newsletter() {
        return user_newsletter;
    }

    public void setUser_newsletter(boolean user_newsletter) {
        this.user_newsletter = user_newsletter;
    }

    public int getId_city_user() {
        return id_city_user;
    }

    public void setId_city_user(int id_city_user) {
        this.id_city_user = id_city_user;
    }

    public String getUser_adress_number() {
        return user_adress_number;
    }

    public void setUser_adress_number(String user_adress_number) {
        this.user_adress_number = user_adress_number;
    }

    public String getUser_address_street() {
        return user_address_street;
    }

    public void setUser_address_street(String user_address_street) {
        this.user_address_street = user_address_street;
    }

    public int getId_society() {
        return id_society;
    }

    public void setId_society(int id_society) {
        this.id_society = id_society;
    }

    public String getUser_society_name() {
        return user_society_name;
    }

    public void setUser_society_name(String user_society_name) {
        this.user_society_name = user_society_name;
    }

    public String getUser_society_siret() {
        return user_society_siret;
    }

    public void setUser_society_siret(String user_society_siret) {
        this.user_society_siret = user_society_siret;
    }

    public int getUser_cb() {
        return user_cb;
    }

    public void setUser_cb(int user_cb) {
        this.user_cb = user_cb;
    }

    public boolean isUser_status_admin() {
        return user_status_admin;
    }

    public void setUser_status_admin(boolean user_status_admin) {
        this.user_status_admin = user_status_admin;
    }

    public boolean isUser_civilite_monsieur() {
        return user_civilite_monsieur;
    }

    public void setUser_civilite_monsieur(boolean user_civilite_monsieur) {
        this.user_civilite_monsieur = user_civilite_monsieur;
    }

    //Constructeur

    public User() {
    }

    public User(int user_id, String user_firstname, String user_lastname, String user_email, String user_password, String user_telephone, boolean user_newsletter, int id_city_user, String user_adress_number, String user_address_street, int id_society, String user_society_name, String user_society_siret, int user_cb, boolean user_status_admin, boolean user_civilite_monsieur) {
        this.user_id = user_id;
        this.user_firstname = user_firstname;
        this.user_lastname = user_lastname;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_telephone = user_telephone;
        this.user_newsletter = user_newsletter;
        this.id_city_user = id_city_user;
        this.user_adress_number = user_adress_number;
        this.user_address_street = user_address_street;
        this.id_society = id_society;
        this.user_society_name = user_society_name;
        this.user_society_siret = user_society_siret;
        this.user_cb = user_cb;
        this.user_status_admin = user_status_admin;
        this.user_civilite_monsieur = user_civilite_monsieur;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_firstname='" + user_firstname + '\'' +
                ", user_lastname='" + user_lastname + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_telephone='" + user_telephone + '\'' +
                ", user_newsletter=" + user_newsletter +
                ", id_city_user=" + id_city_user +
                ", user_adress_number='" + user_adress_number + '\'' +
                ", user_address_street='" + user_address_street + '\'' +
                ", id_society=" + id_society +
                ", user_society_name='" + user_society_name + '\'' +
                ", user_society_siret='" + user_society_siret + '\'' +
                ", user_cb=" + user_cb +
                ", user_status_admin=" + user_status_admin +
                ", user_civilite_monsieur=" + user_civilite_monsieur +
                '}';
    }
}
