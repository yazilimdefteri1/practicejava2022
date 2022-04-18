package practice_basic_day04;

import java.util.Arrays;

public class Q02_Arrays {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
        double toplam = 0;
        double ortalama = 0;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        ortalama = toplam / arr.length;
        System.out.println(" Ortalama = " + ortalama);
        System.out.print(" Ortalamadan büyük sayilar : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ortalama) {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
