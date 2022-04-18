package practice_basic_day03;

import java.util.Scanner;

public class Q03_MethodCreation03Coz {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen cm olarak sayi giriniz = ");
        double cm= scan.nextInt();
        donusturMetre(cm);
        System.out.println(donusturMetre(cm));
    }

    public static String donusturMetre(double cm) {
        double metre=cm/100;
        double kMetre=cm/100000;
        String sonuc = "metre " + metre + " kilometre " + kMetre;
        return (sonuc);
    }
}