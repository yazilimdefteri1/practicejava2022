package kendi_cozum_day01;

import java.util.Scanner;

public class K01_kendiCozum {
    public static void main(String[] args) {



    //  Kullanıcıya günde ne kadar cay ictigini ve ne kadar seker kullandigini sorun
    // Yılda kac kg seker kullaniyor hesapla ve yazdir

    // 1.07 gr

    Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen günkük kac bardak çay içiyorsunuz   :   ");
      int cayBardagi= scan.nextInt();
        System.out.println("Lutfen her bardak için kac şeker kullaniyorsunuz  :   ");
        int seker= scan.nextInt();

        double toplamSeker=0.0;

        System.out.println(" Günlük kesme seker sayisi : " +(cayBardagi*seker));
        System.out.println(" Günlük  seker gramı : " +((cayBardagi*seker)*1.07));
        System.out.println(" Günlük  seker kgramı : " +((cayBardagi*seker)*1.07)/1000);

        toplamSeker=((cayBardagi*seker)*1.07)/1000*365;
        System.out.println(toplamSeker);
    }
}
