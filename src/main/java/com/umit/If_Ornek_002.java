package com.umit;

import java.util.Scanner;

public class If_Ornek_002 {
    public static void main(String[] args) {
        /**
         * Klavyeden dizi eleman sayisi alalim daha sonra dizi
         * icinde gezip en buyuk ve en kucuk sayiyi yazdiralim
         * (Sadece IF kullanilarak yapilan ornek.)
         */

        Scanner sc= new Scanner(System.in);
        System.out.println("Dizi eleman sayisini giriniz...: ");
        int boyut= sc.nextInt();

        int [] dizi = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.print(i+1+". Dizi elemanını giriniz...: ");   //diziyi dolduruyoruz
            dizi[i] = sc.nextInt();
        }

        int enBuyuk = dizi[0];
        int enKucuk = dizi[0];

        for (int i = 1; i < boyut; i++) {   // for dongusu icinde en buyuk ve en kucuk degerleri tespit ediyoruz
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }

            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);



    }//main sonu



}
