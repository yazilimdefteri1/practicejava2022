package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q11_ArraysList {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        Random random = new Random();
        List<String> kullaniciList = new ArrayList<>();
        kullaniciList.add("ayhan");
        kullaniciList.add("ayhan1");
        kullaniciList.add("ayhan2");
        kullaniciList.add("ayhan3");
        kullaniciList.add("ayhan4");
        kullaniciList.add("ayhan5");

        // 1. adim
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Kullanici adi giriniz : ");
        String kullanici = scan.nextLine();
        // 2. adim
        kullanici.replaceAll(" ", "");

        // 3. adim

        boolean kontrol = true;
        kontrol = kullaniciList.contains(kullanici);
        if (kontrol != true) {
            System.out.println("Kullanici adiniz...: " + kullanici);
        } else {
            // 4. adim
            int ek = random.nextInt(200);          // Değişken Tanımlamaları ve Rastgele Değer Atama:
            System.out.println("Kullanici adiniz...: " + kullanici + ek);
        }
    }
}