package com.umit;

import java.util.Scanner;

public class If_Else_Ornek_003 {
    public static void main(String[] args) {

        /**
         * Klavyeden 2 sayi alalim ,sayilar birbirinden farkli olsun
         * buyuk olan sayiyi ekrana yazdiralim.(IF ELSE ornek)
         */
        Scanner sc= new Scanner(System.in);
        int sayac=1;
        int s1,s2;

        do {
            sayac--;

            System.out.println("Birinci sayiyi giriniz...: ");
            s1= sc.nextInt();

            System.out.println("Ikinci sayiyi giriniz...: ");
            s2= sc.nextInt();

            if (s1==s2) {
                System.out.println("Ayni deger girmeyiniz...");
                sayac++;
            }
        }while (sayac>0);  //do while dongusunde if kullanarak sayilarin esitligini kontrol ettik

        if (s1>s2) System.out.println("Buyuk olan sayi s1= "+ s1 +" dir." );
        else System.out.println("Buyuk olan sayi s2= "+ s2 +" dir." );

    }   //main sonu
}
