package com.umit;

import java.util.Scanner;

public class ElseIf_Ornek_009 {
    /**
     *
     * klavyeden 0-1000 arasinda sayi alalim ve su kontrolleri yapalim
     * 1- mukemmel sayi mi?
     * 2- 0-31 arasinda ki bir sayinin karesi mi
     * 3- rakamlari toplami 20den fazla mi
     * 4-tek mi cift mi
     *
     */
    public static void main(String[] args) {

        int deger = sayi();
        ekranaCikti(deger);

    }   //main sonu

    static int sayi() {
        boolean kontrol;
        int sayi;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Belirtilen aralikta sayi giriniz (0-1000)");
            sayi= sc.nextInt();

            kontrol = false;

            if (sayi < 0 || sayi > 1000) {
                System.out.println("Gecerli deger giriniz!!!");
                kontrol=true;
            }
        } while (kontrol);
        return sayi;
    } //sayi method sonu


    static boolean mukemmelSayi(int sayi){
        int toplam=0;
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
    }return sayi==toplam;
    }
    static boolean kareMi(int sayi){
        for (int i=1;i<32;i++){
            if (i*i==sayi) return true;
        }
        return false;
    }
    static boolean rakamlarToplami(int sayi){
        int basamakToplami = 0;
        while (sayi != 0) {
            basamakToplami += sayi % 10;
            sayi /= 10;
        }
        if (basamakToplami>20) return true;
        return false;
    }
    static void tekCift(int sayi){
        if (sayi%2==0) System.out.println(sayi + " cifttir...");
        else System.out.println(sayi+ " tektir...");
    }
    static void ekranaCikti(int sayi){
        if (mukemmelSayi(sayi)) System.out.println(sayi + " mükemmel bir sayıdır.");
        else if (kareMi(sayi)) System.out.println(sayi + " bir sayinin karesidir. ");
        else if (rakamlarToplami(sayi)) System.out.println(sayi+ " nin basamaklari toplami 20den buyuktur.");
        else tekCift(sayi);
    }

}   //class sonu
