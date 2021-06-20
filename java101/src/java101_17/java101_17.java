/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_17;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_17 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Sayıyı giriniz... : ");
        double x = k.nextInt();
        double sayac = 0;
        double toplam = 0;
        for (double i = 1; i <= x; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam+=i;
                sayac++;
            }
        }
        System.out.println("Sonuç : "+toplam/sayac);
    }
}
