package kendi_cozum_day01;

import java.util.Scanner;

public class K05_SifreKontrolAscii {
    public static Scanner scan = new Scanner(System.in);
    static int khk = 0;
    static int bhk = 0;
    static int uhk = 0;
    static int shk = 0;
    static int ohk = 0;

    /*  Kullanicidan bir sifre girmesini isteyin.
        Girilen sifreyi asagidaki sartlara gore kontrol edin
        ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
        ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.

  - Sifre kucuk harf icermelidir
  - Sifre buyuk harf icermelidir
  - Sifre ozel karakter icermelidir
  - Sifre en az 8 karakter olmalidir.
  */
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        String sifre ="";
        sifreKontrol(sifre);
    }

    public static void sifreKontrol(String sifre) {

        do {
            khk = 0;
            bhk = 0;
            uhk = 0;
            //shk = 0;
            ohk = 0;

            System.out.print("Lutfen sifrenizi girin = ");
            sifre = scan.nextLine();
            for (int i = 0; i < sifre.length(); i++) {

                if (sifre.charAt(i) >= 33 && sifre.charAt(i) <= 64){
                    ohk++;
                }
                if (sifre.charAt(i) >= 97 && sifre.charAt(i) <= 122) {
                    khk++;
                }
                if (sifre.charAt(i) >= 65 && sifre.charAt(i) <= 90){
                    bhk++;
                }
                //if (sifre.charAt(i) >= ('0') && sifre.charAt(i) <= ('9')){
                //    shk++;
               // }

            }

            if (ohk < 1) {
                System.out.println("Sifre ozel karakter icermemektedir");
            }
            if (khk < 1) {
                System.out.println("Sifre kucuk harf icermemektedir");
            }
            if (bhk < 1) {
                System.out.println("Sifre BUYUK HARF icermemektedir");
            }
            //if (shk < 1) {
            //    System.out.println("Sifre sayi icermemektedir");
           // }
            if (sifre.length() <8) {
                System.out.println("Sifre 8 karakterden az olmamalidir");
            }

        } while (khk<1 || bhk<1 || ohk<1 || sifre.length()<8);

        System.out.println("Sifreniz basariyla kaydedilmiştir.");
    }
}
