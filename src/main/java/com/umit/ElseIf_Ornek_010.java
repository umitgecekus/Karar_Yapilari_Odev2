package com.umit;

import java.util.Scanner;

public class ElseIf_Ornek_010 {

    /**
     *
     * 2000 yilinda ki lige gore sampiyonu ekrana yazdiran program.
     *
     */

    public static void main(String[] args) {
        bilgi();
        int secim= secim();
        ekranaYazdir(secim);

    }   //main method sonu

    static void bilgi(){
        System.out.println("1999-2000 sezonuna ait hangi ligin sampiyonunu gormek istiyorsunuz...");
        System.out.println("1- Super Cup");
        System.out.println("2- Uefa Champions League");
        System.out.println("3- Uefa Europa");
        System.out.println("4- Turkiye Ligi");
        System.out.println("5- Premier League");
        System.out.println("6- Serie A");
        System.out.println("7- La Liga");
    }

    static int secim(){
        boolean kontrol=false;
        int secim;
        do {
            kontrol=false;
            secim= new Scanner(System.in).nextInt();
            if (secim<1 || secim>7){System.out.println("Gecerli bir deger giriniz (1-7 arasinda)...");kontrol=true;}
        }while (kontrol);

        return secim;
    }
    static void ekranaYazdir(int secim){
        if (secim==1) System.out.println("UEFA Super Cup sampiyonu GALATASARAY dir.");
        else if (secim==2) System.out.println("UEFA Champions League sampiyonu Real Madrid tir.");
        else if (secim==3) System.out.println("UEFA Europa League sampiyonu GALATASARAY dir.");
        else if (secim==4) System.out.println("Turkiye Ligi sampiyonu GALATASARAY dır.");
        else if (secim==5) System.out.println("Premier League sampiyonu Manchester United dir.");
        else if (secim==6) System.out.println("Serie A sampiyonu Lazio dur.");
        else System.out.println("La Liga sampiyonu RC Deportivo de La Coruña dir.");

    }


}   //class sonu
