package practice_basic_day03;

import java.util.Scanner;

public class Q04_MethodCreation04Coz {
    public static void main(String[] args) {


        /*
         * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
         * toplamini dondursun.
         *
         * Ornek
         * input : ade1r4d3
         * output : 8
         *
         * Ipucu:
         *     Character.isDigit()
         *     Integer.valueOf()
         */
        /*

		Bilgilendirme:

		    String  para1 ="1900";
	        String  para2 = "2500";
	        System.out.println(para1 + para2); //19002500

	        System.out.println(Integer.valueOf(para1)+ Integer.valueOf(para2));

	        int num1= 100;
	        int num2 = 200;

	        System.out.println(String.valueOf(num1)+String.valueOf(num2));

	        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir metin giriniz = ");
        String metin = scan.nextLine();
        metinIcındeSayiTopla(metin);
    }
    private static void metinIcındeSayiTopla(String metin) {
        int topla = 0;
        metin = metin.replaceAll("[^\\d]", "");
        for (int i = 0; i < metin.length(); i++) {

            // if(Character.isDigit(metin.charAt(i))){
            //if(metin.charAt(i)>='0' && metin.charAt(i)<='9' ){
            topla += Integer.parseInt(metin.substring(i, i + 1));

        }
        System.out.println("Metin icersindeki sayilarin toplami = " + topla);
    }
}
