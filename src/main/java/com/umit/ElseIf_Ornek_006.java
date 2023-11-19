package com.umit;

import java.util.Scanner;

public class ElseIf_Ornek_006 {


    /**
     * Beden kitle index ini hesaplayan ve hangi kilo alaninda
     * oldugunu soyleyen program.(ELSE IF li)
     */

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Lutfen boyunuzu giriniz (Ornek: 1,85):");
        double boy= sc.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz (Ornek: 82,5):");
        double kilo= sc.nextDouble();

        double index= indexHesapla(kilo,boy);
        sonucuYazdir(index);

    }//main sonu

    static double indexHesapla(double kilo,double boy){
        return kilo/(boy*boy);
    }

    static void sonucuYazdir(double index){
        if (index < 18.5) {
            System.out.println("İndeksiniz = " + index + "\n" + "Zayıf");
        } else if (index >= 18.5 && index <= 24.9) {
            System.out.println("İndeksiniz = " + index + "\n" + "Normal.");
        } else if (index >= 25 && index <= 29.9) {
            System.out.println("İndeksiniz = " + index + "\n" + "Kilolu.");
        } else if (index >= 30 && index <= 34.9) {
            System.out.println("İndeksiniz = " + index + "\n" + "Obez.");
        } else {
            System.out.println("İndeksiniz = " + index + "\n" + "Aşırı obez");
        }
    }

}//class sonu

