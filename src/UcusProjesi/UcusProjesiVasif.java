package UcusProjesi;
import java.util.Scanner;
public class UcusProjesiVasif {

  static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("***** HOŞGELDİNİZ *****\n");
            System.out.println("Uçuş bilgilerinizi giriniz.");
            System.out.print("Nereden: ");
            String nereden = scan.next().toUpperCase();

            System.out.print("Nereye: ");
            String nereye = scan.next().toUpperCase();
            boolean nereyeKontrol = nereye.equals("B") || nereye.equals("C") || nereye.equals("D");
            while (!nereyeKontrol) {
                System.out.println("Müsait olan noktalar: B, C, D\nTekrar deneyiniz.");
                System.out.print("Nereye: ");
                nereye = scan.next().toUpperCase();
                if (nereye.equals("B") || nereye.equals("C") || nereye.equals("D")) {
                    nereyeKontrol = true;
                }
            }

            System.out.print("Tek yön için >> 1 , Çift yön için >> 2: ");
            String yon = scan.next();
            boolean yonKontrol = yon.equals("1") || yon.equals("2");
            while (!yonKontrol) {
                System.out.println("Hatalı seçim yaptınız. Lütfen tekrar deneyiniz.");
                System.out.print("Tek yön için >> 1 , Çift yön için >> 2: ");
                yon = scan.next();
                if (yon.equals("1") || yon.equals("2")) {
                    yonKontrol = true;
                }
            }

            System.out.print("Bagaj istiyor musunuz? Evet için >> 1 , Hayır için >> 2: ");
            String bagaj = scan.next();
            boolean bagajKontrol = bagaj.equals("1") || bagaj.equals("2");
            while (!bagajKontrol) {
                System.out.println("Hatalı seçim yaptınız. Lütfen tekrar deneyiniz.");
                System.out.print("Bagaj istiyor musunuz? Evet için >> 1 , Hayır için >> 2: ");
                bagaj = scan.next();
                if (bagaj.equals("1") || bagaj.equals("2")) {
                    bagajKontrol = true;
                }
            }
            System.out.print("Yaşınız: ");
            int age = scan.nextInt();

            int km = 0;

            if (nereden.equals("A") && nereye.equals("B")) {
                km = 500;
            } else if (nereden.equals("A") && nereye.equals("C")) {
                km = 700;
            } else if (nereden.equals("A")) {
                km = 900;
            }

            double fiyat = km * 0.1;

            if (yon.equals("1")) {
                if (bagaj.equals("2")) {
                    System.out.println("\nTutar: " + fiyat + "$");
                } else {
                    fiyat += 30;
                    System.out.println("\nTutar: " + fiyat + "$");
                }
            } else {
                fiyat *= 2;
                if (bagaj.equals("2")) {
                    System.out.println("\nTutar: " + fiyat + "$");
                } else {
                    fiyat += 60;
                    System.out.println("\nTutar: " + fiyat + "$");
                }
            }
            if (age < 12 && age > 0) {
                fiyat /= 2;
                System.out.println("Yaştan dolayı %50 indirim uygulandı");
                if (yon.equals("2")) {
                    fiyat *= 0.8;
                    System.out.println("Çift yönlü bilet için %20 indirim uygulandı");
                }
            } else if (age < 24) {
                fiyat *= 0.9;
                System.out.println("Yaştan dolayı %10 indirim uygulandı");
                if (yon.equals("2")) {
                    fiyat *= 0.8;
                    System.out.println("Çift yönlü bilet için %20 indirim uygulandı");
                }
            } else if (age > 65) {
                System.out.println("Yaştan dolayı %30 indirim uyglandı");
                fiyat *= 0.7;
                if (yon.equals("2")) {
                    fiyat *= 0.8;
                    System.out.println("Çift yönlü bilet için %20 indirim uygulandı");
                }
            }
            if (bagaj.equals("1")) {
                System.out.println(nereden + " şehrinden " + nereye + " şehrine " + yon + " yön bagajlı bilet\n" +
                        "Son tutar: " + fiyat + "$");
            } else System.out.println(nereden + " şehrinden " + nereye + " şehrine " + yon + " yön bagajsız bilet\n" +
                    "Son tutar: " + fiyat + "$");

            String name = "";
            String surname = "";
            String passport = "";

            System.out.print("\nDevam etmek için >> 1, İptal etmek için >> 2: ");
            String karar = scan.next();
            boolean kararKontrol = karar.equals("1") || karar.equals("2");
            while (!kararKontrol) {
                System.out.println("Hatalı seçim yaptınız. Lütfen tekrar deneyiniz.");
                System.out.print("Devam etmek için >> 1, İptal etmek için >> 2: ");
                karar = scan.next();
                if (karar.equals("1") || karar.equals("2")) {
                    kararKontrol = true;
                }
            }
            if (karar.equals("1")) {
                scan.nextLine();
                System.out.print("Adınız: ");
                name = scan.nextLine().toUpperCase();
                System.out.print("Soyadınız: ");
                surname = scan.nextLine().toUpperCase();
                System.out.print("Pasaport numaranız: ");
                passport = scan.next().toUpperCase();
            } else {
                System.out.println("Hoşçakalın... yine bekleriz.");
                System.exit(0);
            }

            if (bagaj.equals("1")) {
                System.out.println("\n" + nereden + " şehrinden " + nereye + " şehrine\n" +
                        "Bagaj hakkı 23 kg\n" +
                        name + " " + surname + " " + passport);
            } else {
                System.out.println("\n" + nereden + " şehrinden " + nereye + " şehrine\n" +
                        name + " " + surname + " " + passport);
            }
            System.out.print("\nBilgileri kontrol ettikten sonra" +
                    "\nOnaylıyorsanız >> 1 , Değişiklik için >> 2: ");
            String onay = scan.next();
            boolean onayKontrol = onay.equals("1") || onay.equals("2");
            while (!onayKontrol) {
                System.out.println("Hatalı seçim yaptınız. Lütfen tekrar deneyiniz.");
                System.out.print("Bilgileri kontrol ettikten sonra" +
                        "\nOnaylıyorsanız >> 1 , Değişiklik için >> 2: ");
                onay = scan.next();
                if (onay.equals("1") || onay.equals("2")) {
                    onayKontrol = true;
                }
            }
            if (onay.equals("1")) {
                System.out.println("\n"+name + " " + surname + " biletiniz başarıyla alındı.\n" +
                        "Bizi tercih ettiğinizi için teşekkür ederiz.\n" +
                        "İyi uçuşlar dileriz.");
            } else {
                System.out.println("\nBilgi güncelleme sayfamız bakım aşamasındadır.\n" +
                        "En kısa sürede hizmetinize sunulacaktır.");
            }
        }
    }

