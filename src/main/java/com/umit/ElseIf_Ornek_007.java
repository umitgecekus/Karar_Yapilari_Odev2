package com.umit;

import java.util.Scanner;

public class ElseIf_Ornek_007 {

    /**
     *
     * klavyededn kacinci ay oldugu girilsin daha sonra hangi mevsim,ay
     * ve kac gune sahip oldugunu yazdiralim.
     */

    public static void main(String[] args) {
        ay();

    }//main sonu

    static int ay() {
        boolean kontrol;
        int ay;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Hangi ayda oldugunuzu belirtin (1-12)");
            ay = sc.nextInt();

            kontrol = false;

            if (ay < 1 || ay > 12) {
                kontrol = true;
                System.out.println("1 ve 12 arasinda deger giriniz...");
            }

            else {
                String mevsim= mevsim(ay);
                String ayAdi= ayAdiBelirle(ay);
                ciktiVereilm(ay,mevsim,ayAdi);
            }


        } while (kontrol);
        return ay;
    }
    static void ciktiVereilm(int ay,String mevsim,String ayAdi){
        System.out.println(ay + ". ayi sectiniz bu "+ ayAdi+" ayidir ve " + mevsim+ " mevsimi icerisinde yer alir. ");
    }

    static String mevsim (int ay){
         if (ay == 12 || ay <= 2) return "Kış";
         else if (ay >= 3 && ay <= 5) return "İlkbahar";
         else if (ay >= 6 && ay <= 8) return "Yaz";
         else return "Sonbahar";
    }

    static String ayAdiBelirle(int ay){
        if (ay == 1) return "Ocak";
         else if (ay == 2) return "Subat";
         else if (ay == 3) return "Mart";
         else if (ay == 4) return "Nisan";
         else if (ay == 5) return "Mayis";
         else if (ay == 6) return "Haziran";
         else if (ay == 7) return "Temmuz";
         else if (ay == 8) return "Agustos";
         else if (ay == 9) return "Eylul";
         else if (ay == 10) return "Ekim";
         else if (ay == 11) return "Kasim";
         else  return "Aralik";
    }


}//class sonu
