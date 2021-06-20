package java101_8;

import java.util.Scanner;

public class java101_8 {

    public static void main(String[] args) {
        System.out.println("İlk sayı...");
        int n1 = new Scanner(System.in).nextInt();
        System.out.println("İkinci sayı...");
        int n2 = new Scanner(System.in).nextInt();
        System.out.println("1 toplama\n2 çıkarma\n3 çarpma\n4 bölme");
        int islem = new Scanner(System.in).nextInt();
        switch (islem) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println(n1 / n2);
                    break;
                } else {
                    System.out.println("0 a bölünemez");
                }

            default:
                System.out.println("gecersiz");
                break;
        }
    }
}
