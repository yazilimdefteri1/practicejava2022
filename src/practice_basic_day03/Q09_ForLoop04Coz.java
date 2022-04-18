package practice_basic_day03;

import java.util.Scanner;

public class Q09_ForLoop04Coz {
    public static void main(String[] args) {


    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
 değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
 Sesli harfler: a,e,i,o,u

 Test Data:
 a
 Beklenen Çıktı:
 a harfi sesli harfdir.

 Test Data:
 d
 Beklenen Çıktı:
 d harfi sesiz harftir.

 Test Data:
 we  yada  %

 Beklenen Çıktı:
 Yanlis karakter girdiniz!

  */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz = ");
        String harf=scan.nextLine();
        String sesliHarf="aeoiu";
        boolean sonuc=false;
        while(harf.length()>1){
            System.out.print("Harf olamayn veya fazla karakter giirdiniz. Lutfen bir harf giriniz = ");
            harf=scan.nextLine();}
            for (int i = 0; i <sesliHarf.length() ; i++) {
                if (harf.equals(sesliHarf.substring(i,i+1))){
                   sonuc=true;
                  }
            }
            if (sonuc==true){
                System.out.println(harf + " sesli harftir");
            } else{
                System.out.println(harf + " sessiz harftir");
            }

           }
}
