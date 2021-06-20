/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_23;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_23 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Sayı giriniz... : ");
        int s = k.nextInt();
        double top=0.0;
        for (double i = 1; i <= s; i++) {
            top+=(1/i);
        }
        System.out.println("Sonuç : "+top);
    }
}
