package java101_6;

import java.util.Scanner;

public class Java101_6 {

    public static void main(String[] args) {
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println();
        System.out.print("Lütfen kilonuzu giriniz : ");
        double b = new Scanner(System.in).nextDouble();
        System.out.println();
        System.out.println("Vücut Kitle İndeksiniz : " + b / (a * a));
    }

}
