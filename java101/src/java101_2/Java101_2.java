package java101_2;

import java.util.Scanner;

public class Java101_2 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Tutar giriniz...");
        double tutar = k.nextInt();
        double kdvlitutar = -1111, kdvtutari = -1111;
        if (tutar >= 0 && tutar <= 1000) {
            kdvlitutar = tutar * 18 / 100;
            kdvtutari = kdvlitutar;
            kdvlitutar += tutar;
        }
        if (tutar > 1000) {
            kdvlitutar = tutar * 8 / 100;
            kdvtutari = kdvlitutar;
            kdvlitutar += tutar;
        }
        System.out.println("KDV'siz fiyatÄ±: " + tutar);
        System.out.println("KDV'li fiyat: " + kdvlitutar);
        System.out.println("KDV tutarÄ±: " + kdvtutari);
    }

}
