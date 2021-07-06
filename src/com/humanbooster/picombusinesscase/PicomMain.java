package com.humanbooster.picombusinesscase;

import java.util.Date;

public class PicomMain {

    public static void main(String[] args) {

        User user = new User(1,"Jonathan","Cindano","cindanojonathan@gmail.com","Jonathan1999","0758916877",true,1,"103","avenue Pierre Brossolette",1,"Jo&Co","556526",1,true,true);
        System.out.println(user.toString());

        Ad ad = new Ad(1,"Coca-Cola","Buvez du Cola","/img/coca","google.fr",new Date(Date.parse("2021/05/08")),new Date(Date.parse("2021/05/09")),true,new Date(Date.parse("2021/07/06")),1,2,1);

        System.out.println(ad.toString());


    }
}
