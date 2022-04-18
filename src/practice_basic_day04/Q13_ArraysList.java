package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q13_ArraysList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç tane buyuk sayi istiyorsunuz : ");
        int gsSayi= scan.nextInt();

        int arr[]={1,2,3,4,5,6,7,8};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            list.add(arr[i]);
        }
        Integer sayi=0;

        for (int i = 1; i <= gsSayi ; i++) {
            sayi=0;
        for (int j = 0; j <list.size() ; j++) {
            if( list.get(j) > sayi){
                sayi=list.get(j);
            }
        }
            System.out.println( i+ ". Buyuk sayi = " + sayi);
            list.remove(sayi);

        }

    }

}
