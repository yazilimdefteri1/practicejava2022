package practice_basic_day04;

import java.util.Arrays;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int[][] arr1 = {{10, 9, 8}, {3, 5, 2}, {55, -37, 15}, {-22, 11, 333}};
        int enKucukSayi = 0;
        int enBuyukSayi = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr1[i][j] < enKucukSayi) {
                    enKucukSayi = arr1[i][j];
                }
            }
        }
        System.out.println("En Kucuk Sayi = " + enKucukSayi);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr1[i][j] > enBuyukSayi) {
                    enBuyukSayi = arr1[i][j];
                }
            }
        }
        System.out.println("En Buyuk Sayi = " + enBuyukSayi);
    }
}
