package kendi_cozum_day01;

import java.util.Scanner;

public class K20_aygunSorusu {
    /*Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
            INPUT:
    Ay Numarasi:
            2
    Yil :
            2016
    OUTPUT :
    Subat 2016 29 Gundur.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ay : ");
        int ay = scan.nextInt();
        System.out.println("yil : ");
        int yil = scan.nextInt();

        switch (ay) {

            case 1:
                System.out.println("Ocak"  + yil + " 31 gündür");
                break;
            case 3:
                System.out.println("Mart"  + yil + " 31 gündür");
                break;
            case 5:
                System.out.println("Mayis"  + yil + " 31 gündür");
                break;
            case 7:
                System.out.println("Temmuz"  + yil + " 31 gündür");
                break;
            case 8:
                System.out.println("Ağustos"  + yil + " 31 gündür");
                break;
            case 10:
                System.out.println("Ekim"  + yil + " 31 gündür");
                break;
            case 12:
                System.out.println("Aralik"  + yil + " 31 gündür");
                break;

            case 4:
                System.out.println("Nisan"  + yil + " 30 gündür");
                break;
            case 6:
                System.out.println("Haziran"  + yil + " 30 gündür");
                break;
            case 9:
                System.out.println("eylül"  + yil + " 30 gündür");
                break;
            case 11:
                System.out.println("Kasim"  + yil + " 30 gündür");
                break;
            case 2:
                int artikYilMi = yil % 4;
                if (artikYilMi == 0) {
                    System.out.println(ay + " " + yil + " 29 gündür ");
                } else {
                    System.out.println(ay + " " + yil + " 28 gündür ");

                }
                break;
        }
    }
}
