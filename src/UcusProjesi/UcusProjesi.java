package UcusProjesi;

import java.util.Scanner;

public class UcusProjesi {


    public static void main(String[] args) {
         /* A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
            Bilet tarifesi:
            km birim fiyati : 0.10$
            yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
            12 ve 24 yas arasindaysa 10% indirim,
            65 yasindan buyukse 30% indirim,
            bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */

        double toplamUcret = 0;

        Scanner scan = new Scanner(System.in);
        Yolcu yeniyolcu = new Yolcu();

        System.out.println(" UCUS TARİFE PROGRAMİ.");
        System.out.print("İsim Soyisim : ");
        yeniyolcu.isimSoyisim = scan.nextLine();

        System.out.print("Hedef Sehir (B? / C? / D?) : ");
        yeniyolcu.hedefSehir = scan.next().substring(0, 1).toUpperCase();
        toplamUcret = Yolcu_MethodClass.toplamUcretSehirBul(yeniyolcu.hedefSehir, toplamUcret);

        System.out.print("Yasiniz : ");
        yeniyolcu.yas = scan.nextInt();
        yeniyolcu.yasKategori = Yolcu_MethodClass.yasKategoriBul(yeniyolcu.yas);

        toplamUcret = Yolcu_MethodClass.toplamUcretYasIndirimi(yeniyolcu.yasKategori, toplamUcret);

        System.out.println("Gidis Donus ise (1), Tek yon ise (2) tiklayiniz. ");
        yeniyolcu.gidisdonussecim = scan.nextInt();

        toplamUcret = (yeniyolcu.gidisdonussecim == 1) ? toplamUcret * 0.80 : toplamUcret;

        System.out.println("Toplam Ucret : " + toplamUcret);

    }
}
