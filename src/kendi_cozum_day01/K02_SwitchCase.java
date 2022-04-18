package kendi_cozum_day01;

public class K02_SwitchCase {
    public static void main(String[] args) {
         /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN) */

        String gun = "PazARTesi";
       String gunKucuk=gun.toLowerCase();


        switch (gunKucuk) {
            case ("pazartesi"):
            case ("sali"):
                String sonuc="Java dersi gunleri";
                System.out.println(sonuc);
                System.out.println(gunKucuk.substring(0,4));
                break;

            case ("persembe"):
            case ("cuma"):
                System.out.println("Selenyum Dersi gunleri");
                System.out.println(gun.substring(0,3));
                break;

            case ("carsamba"):
            case ("cumartesi"):
                System.out.println("SQL dersi gunleri");
                System.out.println(gun.substring(0,5));
                break;
            default:
                System.out.println("İzin gunu");
                System.out.println(gun);



        }
        String ad1="Ali Can";
        String ad2="  Ali CAN";
        System.out.println(ad1.equalsIgnoreCase(ad2));
        System.out.println((ad1.replaceAll("\\s","").equalsIgnoreCase(ad2.replaceAll("\\s",""))));

    }
}
