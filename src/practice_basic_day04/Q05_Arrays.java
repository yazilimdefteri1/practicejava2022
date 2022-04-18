package practice_basic_day04;

import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        int arr[]=new int[8];
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(" Lütfen Array'in " + (i+1) + ". Elemanini giriniz : ");
            int eleman= scan.nextInt();
            arr[i]=eleman;
        }
        int sayac=0;
        for (int j = 0; j < arr.length ; j++) {
            if(arr[j] % 3 == 0){
                sayac++;
            }
        }
        System.out.println(" Array'de 3'e bolunebilen " + sayac + " adet sayi vardir.");

    }
}
