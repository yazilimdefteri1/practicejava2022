package interview_sorulari;

import java.util.Scanner;

public class P03_HackerDili {
    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen cumleyi giriniz : ");
        String str = scan.nextLine().toLowerCase();

        HackerDili(str);
    }

    private static void HackerDili(String str) {

        String arr[] = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i + 1);
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            if (arr[i].contains("a")) {
                arr[i] = "5";
            } else if (arr[i].contains("a")) {
                arr[i] = "4";
            } else if (arr[i].contains("e")) {
                arr[i] = "3";
            } else if (arr[i].contains("i")) {
                arr[i] = "2";
            } else if (arr[i].contains("o")) {
                arr[i] = "1";
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}
