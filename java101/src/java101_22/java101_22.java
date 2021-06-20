/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_22;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_22 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Sayı giriniz... : ");
        int s = k.nextInt();
        String str = Integer.toString(s);
        int d[] = new int[str.length()];
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.parseInt(str.charAt(i) + "");
        }
        int top = 0;
        for (int i = 0; i < d.length; i++) {
            top += d[i];
        }
        System.out.println("Basamaklar toplamı : " + top);
    }
}
