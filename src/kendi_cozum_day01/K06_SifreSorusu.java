package kendi_cozum_day01;

import java.util.Scanner;

public class K06_SifreSorusu {
    public static void main(String[] args) {
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

        Scanner scan=new Scanner(System.in);
         String sifre;
        int khk=0;
        int bhk=0;
        int ohk=0;

        do {
            System.out.print("Lutfen sifre giriniz = ");
            sifre = scan.nextLine();
            for (int i = 0; i < sifre.length(); i++) {
                if (sifre.charAt(i) >= ('a') && sifre.charAt(i) <= ('z')) {
                    khk++;//2
                }
                if (sifre.charAt(i) >= ('A') && sifre.charAt(i) <= ('Z')) {
                    bhk++;//2
                }
                if (sifre.charAt(i) >= 33 && sifre.charAt(i) <= 64) {
                    ohk++;//1
                }
            }
            if (khk < 1) {
                System.out.println("Sifre kucuk harf icermelidir");
            }
            if (bhk < 1) {
                System.out.println("Sifre BUYUK HARF icermelidir");
            }
            if (ohk < 1) {
                System.out.println("Sifre ozel karakter icermelidir");
            }
            if (sifre.length() < 8) {
                System.out.println("Sifre en az 8 karakter olmalidir.");
            }
        } while(sifre.length()<8 || khk<1 || bhk<1 || ohk<1);
                System.out.println("Sifreniz basariyla kaydedilmiştir.");

    }
}
