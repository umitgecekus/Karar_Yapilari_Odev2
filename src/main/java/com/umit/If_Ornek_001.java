package com.umit;

import java.util.Scanner;

public class If_Ornek_001 {
    public static void main(String[] args) {

        /**
         * Klavyeden 0 ile 100 arasinda sayi girilsin ve 5in katiysa cikti verelim
         * degilse cikti vermeyelim. (Sadece IF kullanilarak yapilan bir ornek.)
          */

        Scanner sc= new Scanner(System.in);
        int sayi;
        int sayac=1;

        do {
            sayac--;
            System.out.println("Lutfen 0 ile 100 arasinda bir sayi giriniz... ");
            sayi=sc.nextInt();

            if (sayi<0 || sayi>100) sayac++;
        }while (sayac!=0);

        if ((sayi%=5)==0) System.out.println("girilen sayi 5in katidir.");



    }
}
