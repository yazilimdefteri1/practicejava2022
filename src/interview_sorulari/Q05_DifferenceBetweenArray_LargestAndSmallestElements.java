package interview_sorulari;

import java.util.Arrays;
import java.util.Scanner;



public class Q05_DifferenceBetweenArray_LargestAndSmallestElements {
  public static Scanner scan=new Scanner(System.in);
  static  int elemanSayi;

    static int fark=0;
    /*
Create a function that takes an array and the difference between the largest
and the smallest numbers.
Ask user to enter array elements.
   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/
    public static void main(String[] args) {
        System.out.println(" kaç eleman girmek  istiyorunuz : ");
        elemanSayi=scan.nextInt();
        int[] arr = new int[elemanSayi];

        arraysFark(arr);
    }
    public static void arraysFark(int[] arr) {

         for (int i = 0; i <elemanSayi; i++) {
            System.out.print("lutfen array'in " + (i+1) + ". elmanini giriniz : ");
            arr[i]=scan.nextInt();

        }
        Arrays.sort(arr);
        fark=arr[elemanSayi-1]-arr[0];

        System.out.println(" En büüyk elman ile en kücük eleman farki : " + fark);

    }
}
