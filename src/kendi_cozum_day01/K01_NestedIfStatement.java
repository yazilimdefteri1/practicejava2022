package kendi_cozum_day01;

public class K01_NestedIfStatement {
    public static void main(String[] args) {


       /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    int sayi = 123;

       String atama=(sayi%2==0 ? "Sayi cift":  "sayi tek" );
                                                     // (finalNotu=="B" ? "Basarili" :
                                                    //  (finalNotu=="C" ? "Ha Gayret" :
                                                    //  "Digerleri")) );
        System.out.println(atama);
    }
}
