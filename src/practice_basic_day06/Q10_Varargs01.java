package practice_basic_day06;

import java.util.Scanner;

public class Q10_Varargs01 {
   static int toplam=0;

    // istedigimiz kadar sayi girdigiimizde
    // toplamlari bize veren bir method yazalim...
    public static void main(String[] args) {
        // Not ; Var-args ---> Arguman cesitliligi
        // Var --->variety args--->arguments

        Scanner scan=new Scanner(System.in);
        int sayi=1;
        while(sayi>0){
            System.out.println("İstediginiz kadar sayi giriniz = "+ "\n toplama islemi icin en son 0' a basiniz");
            sayi= scan.nextInt();
        sayiToplama(sayi);
        }

       }
    public static void sayiToplama(int...sayi) {
        for (int each:sayi
             ) {
            toplam+=each;
        }
        System.out.println("toplam = " + toplam);

    }
}
