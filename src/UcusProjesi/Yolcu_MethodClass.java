package UcusProjesi;

public class Yolcu_MethodClass {
    static int mesafeAB = 500;
    static int mesafeAC = 700;
    static int mesafeAD = 900;
    
    public static String yasKategoriBul(int yas) {
        String yasKategori = "";
        if (yas <= 12) yasKategori = "cocuk";
        else if (yas <= 24) yasKategori = "genc";
        else if (yas >= 65) yasKategori = "yasli";
        return yasKategori;
    }

    public static double toplamUcretSehirBul(String hedefSehir, double toplamUcret) {
        switch (hedefSehir) {
            case "B": {
                toplamUcret = mesafeAB * 0.10; break;
            }
            case "C": {
                toplamUcret = mesafeAC * 0.10; break;
            }
            case "D": {
                toplamUcret = mesafeAD * 0.10; break;
            }
            default: break;
        }
        return toplamUcret;
    }

    public static double toplamUcretYasIndirimi(String yasKategori, double toplamUcret) {
        switch (yasKategori) {
            case "cocuk": {
                toplamUcret = toplamUcret * 0.5; break;
            }
            case "genc": {
                toplamUcret = toplamUcret * 0.9; break;
            }
            case "yasli": {
                toplamUcret = mesafeAD * 0.70; break;
            }
            default: break;
        }
        return toplamUcret;
    }


}
