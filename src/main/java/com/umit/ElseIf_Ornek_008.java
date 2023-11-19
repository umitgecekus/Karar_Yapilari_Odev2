package com.umit;

import java.util.Scanner;

public class ElseIf_Ornek_008 {

    /**
     *
     * Kullanicidan Kart turu, aktarma ve bakiye bilgisini alarak eger yeterli
     * bakiye bulunuyorsa kalan bakiye bilgisini gosterecegiz. Yeterli bakiye
     * bulunmamasi halinde gerekli uyariyi yapacagiz.
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int kartTuru,aktarma;
        double bakiye=0,ucret=0;


        System.out.print("Kart Türünü girin (1)-Tam  (2)-Öğrenci  (3)-Sosyal : ");
        kartTuru=sc.nextInt();

        System.out.print("Aktarma  (0) İlk Biniş  (1) 1. Aktarma  (2) +2. Aktarma: ");
        aktarma=sc.nextInt();

        System.out.print("Bakiye: ");
        bakiye=sc.nextDouble();

        if(kartTuru==1){
            if(aktarma==0) ucret=15.5;

            else if(aktarma==1) ucret=10.49;

            else ucret=7.17;
        }

        if(kartTuru==2){
            if(aktarma==0) ucret=10.74;

            else if(aktarma==1) ucret=7.64;

            else ucret=4.54;
        }

        if(kartTuru==3){
            if(aktarma==0) ucret=17.49;

            else if(aktarma==1) ucret=12.29;

            else  ucret=9.52;
        }

        if(bakiye>=ucret){
            bakiye-=ucret;
            System.out.println("İyi yolculuklar. Kalan Bakiye: "+bakiye);
        }
        else{
            System.out.println("Yetersiz Bakiye.");
        }


    }   //main method sonu

}   //class sonu
