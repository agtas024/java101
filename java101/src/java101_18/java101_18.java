/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_18;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_18 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int topC = 0, topD = 0;
        for (;;) {
            System.out.print("Sayı giriniz... : ");
            int x = k.nextInt();
            if (x % 2 != 1) {
                topC += x;
                if (x % 4 == 0) {
                    topD += x;
                }
            } else {
                System.out.println("Çift sayılar toplamı : " + topC);
                System.out.println("Dördün katı sayıların toplamı : " + topD);
                break;
            }
        }

    }
}
