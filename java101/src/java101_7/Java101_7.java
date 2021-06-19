package java101_7;

import java.util.Scanner;

public class Java101_7 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlıcan = 5.00;
        System.out.print("Armut kaç kg ? :");
        int kg0 = k.nextInt();
        System.out.print("Elma kaç kg ? :");
        int kg1 = k.nextInt();
        System.out.print("Domates kaç kg ? :");
        int kg2 = k.nextInt();
        System.out.print("Muz kaç kg ? :");
        int kg3 = k.nextInt();
        System.out.print("Patlıcan kaç kg ? :");
        int kg4 = k.nextInt();
        double tutar = Armut * kg0 + Elma * kg1 + Domates * kg2 + Muz * kg3 + Patlıcan * kg4;
        System.out.println("Toplam Tutar : " + tutar);
    }

}
