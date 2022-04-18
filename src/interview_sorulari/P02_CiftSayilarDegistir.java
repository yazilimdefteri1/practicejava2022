package interview_sorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P02_CiftSayilarDegistir {
    // int array list oluşturun 10 elemandan oluşmalı
// random ekle isinde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemaının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        RandoEkle(list);
    }

    private static void RandoEkle(List<Integer> list) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20));
            // double veri tipine sahip olan Math.Random class'i hata verdiginden
            // integer' a casting yaptik
        }
        System.out.println("Random liste : " + list);
        int sayac=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                sayac++;
                list.set(i, 111);
            }
        }
        if(sayac==0) {
            System.out.println("Listede Cift Sayi Yoktur");
        }
        System.out.println("111'ler eklendikten sonra Random liste : " + list);

    }

}
