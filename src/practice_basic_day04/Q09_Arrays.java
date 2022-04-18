package practice_basic_day04;

public class Q09_Arrays {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int[][] arr1 = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
        int ciftToplam = 0;
        int tekToplam = 0;
        int tumToplam = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                 tumToplam += arr1[i][j];
            }
        }
        System.out.println("Arraydeki Tum Sayilarin Toplami = " + tumToplam);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] % 2 == 0) {
                    ciftToplam += arr1[i][j];
                }
            }
        }
        System.out.println("Arraydeki Cift Sayilarin Toplami = " + ciftToplam);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] % 2 != 0) {
                    tekToplam += arr1[i][j];
                }
            }
        }
        System.out.println("Arraydeki Tek Sayilarin Toplami = " + tekToplam);
    }
}
