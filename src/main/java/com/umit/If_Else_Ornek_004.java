package com.umit;

import java.util.Scanner;

public class If_Else_Ornek_004 {
    public static void main(String[] args) {

        /**
         * Klavyeden 2 String deger alalim, ayniysa ayni ,degilse degil diye cikti verelim
         * (IF ELSE ornek)
         */

        System.out.println("Birinci kelimeyi giriniz...: ");
        String k1= new Scanner(System.in).nextLine();

        System.out.println("Ikinci kelimeyi giriniz...: ");
        String k2= new Scanner(System.in).nextLine();

        if (k1.equals(k2)) System.out.println("Iki kelime aynidir...");
        else System.out.println("Iki kelime farklidir.");




    }//main sonu
}
