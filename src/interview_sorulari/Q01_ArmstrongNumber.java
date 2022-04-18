package interview_sorulari;

import java.util.Scanner;

public class Q01_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

    // BAŞLA
    public static void main(String[] args) {
// İNPUT SAYİ İSTE
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 3 basamakli bir sayi giriniz..  : ");
        int sayi = scan.nextInt();
        int kontrol=sayi;
        int kup = 1;
        int toplam = 0;
        // DÖNGÜ
        while (sayi < 100 || sayi > 999) {
            //WHİLE ( GİRİLEN SAYİ 3 BASMAK DEĞİLSE}
            System.out.print("Lutfen 3 basamakli bir sayi giriniz..  : ");
            sayi = scan.nextInt();

        }
        //DÖNGÜ  FOR 3 SEFER DÖNECEK
        for (int i = 1; i <= 3; i++) {
            //İŞLEM      SAYİ MODULUS YAPACAZ  A= 123%10=3  123

            kup = sayi % 10;
            // TOPLAM+= A*A*A
            toplam += kup * kup * kup;

            //SAYİ/10
            sayi = sayi / 10;

        }
        // EGER  TOPLAM= SAYİ İSE SAYİ AMSTROMNG

        if (toplam==kontrol) {

            System.out.println("Bu sayi amstrong'dur.. : " + toplam);
        }
        // DEĞİLSE DEĞİLDİR.*/

        else {
            System.out.println("sayi amstrong degildir .. :" + toplam);
        }




    }
}




