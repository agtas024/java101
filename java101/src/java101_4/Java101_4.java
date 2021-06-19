package java101_4;

import java.util.Scanner;

public class Java101_4 {

    public static void main(String[] args) {
        System.out.println("KM giriniz...");
        double km = new Scanner(System.in).nextDouble();
        double tutar = 0;
        for (int i = 0; i < (int) km; i++) {
            tutar += 2.20;
        }
        tutar += 10;
        if (tutar <= 20) {
            System.out.println("Ödenecek tutar: " + 20);
        } else {
            System.out.println("Ödenecek tutae: " + tutar);
            
        }
    }

}
