package com.umit;

import java.util.Scanner;

public class ElseIf_Ornek_005 {

    /**
     *
     * Klavyeden kare , dikucgen veya eskenar ucgen sekli icin istekte bulunalim daha sonra
     * boyutu icin bilgi alip cikti verelim.(IF ELSEIF ELSE)
     *
     */

    public static void main(String[] args) {
        int secim= Soru();
        Islem(secim);

    }   //main sonu


    static int Soru(){
        Scanner sc = new Scanner(System.in);
        boolean kontrol;
        int secim;
        do {
            kontrol=false;
            System.out.println("Hangi şekli çizmek istersiniz? (1: Kare, 2: Dik Ucgen, 3: Eskenar Ucgen)");
            secim = sc.nextInt();
            if (secim<1 || secim>3) kontrol=true;

        }while (kontrol);

        return secim;

    }

    static void Islem(int secim) {
            Scanner sc= new Scanner(System.in);
            if (secim == 1) {
                System.out.println("Kare boyutunu giriniz...: ");
                int boyut = sc.nextInt();
                for (int i = 0; i < boyut * boyut; i++) {
                    System.out.print("* ");
                    if ((i + 1) % boyut == 0) System.out.println();
                }

            } else if (secim == 2) {
                System.out.println("Dik ücgen taban uzunlugu giriniz...: ");
                int boyut = sc.nextInt();

                for (int i = 0; i < boyut; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

            } else {
                System.out.print("Eskenar ücgenin uzunlugunu giriniz...: ");
                int boyut = sc.nextInt();
                for (int i = 1; i <= boyut; i++) {

                    for (int j = 1; j <= boyut - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }

            }
    }   //islem method sonu

}   //class sonu
