package kendi_cozum_day01;

import java.util.Scanner;

public class K03_BesYuzeKadarTopla {

    public static void main(String[] args) {
        //Kullanicidan toplamak icin sayi isteyin
        // ve toplam 500’e ulasincaya kadar devam istemeyi ettirin.
        // Toplam 500’e ulastiginda veya gectiginde toplami
        // ve kac sayi girildigini yazdirin
        Scanner scanner = new Scanner(System.in);

        int sayi;
        int sayac=0;
        int toplam=0;

       do{
            System.out.print("Lutfen toplanacak sayiyi girin = ");
            sayi=scanner.nextInt();
            toplam+=sayi;
           sayac++;

        }while(toplam<500);
        System.out.println("Sayilarin toplami 500'u gecti = "+ toplam);
        System.out.println("Toplam 500 olana kadar "+sayac+" sayi girdiniz");
    }
}
