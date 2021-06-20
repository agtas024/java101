/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_12;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_12 {

    public static void main(String[] args) {
        System.out.println("Sayıları giriniz...");
        Scanner k = new Scanner(System.in);
        int temp;
        int[] d = new int[3];

        for (int i = 0; i < 3; i++) {
            d[i] = k.nextInt();
        }
        System.out.println("Dizinin kucukten buyuge dogru sıralanmıs hali:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (d[j] < d[i]) {
                    temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Dizinin " + (i + 1) + ". elemanını : " + d[i]);
        }
    }
}
